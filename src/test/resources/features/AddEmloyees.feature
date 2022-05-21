Feature: Adding Employees in HRMS Application

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    Then user clicks on PIM option
    And user click on add employee option

  @addEmployee
  Scenario: Adding one employee from feature file
    When user enters firstName middleName and lastName
    And user clicks on save button
    Then employee is added successfully

  @addEmployees
  Scenario: Adding multiple employees from excel file
    When user adds multiple employees from excel file using "EmployeeData" sheet and verify the employee added