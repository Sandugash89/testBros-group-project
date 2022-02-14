Feature: TerminateEmployment

  Background:
    Given  user is navigated to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM Option

    @termination
  Scenario: Terminate Employment
    When   user selects a specified Employee
    And    user clicks on jobs
    And    user clicks on Terminate Employment
    Then   user terminate specified Employee