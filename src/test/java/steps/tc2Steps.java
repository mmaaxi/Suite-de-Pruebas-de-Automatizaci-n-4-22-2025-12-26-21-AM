package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc2Page;

public class tc2Steps {
    WebDriver driver;
    tc2Page page;

    @Given("I am on the Action 2 page")
    public void i_am_on_the_action_2_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/action2");
        page = new tc2Page(driver);
    }

    @When("I execute action 2")
    public void i_execute_action_2() {
        page.performAction2();
    }

    @Then("I should see the expected result 2")
    public void i_should_see_the_expected_result_2() {
        Assert.assertTrue(page.isExpectedResult2Displayed());
        driver.quit();
    }
}