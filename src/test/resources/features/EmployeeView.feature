Feature:Viewing employee personal details
Background:
  When user enters valid admin username and password
  And user clicks on login button
  When user navigates to employee list page

  Scenario: Selecting employee from list
    When user clicks on an employee from list of employees
    Then user is navigated to employee view page