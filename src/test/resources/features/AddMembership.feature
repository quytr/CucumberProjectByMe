Feature: Adding different memberships under qualifications

  @userstory13
  Scenario: As an admin user should be able to add different memberships under qualifications
    When user enters valid admin credentials
    And user clicks on login button
    When user clicks on Admin option
    And user navigates to Membership page
    And user enters any memberships in Name field
    Then memberships name is added successfully