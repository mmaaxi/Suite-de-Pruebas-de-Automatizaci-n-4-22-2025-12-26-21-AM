package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc8Page {
    private WebDriver driver;

    private By action8Button = By.id("action8Button");
    private By expectedResult8 = By.id("resultadoEsperado8");

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.get("http://example.com");
    }

    public void performAction8() {
        driver.findElement(action8Button).click();
    }

    public boolean isResultadoEsperado8Visible() {
        return driver.findElement(expectedResult8).isDisplayed();
    }
}