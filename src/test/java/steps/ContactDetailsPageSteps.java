package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class ContactDetailsPageSteps extends CommonMethods {

    @When("user clicks on contact details sidebar")
    public void user_clicks_on_contact_details_sidebar() {
        click(contactDetailsPage.contactDetails);
    }

    @When("contact details page is displayed")
    public void contact_details_page_is_displayed() {
        Assert.assertTrue(contactDetailsPage.contactDeTailsHeader.getText().equalsIgnoreCase("Contact Details"));
    }
    @When("user clicks on edit button")
    public void user_clicks_on_edit_button() {
       click(contactDetailsPage.editBtn);
    }
    @When("user edits contact details of that employee")
    public void user_edits_contact_details_of_that_employee() {
        sendText(contactDetailsPage.adressStreet1, "Street1");
        sendText(contactDetailsPage.adressStreet2, "Street2");
        sendText(contactDetailsPage.city, "Istanbul");
        sendText(contactDetailsPage.zipPostalCode, "34200");
        selectDropDownByText(contactDetailsPage.country, "Turkey");
        sendText(contactDetailsPage.stateProvince, "Marmara");
        sendText(contactDetailsPage.homeTelephone, "05554446666");
        sendText(contactDetailsPage.mobile, "05558884444");
        sendText(contactDetailsPage.workTelephone, "0555666444");
        sendText(contactDetailsPage.workEmail, "abcdef@gmail.com");
        sendText(contactDetailsPage.otherEmail, "zsder@gmail.com");

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(contactDetailsPage.saveBtn);
    }
    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        click(contactDetailsPage.addBtn);
    }
    @When("user add attachment to that employee")
    public void user_add_attachment_to_that_employee() {
        sendText(contactDetailsPage.selectFile, "C:\\Users\\cat\\OneDrive\\Resimler\\black_eagle.jpg");
        sendText(contactDetailsPage.comment, "Just for the comment");
    }
    @When("user clicks on upload button")
    public void user_clicks_on_upload_button() {
        click(contactDetailsPage.uploadBtn);
    }
    @Then("user contact details is displayed")
    public void user_contact_details_is_displayed() {
        Assert.assertTrue(contactDetailsPage.adressStreet1.getAttribute("value").equalsIgnoreCase("Street1"));
    }

}
