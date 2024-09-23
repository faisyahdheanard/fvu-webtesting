package steps;

import config.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.teamMemberDetailPage;

public class teamMemberDetailStep extends base{
    teamMemberDetailPage TeamMemberDetailPage;

    @And("Click on the Sponsored Employees tab")
    public void clickOnTheSponsoredEmployeesTab() {
        TeamMemberDetailPage = new teamMemberDetailPage(driver);
        TeamMemberDetailPage.clickSponsoredEmployeeTab();
    }

    @And("Click the + Add Sponsored Employee button")
    public void clickTheAddSponsoredEmployeeButton() {
        TeamMemberDetailPage.clickAddSponsoredEmployeeButton();
    }

    @And("Choose the Per Person option")
    public void chooseThePerPersonOption() {
        TeamMemberDetailPage.choosePerPerson();
    }

    @And("Search for clients using the search bar")
    public void searchForClientsUsingTheSearchBar() {
    }

    @And("Type the intended client’s name {string}")
    public void typeTheIntendedClientSName(String clientsName) {
        TeamMemberDetailPage.inputClientsName(clientsName);
    }

    @And("Select the client name from the search results")
    public void selectTheClientNameFromTheSearchResults() throws InterruptedException {
        Thread.sleep(3000);
        TeamMemberDetailPage.selectTheTopNameClients();
    }

    @And("Click the Add button")
    public void clickTheAddButton() {
        TeamMemberDetailPage.clickAddButton();
    }

    @Then("Client {string} is successfully added as {string} with the correct data")
    public void clientIsSuccessfullyAddedAsWithTheCorrectData(String clientsName, String status) throws InterruptedException {
        Thread.sleep(5000);
        TeamMemberDetailPage.validateClientsNameAppears(clientsName);
        TeamMemberDetailPage.validateStatusAddedByAppears(status);
        TeamMemberDetailPage.deleteData();
    }
}
