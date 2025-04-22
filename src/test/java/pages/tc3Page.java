package pages;

import org.openqa.selenium.WebDriver;

public class tc3Page {

    private WebDriver driver;

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("http://example.com"); // Replace with actual URL
    }

    public void performAction3() {
        // Implement action 3
    }

    public String getResult() {
        // Return result from action 3
        return "Resultado obtenido";
    }
}