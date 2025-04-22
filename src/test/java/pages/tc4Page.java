package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc4Page {
    WebDriver driver;
    String startingPageUrl = "http://example.com/starting-page";

    By action4Element = By.id("action4");
    By expectedOutcome4Element = By.id("outcome4");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToStartingPage() {
        driver.get(startingPageUrl);
    }

    public void performAction4() {
        driver.findElement(action4Element).click();
    }

    public boolean validateOutcome4() {
        return driver.findElement(expectedOutcome4Element).isDisplayed();
    }
}