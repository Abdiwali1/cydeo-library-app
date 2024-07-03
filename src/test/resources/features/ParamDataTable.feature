Feature: Login with parameters and use data table

  @librarianParam
  Scenario: Login as a librarian with parameters
    Given I am on the login page
    When I log in using "librarian13@library" and "libraryUser"
    And there should be 1959 users
    And I click on "Users" link
    Then table should have the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
