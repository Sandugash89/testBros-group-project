Feature:
  @job
  Scenario:
    When user is logged in with valid admin credentials
    And user navigates to employee list page
    And user clicks on an employee from list of employees
    And user is navigated to employee view page
    And user clicks on Job sidebar
    And user clicks  edit button
    And user edits job title employment status and job category of that employee
    And user edits joined date sub unit and location of that employee
    And user edits contract start date and end date  of that employee
    And user edits contract detail of that employee
    And user clicks save button



