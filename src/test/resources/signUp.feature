Feature:As a user I should be able to sign up to demoblaze website.

  @signup
  Scenario: User signs up
    When user goes to demoblaze page
    And user clicks on sign up button
    And user clicks on username input box and enters the username
    And user clicks on password input box and enters the password
    Then user clicks on sign up button and verifies that signed up successfully





