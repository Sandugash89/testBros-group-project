package steps;

import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

public class EmployeeListPageSteps extends CommonMethods {

    @When("user is logged in with valid admin credentials")
    public void user_is_logged_in_with_valid_admin_credentials() {
        loginPage.login(ConfigReader.getPropertyValue("username"), ConfigReader.getPropertyValue("password"));
    }

    @When("user navigates to employee list page")
    public void user_navigates_to_employee_list_page() {
        jsClick(dash.PimButton);
        click(dash.employeeListOption);
    }
}
