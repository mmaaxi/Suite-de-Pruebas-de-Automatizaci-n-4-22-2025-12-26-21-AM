package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import pages.tc7Page;
import utils.DriverFactory;

public class tc7Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc7Page page = new tc7Page(driver);

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        page.navigateToMainPage();
    }

    @When("I execute action 7")
    public void i_execute_action_7() {
        page.performAction7();
    }

    @Then("I should see the result as expected 7")
    public void i_should_see_the_result_as_expected_7() {
        assertTrue(page.isExpectedResult7Displayed());
    }
}