package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.security.PublicKey;
import java.util.List;

public class EmergencyContactsPage extends CommonMethods {

    @FindBy (xpath="//td[@class='emgContactName']/a")
    public List<WebElement> emergencyContacts;

    @FindBy (id="btnAddContact")
    public WebElement addEmergencyContactButton;

    @FindBy (id="emgcontacts_name")
    public WebElement nameField;

    @FindBy (id="emgcontacts_relationship")
    public WebElement relationshipField;

    @FindBy (id="emgcontacts_homePhone")
    public WebElement homeTelephoneField;

    @FindBy (id="emgcontacts_homePhone")
    public WebElement mobileField;

    @FindBy (id="emgcontacts_mobilePhone")
    public WebElement workTelephoneField;

    @FindBy (id="btnSaveEContact")
    public WebElement saveButton;

    public EmergencyContactsPage(){
        PageFactory.initElements(driver,this);
    }
}
