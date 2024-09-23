package pages;


import helpers.assertions;
import locators.teamMembersLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class teamMembersPage extends teamMembersLocator {
    WebDriver driver;
    private assertions asserts;

    public teamMembersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.asserts = new assertions(driver);
    }

    public void alreadyOnTheTeamMembersPage() {
        asserts.shouldBeVisible(TEXT_TEAM_MEMBERS);
    }

    public void clickViewButton() {
        BUTTON_VIEW.click();
    }

}
