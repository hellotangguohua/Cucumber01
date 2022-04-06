Feature: check login failed
  @smoke
  Scenario: user can not login successfully
    Given user is on login page
    When user enter invalid username and password
    And clicks on login button
    Then error message is displayed