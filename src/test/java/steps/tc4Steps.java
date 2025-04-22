package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc4Page;

import static org.junit.Assert.assertTrue;

public class tc4Steps {
    WebDriver driver;
    tc4Page page;

    @Given("^I am on the starting page$")
    public void i_am_on_the_starting_page() {
        driver = new ChromeDriver();
        page = new tc4Page(driver);
        page.navigateToStartingPage();
    }

    @When("^I execute action 4$")
    public void i_execute_action_4() {
        page.performAction4();
    }

    @Then("^I should see the expected outcome 4$")
    public void i_should_see_the_expected_outcome_4() {
        assertTrue(page.validateOutcome4());
        driver.quit();
    }
}