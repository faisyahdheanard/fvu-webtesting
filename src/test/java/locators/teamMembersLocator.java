package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teamMembersLocator {
    @FindBy(css = "[class=\"h5 mb-0 mr-2\"]")
    protected WebElement TEXT_TEAM_MEMBERS;

    @FindBy(xpath = "//div[@id='member-action-button-5']/div/a")
    protected WebElement BUTTON_VIEW;
}
