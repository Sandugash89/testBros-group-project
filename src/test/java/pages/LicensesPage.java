package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LicensesPage extends CommonMethods {


    @FindBy(xpath = "//input[@id='btnAdd']")
    public WebElement LicADDBtn;

    @FindBy(xpath = "//input[@id='btnDel']")
    public WebElement LicDelBtn;

    @FindBy(xpath = "//input[@id='license_name']")
    public WebElement NameField;

    @FindBy(xpath = "//input[@name='btnSave']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//input[@id='btnCancel']" )
    public WebElement CancelBtn;

    @FindBy(xpath = "//input[@id='checkAll']")
    public WebElement CheckAllBtn;

    public LicensesPage(){
        PageFactory.initElements(driver,this);
    }

}
