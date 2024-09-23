package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginLocator {
    @FindBy(css = "#user_login")
    protected WebElement FIELD_USERNAME;

    @FindBy(css = "#user_password")
    protected WebElement FIELD_PASSWORD;

    @FindBy(css = "#fast-visa-submit")
    protected WebElement BUTTON_LOGIN;

}
