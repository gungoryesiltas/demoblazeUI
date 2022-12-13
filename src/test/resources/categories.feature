Feature: User should be able to add to cart some products from categories


  Background:
    Given user goes to demoblaze page
    And user clicks on log in button
    And user clicks on username inputbox and enters the username
    And user clicks on password inputbox and enters the password
    Then user clicks login button and verifies that logged in successfully

  @categories

  Scenario: user adds products to cart
    When user clicks on Laptops button
    And user clicks one of the products from Laptops
    And user clicks add to cart button and accept pop up message
    And user clicks cart button and verifies the added product
    Then user deletes the product from cart