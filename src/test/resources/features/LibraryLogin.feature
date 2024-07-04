Feature: Login feature

  @librarian
  Scenario: Login as a librarian
    Given I am on the login page
    When I log in as a librarian
    Then dashboard should be displayed


  @student
  Scenario: Login as a student
    Given I am on the login page
    When I log in as a student
    Then books should be displayed


  @all_accounts
  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I log in using "<email>" and "<password>"
    Then account holder name should be "<name>"

    Examples:
      | email             | password | name            |
      | student27@library | libraryUser | Test Student 27 |
      | student28@library | libraryUser | Test Student 28 |
      | student29@library | libraryUser | Test Student 29 |
      | student30@library | libraryUser | Test Student 30 |