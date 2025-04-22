package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc11Page {
    private WebDriver driver;

    @FindBy(id = "action11")
    private WebElement action11Button;

    @FindBy(id = "result11")
    private WebElement result11Element;

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("https://example.com/tc11"); // Replace with the actual URL
    }

    public void performAction11() {
        action11Button.click();
    }

    public boolean isExpectedResult11Visible() {
        return result11Element.isDisplayed();
    }
}