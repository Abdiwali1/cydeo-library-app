Feature: Login with parameters and use data table

  @studentParam
  Scenario: Login as a student with parameters
    Given I am on the login page
    When I log in using "student27@library" and "libraryUser"
    Then show records default value should be 10
    And show records should have the following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |