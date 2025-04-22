package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc8Page;

public class tc8Steps {
    private WebDriver driver = new ChromeDriver();
    private tc8Page page = new tc8Page(driver);

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() {
        page.goToHomePage();
    }

    @When("^I perform action 8$")
    public void i_perform_action_8() {
        page.performAction8();
    }

    @Then("^I should see resultado esperado 8$")
    public void i_should_see_resultado_esperado_8() {
        Assert.assertTrue(page.isResultadoEsperado8Visible());
        driver.quit();
    }
}