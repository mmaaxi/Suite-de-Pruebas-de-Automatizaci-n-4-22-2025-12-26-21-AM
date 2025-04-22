package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc12Page {
    WebDriver driver;

    By action12Element = By.id("action12");
    By expectedResult12Element = By.id("result12");

    public tc12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction12() {
        driver.findElement(action12Element).click();
    }

    public boolean isExpectedResult12Displayed() {
        return driver.findElement(expectedResult12Element).isDisplayed();
    }
}