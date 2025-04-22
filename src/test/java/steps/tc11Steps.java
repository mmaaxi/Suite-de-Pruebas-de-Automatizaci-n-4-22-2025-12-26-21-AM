package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc11Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class tc11Steps {
    WebDriver driver;
    tc11Page page;

    public tc11Steps() {
        // Initialize the WebDriver
        // driver = new YourWebDriverInitialization();
        page = PageFactory.initElements(driver, tc11Page.class);
    }

    @Given("^I am on the tc11 page$")
    public void i_am_on_the_tc11_page() {
        page.navigateToPage();
    }

    @When("^I execute action 11$")
    public void i_execute_action_11() {
        page.performAction11();
    }

    @Then("^I should see the expected result 11$")
    public void i_should_see_the_expected_result_11() {
        assertTrue("Expected result 11 not visible", page.isExpectedResult11Visible());
    }
}