Feature: Validation of Adding Memberships to an employee

  @userstory14
  Scenario: Adding memberships to any employee by specified options
    When user enters valid admin credentials
    And user clicks on login button
    When user navigates to Employee List page
    And user clicks on the first Employee within table
    When user navigates to View Memberships page
    When user verifies Membership dropdown and select values
    And user verifies Subscription Paid By dropdown and select values
    And user verifies Amount text box and enter values
    And user verifies Currency dropdown and select values
    And user verifies Subscription Commence Date and select values
    And user verifies Subscription Renewal Date calendar and select values
    Then membership is added successfully