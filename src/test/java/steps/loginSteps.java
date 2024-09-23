package steps;

import config.base;
import io.cucumber.java.en.Given;
import pages.homePage;
import pages.loginPage;

public class loginSteps extends base {
    loginPage LoginPage;
    homePage HomePage;

    @Given("Already logged in and on the Home page")
    public void alreadyLoggedInAndOnTheHomePage() {
        getDriver();
        LoginPage = new loginPage(driver);
        LoginPage.navigateToTheLoginPage();
        LoginPage.inputUsernameField();
        LoginPage.inputPassword();
        LoginPage.clickLoginButton();
        HomePage = new homePage(driver);
        HomePage.alreadyOnTheHomePage();
    }
}
