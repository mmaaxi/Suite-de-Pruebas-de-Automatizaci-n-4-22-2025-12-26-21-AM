package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc3Page;
import static org.junit.Assert.assertEquals;

public class tc3Steps {

    private WebDriver driver;
    private tc3Page page;

    public tc3Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc3Page.class);
    }

    @Given("I have set up the application")
    public void setUpApplication() {
        page.openPage();
    }

    @When("I execute action 3")
    public void executeAction3() {
        page.performAction3();
    }

    @Then("I should see resultado esperado 3")
    public void verifyExpectedResult() {
        String result = page.getResult();
        assertEquals("Resultado esperado 3", result);
    }
}