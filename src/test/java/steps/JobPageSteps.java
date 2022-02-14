package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.JobPage;
import utils.CommonMethods;


public class JobPageSteps extends CommonMethods {

  @When("user clicks on Job sidebar")
    public void user_clicks_on_job_sidebar() {
    click(jobPage.Job);
    }
    @When("user clicks  edit button")
    public void user_clicks_edit_button() {
       click(jobPage.editButton);
    }


    @When("user edits job title employment status and job category of that employee")
    public void user_edits_job_title_employment_status_and_job_category_of_that_employee() {
       selectDropDownByText(jobPage.jobTitle, "API Tester");
       selectDropDownByText(jobPage.employmentStatus, "API Tester");
       selectDropDownByText(jobPage.jobCategory, "Technical Department");

    }
    @When("user edits joined date sub unit and location of that employee")
    public void user_edits_joined_date_sub_unit_and_location_of_that_employee() {
        click(jobPage.joinedDateCalendarIcon);
        selectDropDownByText(jobPage.joinedMonth, "Jan");
        selectDropDownByText(jobPage.joinedYear, "2017");
        pickDateFromCalendar(jobPage.joinedDateCalendar, "1");
        selectDropDownByText(jobPage.subUnit, "IT Support");
        selectDropDownByText(jobPage.location, "Cool Office");

    }
    @When("user edits contract start date and end date  of that employee")
    public void user_edits_contract_start_date_and_end_date_of_that_employee() {
        click(jobPage.contractStartDateCalendarIcon);
        selectDropDownByText(jobPage.contractStartMonth, "Jan");
        selectDropDownByText(jobPage.contractStartYear, "2017");
        pickDateFromCalendar(jobPage.contractStartDateCalendar, "3");

        click(jobPage.contractEndDateCalendarIcon);
        selectDropDownByText(jobPage.contractEndMonth, "Dec");
        selectDropDownByText(jobPage.contractEndYear, "2023");
        pickDateFromCalendar(jobPage.contractEndDateCalendar, "31");

    }
    @When("user edits contract detail of that employee")
    public void user_edits_contract_detail_of_that_employee() {
        if(jobPage.replaceCurrent.isDisplayed()) {
            radioButtonClick(jobPage.replaceCurrent);

            sendText(jobPage.contractDetails, "C:/Users/admin/Desktop/TestBros.jpg");
        }else {
            sendText(jobPage.contractDetails, "C:/Users/admin/Desktop/TestBros.jpg");

        }
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        click(jobPage.saveButton);

    }






}





