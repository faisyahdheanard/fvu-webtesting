package pages;

import locators.loginLocator;
import helpers.assertions;
import data.loginData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends loginLocator {
    WebDriver driver;
    private assertions asserts;

    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.asserts = new assertions(driver);
    }

    public void navigateToTheLoginPage() {
        driver.get("https://qa-v1-env-simpul-66d5bbcff980.herokuapp.com/sign_in");
    }

    public void inputUsernameField() {
        FIELD_USERNAME.sendKeys(loginData.VALID_USERNAME);
    }

    public void inputPassword() {
        FIELD_PASSWORD.sendKeys(loginData.VALID_PASSWORD);
    }

    public void clickLoginButton() {
        BUTTON_LOGIN.click();
    }
}
