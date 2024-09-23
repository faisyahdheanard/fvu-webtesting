package pages;

import helpers.assertions;
import locators.homeLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class homePage extends homeLocator {
    WebDriver driver;
    private assertions asserts;

    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.asserts = new assertions(driver);
    }

    public void alreadyOnTheHomePage() {
        asserts.shouldBeVisible(TEXT_DASHBOARD);
    }

    public void clickTeamMembersModule() {
        MODULE_TEAM_MEMBER.click();
    }

}
