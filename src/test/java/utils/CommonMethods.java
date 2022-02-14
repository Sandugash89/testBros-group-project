package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.RadioButton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.PageInitializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static Alert alert;

    public static void openBrowserAndLaunchApplication() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        initializePageObjects();
    }

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
        return wait;
    }

    public static void waitForClickability(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static void selectDropDownByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void pickDateFromCalendar(List<WebElement> dates, String dateNumber) {
        for (WebElement date : dates) {
            String dateText = date.getText();
            if (dateText.equals(dateNumber)) {
                click(date);
            }
        }
    }

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    public static String getTimeStamp(String pattern){
        Date date =new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static byte[] takeScreenshot(String fileName){
        TakesScreenshot screenshot =(TakesScreenshot) driver;
        byte[] picBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH+fileName+" "
                    +getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return  picBytes;
    }
    public  static void radioButtonClick(WebElement element){
        boolean isDiplayed= element.isDisplayed();
        boolean isEnable= element.isEnabled();
        boolean isSelected= element.isSelected();
       
        if(isEnable){
            if(isSelected){
                element.click();
            }
            element.click();
        }
    }

    public static void alertAccept(WebElement element) {
        alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void alertDismiss(WebElement element){
        alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static void alertPrompt(String text, WebElement element){
        alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public static void closeBrowser(){
        driver.quit();
    }
}