package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeePersonalDetailsPage extends CommonMethods {

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement firstName;
    @FindBy(id="personal_txtEmpMiddleName")
    public WebElement middleName;
    @FindBy(id="personal_txtEmpLastName")
    public WebElement lastName;
    @FindBy(id="personal_txtEmployeeId")
    public WebElement employeeId;
    @FindBy(id="personal_txtOtherID")
    public WebElement otherId;
    @FindBy(id="personal_txtLicenNo")
    public WebElement driverLicenseNo;
    @FindBy(id="personal_txtLicExpDate")
    public WebElement licenseExpiryDateField;
    @FindBy(xpath = "(//*[@class='ui-datepicker-trigger'])[1]")
    public WebElement licenseExpiryDateCalendarIcon;
    @FindBy(xpath = "//*[@class='ui-datepicker-month']")
    public WebElement licenseExpiryDateCalendarMonth;
    @FindBy(xpath = "//*[@class='ui-datepicker-year']")
    public WebElement licenseExpiryDateCalendarYear;
    @FindBy(xpath = "//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> licenseExpiryDateCalendarDays;
    @FindBy(id="personal_txtNICNo")
    public WebElement ssnNumber;
    @FindBy(id="personal_txtSINNo")
    public WebElement sinNumber;
    @FindBy(id="personal_optGender_1")
    public WebElement male;
    @FindBy(id="personal_optGender_2")
    public WebElement female;
    @FindBy(id="personal_cmbNation")
    public WebElement nationality;
    @FindBy(id="personal_cmbMarital")
    public WebElement maritialStatus;
    @FindBy(id="personal_DOB")
    public WebElement dateOfBirthField;
    @FindBy(xpath = "(//*[@class='ui-datepicker-trigger'])[2]")
    public WebElement dateOfBirthIcon;
    @FindBy(xpath="//*[@class='ui-datepicker-month']")
    public WebElement dateOfBirthCalendarMonth;
    @FindBy(xpath = "//*[@class='ui-datepicker-year']")
    public WebElement dateOfBirthCalendarYear;
    @FindBy(xpath = "//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> dateOfBirthCalendarDays;
    @FindBy(id="personal_txtEmpNickName")
    public WebElement nickName;
    @FindBy(id="personal_txtMilitarySer")
    public WebElement militaryService;
    @FindBy(id="personal_chkSmokeFlag")
    public WebElement smoker;
    @FindBy(id="btnSave")
    public WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"pdMainContainer\"]/div[1]/h1")
    public WebElement personalDetailsHeader;

    public EmployeePersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }

}
