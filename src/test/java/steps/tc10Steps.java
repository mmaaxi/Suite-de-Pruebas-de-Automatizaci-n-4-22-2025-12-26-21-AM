package steps;

import pages.tc10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc10Steps {

    tc10Page page = new tc10Page();

    @Given("I open the web application")
    public void iOpenTheWebApplication() {
        page.openApplication();
    }

    @When("I execute action 10")
    public void iExecuteAction10() {
        page.performAction10();
    }

    @Then("I should see the expected result 10")
    public void iShouldSeeTheExpectedResult10() {
        Assert.assertTrue(page.isResult10Displayed());
    }
}