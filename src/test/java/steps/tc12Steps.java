package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc12Page;

public class tc12Steps {
    WebDriver driver;
    tc12Page page;

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        driver = new ChromeDriver();
        driver.get("http://example.com");
        page = new tc12Page(driver);
    }
    
    @When("the user executes action 12")
    public void theUserExecutesAction12() {
        page.performAction12();
    }
    
    @Then("the user should see the expected result 12")
    public void theUserShouldSeeTheExpectedResult12() {
        Assert.assertTrue(page.isExpectedResult12Displayed());
        driver.quit();
    }
}