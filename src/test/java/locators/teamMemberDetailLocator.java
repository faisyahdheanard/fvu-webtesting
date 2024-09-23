package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teamMemberDetailLocator {
    @FindBy(xpath = "//div[@id='app']//div[4]/p/b")
    protected WebElement TAB_SPONSORED_EMPLOYEE;

    @FindBy(css = "[class=\"btn btn-primary\"]")
    protected WebElement BUTTON_ADD_SPONSORED_EMPLOYEE;

    @FindBy(css = "[for=\"Per-Person\"]")
    protected WebElement CHOOSE_PER_PERSON;

    @FindBy(css = "[placeholder=\"Search Client(s)\"]")
    protected WebElement SEARCHBOX_CLIENTS;

    @FindBy(css = "[class=\"btn btn-primary mr-3\"]")
    protected WebElement BUTTON_ADD;

    @FindBy(css = "[class=\"w-25 px-3 py-3\"]")
    protected WebElement SELECT_TOP_CLIENTS;

    @FindBy(css = "[class=\"btn btn-danger\"]")
    protected WebElement BUTTON_X;

    @FindBy(css = "[class=\"btn btn-danger ml-2\"]")
    protected WebElement BUTTON_DELETE;

}
