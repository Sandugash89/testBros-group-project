package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;


public class TerminateEmployment extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement PimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeListButton;

    @FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[3]/a")
    public WebElement SelectEmployee;

    @FindBy(xpath="//*[@id=\"sidenav\"]/li[6]/a")
    public WebElement JobButton;

    @FindBy(id="btnTerminateEmployement")
    public WebElement terminateEmployement;

    @FindBy(xpath="//*[@id=\"dialogConfirm\"]")
    public WebElement confirmButton;


    public TerminateEmployment(){

       PageFactory.initElements(driver,this);
    }

}
