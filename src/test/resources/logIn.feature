Feature: As a user I should be able to log in to demoblaze

  @login
  Scenario: User logs in
    When user goes to demoblaze page
    And user clicks on log in button
    And user clicks on username inputbox and enters the username
    And user clicks on password inputbox and enters the password
    And user clicks login button and verifies that logged in successfully