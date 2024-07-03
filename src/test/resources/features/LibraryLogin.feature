Feature: Login feature

  @librarian
  Scenario: Login as a librarian
    Given I am on the login page
    When I log in as a librarian
    Then dashboard should be displayed