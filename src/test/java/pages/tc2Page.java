package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc2Page {
    WebDriver driver;
    
    By action2Button = By.id("action2Button");
    By result2Text = By.id("expectedResult2");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction2() {
        driver.findElement(action2Button).click();
    }

    public boolean isExpectedResult2Displayed() {
        return driver.findElement(result2Text).isDisplayed();
    }
}