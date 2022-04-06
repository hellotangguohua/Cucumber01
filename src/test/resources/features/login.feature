Feature: check login functionality
  @smoke
  Scenario: user can login successfully
    Given user is on login page
    When user enter valid username and password
    And clicks on login button
    Then user can navigated to home page successfully
  @smoke
  Scenario: user can login successfully
    Given user is on login page
    When user enter invalid username and password
    And clicks on login button
    Then error message is displayed