package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class JobPage extends CommonMethods {
    @FindBy(id="btnSave")
    public WebElement editButton;

    @FindBy(xpath="html/body/div/div/div/div/ul/li[6]/a")
    public WebElement Job;

    @FindBy(id ="job_job_title")
    public WebElement jobTitle;

    @FindBy(id="job_emp_status")
    public WebElement employmentStatus;

    @FindBy(id="job_eeo_category")
    public WebElement jobCategory;

    @FindBy(xpath="(//*[@class='ui-datepicker-trigger'])[1]")
    public WebElement joinedDateCalendarIcon;

    @FindBy(xpath="//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> joinedDateCalendar;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement joinedMonth;

    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement joinedYear;

    @FindBy(id="job_sub_unit")
    public WebElement subUnit;

    @FindBy(id="job_location")
    public WebElement location;

    @FindBy(xpath="(//*[@class='ui-datepicker-trigger'])[2]")
    public WebElement contractStartDateCalendarIcon;

    @FindBy(xpath="//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> contractStartDateCalendar;

    @FindBy(xpath="//*[@class='ui-datepicker-month']")
    public WebElement contractStartMonth;

    @FindBy(xpath="//*[@class='ui-datepicker-year']")
    public WebElement contractStartYear;

    @FindBy(xpath="(//*[@class='ui-datepicker-trigger'])[3]")
    public WebElement contractEndDateCalendarIcon;

    @FindBy(xpath="//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> contractEndDateCalendar;

    @FindBy(xpath="//*[@class='ui-datepicker-month']")
    public WebElement contractEndMonth;

    @FindBy(xpath="//*[@class='ui-datepicker-year']")
    public WebElement contractEndYear;

    @FindBy(id="job_contract_file")
    public WebElement contractDetails;

    @FindBy (id="btnTerminateEmployement")
    public WebElement terminateEmployement;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="job_contract_update_1")
    public WebElement keepCurrent;
    @FindBy(id="job_contract_update_2")
    public WebElement deleteCurrent;
    @FindBy(id="job_contract_update_3")
    public WebElement replaceCurrent;






    public JobPage(){
    PageFactory.initElements(driver, this);
    }





}
