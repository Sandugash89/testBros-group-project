package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeViewSteps extends CommonMethods {

    @When ("user clicks on an employee from list of employees")
    public void user_clicks_on_an_employee_from_list_of_employees(){
        click(employeeViewPage.firstEmployee);
    }

    @Then("user is navigated to employee view page")
    public void user_is_navigated_to_employee_personal_details(){
        Assert.assertTrue(employeePersonalDetailsPage.personalDetailsHeader.getText().equalsIgnoreCase("Personal Details"));
    }
}
