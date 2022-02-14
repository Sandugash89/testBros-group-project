package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DependentPage extends CommonMethods {
    @FindBy(xpath="//input[@id='btnAddDependent']")
    public WebElement Add;

    @FindBy(xpath = "//input[@id='delDependentBtn']")
    public WebElement Delete;

    @FindBy(xpath ="//input[@id='dependent_name']" )
    public WebElement DepName;

    @FindBy(xpath = "//select[@id='dependent_relationshipType']")
    public WebElement DepRelationship;

    @FindBy(xpath = "//input[@id='dependent_relationship']")
    public WebElement DepOtherRelationship;

    @FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
    public WebElement DepDOB;

    @FindBy(xpath = "//input[@name='btnSaveDependent']")
    public WebElement DepSaveBtn;

    @FindBy(xpath = "//input[@id='btnCancel']")
    public WebElement DepCancelBtn;

    @FindBy(xpath = "//input[@id='checkAll']")
    public WebElement DepCheckBox;

    @FindBy(xpath = "//input[@id='btnAddAttachment']")
    public WebElement AttachmentAdd;

    @FindBy(xpath = "//input[@id='ufile']")
    public WebElement AttachmentAddChooseFile;

    @FindBy(xpath = "//textarea[@name='txtAttDesc']")
    public WebElement CommentTextBox;

    @FindBy(xpath = "//input[@id='btnSaveAttachment']")
    public WebElement AddAttachUploadBtn;

    @FindBy(xpath = "//input[@id='cancelButton']")
    public WebElement AddAttachCancleBtn;

    public DependentPage(){
        PageFactory.initElements(driver,this);
    }
}
