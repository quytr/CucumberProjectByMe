Feature: Validation of Login Scenarios

@smoke @test @login
  Scenario: Admin Login
  When user enters valid admin credentials
  And user clicks on login button
  Then admin user is successfully logged in