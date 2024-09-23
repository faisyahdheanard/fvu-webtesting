package steps;

import config.base;
import io.cucumber.java.en.When;
import pages.teamMembersPage;

public class teamMembersSteps extends base {
    teamMembersPage TeamMembersPage;

    @When("Click the View button from the team member list")
    public void clickTheViewButtonFromTheTeamMemberList() throws InterruptedException {
        TeamMembersPage = new teamMembersPage(driver);
        TeamMembersPage.clickViewButton();
    }
}
