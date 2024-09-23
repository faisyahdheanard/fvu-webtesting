package pages;

import helpers.assertions;
import locators.teamMemberDetailLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class teamMemberDetailPage extends teamMemberDetailLocator {
    WebDriver driver;
    private assertions asserts;

    public teamMemberDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.asserts = new assertions(driver);
    }

    public void clickSponsoredEmployeeTab() {
        TAB_SPONSORED_EMPLOYEE.click();
    }

    public void clickAddSponsoredEmployeeButton() {
        BUTTON_ADD_SPONSORED_EMPLOYEE.click();
    }

    public void choosePerPerson() {
        CHOOSE_PER_PERSON.click();
    }

    public void inputClientsName(String clientsName) {
        SEARCHBOX_CLIENTS.sendKeys(clientsName);
    }

    public void selectTheTopNameClients() {
        SELECT_TOP_CLIENTS.click();
    }

    public void clickAddButton() {
        BUTTON_ADD.click();
    }

    public void validateClientsNameAppears(String clientsName) {
        By clientsNameLocator = By.xpath("//span[text()='" + clientsName + "']");
        WebElement clientsNameElement = driver.findElement(clientsNameLocator);
        asserts.shouldBeVisible(clientsNameElement);
    }

    public void validateStatusAddedByAppears(String status) {
        By statusAddedByLocator = By.xpath("//span[text()='" + status + "']");
        WebElement statusAddedByElement = driver.findElement(statusAddedByLocator);
        asserts.shouldBeVisible(statusAddedByElement);
    }

    public void deleteData() {
        BUTTON_X.click();
        BUTTON_DELETE.click();
    }
}
