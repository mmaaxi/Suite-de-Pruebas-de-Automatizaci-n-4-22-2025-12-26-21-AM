package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc6Page {

    WebDriver driver;

    @FindBy(id = "action6Button")
    WebElement action6Button;

    @FindBy(id = "expectedResult6Label")
    WebElement expectedResult6Label;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToInitialPage() {
        driver.get("https://example.com/initial-page");
    }

    public void executeAction6() {
        action6Button.click();
    }

    public boolean isExpectedResult6() {
        return expectedResult6Label.isDisplayed();
    }
}