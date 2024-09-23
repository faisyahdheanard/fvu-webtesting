package steps;

import config.base;
import io.cucumber.java.en.And;
import pages.homePage;
import pages.teamMembersPage;


public class homeSteps extends base {
    homePage HomePage;
    teamMembersPage TeamMembersPage;

    @And("Navigate to the Team Members page")
    public void navigateToTheTeamMembersPage() {
        HomePage = new homePage(driver);
        HomePage.clickTeamMembersModule();
        TeamMembersPage = new teamMembersPage(driver);
        TeamMembersPage.alreadyOnTheTeamMembersPage();
    }
}
