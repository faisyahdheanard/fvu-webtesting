Feature: Assign Sponsored Employee

  Background:
    Given Already logged in and on the Home page
    And Navigate to the Team Members page

  Scenario: User can manually add sponsored employees on a per-person basis.
    When Click the View button from the team member list
    And Click on the Sponsored Employees tab
    And Click the + Add Sponsored Employee button
    And Choose the Per Person option
    And Search for clients using the search bar
    And Type the intended client’s name "Aisha Abdi"
    And Select the client name from the search results
    And Click the Add button
    Then Client "Aisha Abdi" is successfully added as "Manual Entry" with the correct data