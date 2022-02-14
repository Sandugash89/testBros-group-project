Feature: Editing Employee Contact Details

  Scenario:
    When user is logged in with valid admin credentials
    And user navigates to employee list page
    And user clicks on an employee from list of employees
    And user is navigated to employee view page
    And user clicks on contact details sidebar
    And contact details page is displayed
    And user clicks on edit button
    And user edits contact details of that employee
    And user clicks on save button
    And user clicks on add button
    And user add attachment to that employee
    And user clicks on upload button
    Then user contact details is displayed
