package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {
    @FindBy(linkText="Contact Details")
    public WebElement contactDetails;

    @FindBy(xpath = "//*[@id=\"contact-details\"]/div[2]/div[1]/h1")
    public WebElement contactDeTailsHeader;

    @FindBy(id="contact_street1")
    public WebElement adressStreet1;

    @FindBy(id="contact_street2")
    public WebElement adressStreet2;

    @FindBy(id="contact_city")
    public WebElement city;

    @FindBy(id="contact_province")
    public WebElement stateProvince;

    @FindBy(id="contact_emp_zipcode")
    public WebElement zipPostalCode;

    @FindBy(id="contact_country")
    public WebElement country;

    @FindBy(id="contact_emp_hm_telephone")
    public WebElement homeTelephone;

    @FindBy(id="contact_emp_mobile")
    public WebElement mobile;

    @FindBy(id="contact_emp_work_telephone")
    public WebElement workTelephone;

    @FindBy(id="contact_emp_work_email")
    public WebElement workEmail;

    @FindBy(id="contact_emp_oth_email")
    public WebElement otherEmail;

    @FindBy(xpath="//input[@value='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveBtn;

    @FindBy(id = "btnAddAttachment")
    public WebElement addBtn;

    @FindBy(id = "ufile")
    public WebElement selectFile;

    @FindBy(id = "txtAttDesc")
    public WebElement comment;

    @FindBy(xpath = "//input[@value='Upload']")
    public WebElement uploadBtn;

    @FindBy(id = "cancelButton")
    public WebElement cancelBtn;

    public ContactDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}