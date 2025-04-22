package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc7Page {

    WebDriver driver;

    By action7Selector = By.id("action7");
    By expectedResult7Selector = By.id("expectedResult7");

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMainPage() {
        driver.get("http://example.com/main");
    }

    public void performAction7() {
        driver.findElement(action7Selector).click();
    }

    public boolean isExpectedResult7Displayed() {
        return driver.findElement(expectedResult7Selector).isDisplayed();
    }
}