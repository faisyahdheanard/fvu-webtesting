package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class assertions {
    private WebDriverWait wait;

    public assertions(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebElement shouldBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}