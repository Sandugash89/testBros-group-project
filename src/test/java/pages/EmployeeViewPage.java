package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import java.util.List;

public class EmployeeViewPage extends CommonMethods {

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement EmpName;

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement EmpId;

    @FindBy(xpath = "//select[@id='empsearch_employee_status']")
    public WebElement EmpStatus;

    @FindBy(xpath = "//select[@id='empsearch_termination']")
    public WebElement Include;

    @FindBy(xpath = "//input[@id='empsearch_supervisor_name']")
    public WebElement SupName;

    @FindBy(xpath = "//select[@id='empsearch_job_title']")
    public WebElement EmpJobTitle;

    @FindBy(xpath = "//select[@id='empsearch_sub_unit']")
    public WebElement SubUnit;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement SearchBtn;

    @FindBy(xpath = "//input[@id='resetBtn']")
    public WebElement Reset;

    @FindBy(xpath = "//input[@id='btnAdd']")
    public WebElement CheckBoxAddBtn;

    @FindBy(xpath = "//input[@id='btnDelete']")
    public WebElement CheckBoxDelBtn;

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    public WebElement CheckBox;

    @FindBy (xpath = "//*[@id='resultTable']/tbody/tr/td[2]/a")
    public List<WebElement> employees;

    @FindBy (xpath = "//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
    public WebElement firstEmployee;

    public EmployeeViewPage(){
        PageFactory.initElements(driver,this);
    }

}

