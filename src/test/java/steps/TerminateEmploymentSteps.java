package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TerminateEmployment;

public class TerminateEmploymentSteps extends TerminateEmployment {

    @When("user clicks on PIM Option")
    public void user_clicks_on_pim_option() {
       WebElement PimOption= driver.findElement(By.id("menu_pim_viewPimModule"));
       PimOption.click();
    }

    @When("user selects a specified Employee")
    public void user_selects_a_specified_employee() {
        WebElement SelectEmployee= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[3]/a"));
        SelectEmployee.click();
    }

    @When("user clicks on jobs")
    public void user_clicks_on_jobs() {
      WebElement JobButton= driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a"));
        JobButton.click();
    }

    @When("user clicks on Terminate Employment")
    public void user_clicks_on_terminate_employment() {
       WebElement terminateEmployement= driver.findElement(By.id("btnTerminateEmployement"));
        terminateEmployement.click();
    }

    @Then("user terminate specified Employee")
    public void user_terminate_specified_employee() {
        WebElement confirmButton= driver.findElement(By.xpath("//*[@id=\"dialogConfirm\"]"));
        confirmButton.click();

    }
}
