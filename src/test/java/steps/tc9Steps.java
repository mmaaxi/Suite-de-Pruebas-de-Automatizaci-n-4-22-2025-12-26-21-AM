package steps;

import pages.tc9Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc9Steps {

    tc9Page page;

    @Given("I am on the appropriate page to execute action 9")
    public void iAmOnThePageForAction9() {
        page = new tc9Page();
        page.navigateToPage();
    }

    @When("I perform action 9")
    public void iPerformAction9() {
        page.executeAction9();
    }

    @Then("I should see the expected outcome 9")
    public void iShouldSeeExpectedOutcome9() {
        assertTrue("Expected outcome 9 is not displayed", page.isExpectedOutcome9Displayed());
    }
}