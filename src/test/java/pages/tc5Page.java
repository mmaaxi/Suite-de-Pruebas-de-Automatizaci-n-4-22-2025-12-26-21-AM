package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc5Page {
    WebDriver driver;

    @FindBy(id = "action5Button")
    WebElement action5Button;

    @FindBy(id = "expectedResult5")
    WebElement expectedResult5;

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion5() {
        action5Button.click();
    }

    public void verificarResultado5() {
        if (!expectedResult5.isDisplayed()) {
            throw new AssertionError("El resultado esperado 5 no se muestra.");
        }
    }
}