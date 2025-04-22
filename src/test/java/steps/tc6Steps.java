package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc6Page;

public class tc6Steps {

    tc6Page page = new tc6Page();

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("the user executes action 6")
    public void the_user_executes_action_6() {
        page.executeAction6();
    }

    @Then("the result should be expected result 6")
    public void the_result_should_be_expected_result_6() {
        Assert.assertTrue(page.isExpectedResult6());
    }
}