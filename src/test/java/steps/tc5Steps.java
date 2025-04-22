package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver;
    tc5Page tc5page;

    public tc5Steps(WebDriver driver) {
        this.driver = driver;
        tc5page = PageFactory.initElements(driver, tc5Page.class);
    }

    @Given("Estoy en la página inicial")
    public void estoy_en_la_página_inicial() {
        driver.get("http://urlpagina.com");
    }

    @When("Ejecuto acción 5")
    public void ejecuto_accion_5() {
        tc5page.realizarAccion5();
    }

    @Then("Debería ver el resultado esperado 5")
    public void deberia_ver_el_resultado_esperado_5() {
        tc5page.verificarResultado5();
    }
}