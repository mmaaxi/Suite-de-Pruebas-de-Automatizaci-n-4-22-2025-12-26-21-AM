package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc10Page {

    WebDriver driver;

    public tc10Page() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public void openApplication() {
        driver.get("http://example.com"); // Replace with actual URL
    }

    public void performAction10() {
        WebElement actionButton = driver.findElement(By.id("action10Button")); // Replace with actual locator
        actionButton.click();
    }

    public boolean isResult10Displayed() {
        WebElement resultElement = driver.findElement(By.id("result10Element")); // Replace with actual locator
        return resultElement.isDisplayed();
    }
}