package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc9Page {

    private WebDriver driver;

    // Locators
    private By action9Button = By.id("action9Button");
    private By expectedOutcome9 = By.id("expectedOutcome9");

    public tc9Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage() {
        driver.get("url_of_the_page");
    }

    public void executeAction9() {
        WebElement button = driver.findElement(action9Button);
        button.click();
    }

    public boolean isExpectedOutcome9Displayed() {
        WebElement outcome = driver.findElement(expectedOutcome9);
        return outcome.isDisplayed();
    }
}