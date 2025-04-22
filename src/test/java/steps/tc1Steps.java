package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc1Page;

import static org.junit.Assert.assertTrue;

public class tc1Steps {

    WebDriver driver;
    tc1Page page;

    @Given("estoy en la página inicial")
    public void estoyEnLaPaginaInicial() {
        driver = new ChromeDriver();
        page = new tc1Page(driver);
        driver.get("https://www.example.com");
    }

    @When("realizo la acción 1")
    public void realizoLaAccion1() {
        page.realizarAccion1();
    }

    @Then("debería ver el resultado esperado 1")
    public void deberiaVerElResultadoEsperado1() {
        assertTrue(page.verificarResultadoEsperado1());
        driver.quit();
    }
}