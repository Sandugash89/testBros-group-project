package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationsPage extends CommonMethods {
 @FindBy(xpath = "//*[@id='addSkill']")
    public WebElement addSkillBTN;

 @FindBy(xpath = "//*[@id='skill_code']")
    public WebElement skillDropdown;

 @FindBy(xpath = "//*[@id='skill_years_of_exp']")
    public WebElement yearsOfExperience;

 @FindBy(xpath = "//*[@id='skill_comments']")
    public WebElement skillComments;

 @FindBy(xpath = "//*[@id='btnSkillSave']")
    public WebElement saveSkillBTN;

 @FindBy(xpath = "//*[@id='btnSkillCancel']")
    public WebElement cansellSkillBTN;

 public QualificationsPage(){
     PageFactory.initElements(driver,this);
 }





}
