Feature: Dashboard tabs verification functionality

  @dashboard
  Scenario: Verify Dashboard tabs
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    Then user verifies all the dashboard tabs
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|
