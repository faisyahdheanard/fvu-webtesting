package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homeLocator {
    @FindBy(css = "[class=\"h5 mb-0 mr-2\"]")
    public WebElement TEXT_DASHBOARD;

    @FindBy(css = "div[class$='team-member-icon']")
    public WebElement MODULE_TEAM_MEMBER;

}
