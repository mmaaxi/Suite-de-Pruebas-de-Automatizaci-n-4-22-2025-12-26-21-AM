package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {

    WebDriver driver;
    By accion1Button = By.id("accion1-button");
    By resultado1Text = By.id("resultado1-text");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion1() {
        driver.findElement(accion1Button).click();
    }

    public boolean verificarResultadoEsperado1() {
        return driver.findElement(resultado1Text).isDisplayed();
    }
}