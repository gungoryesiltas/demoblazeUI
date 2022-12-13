Feature: As a user I should be able place an order in demoblaze website

  Background:
    Given user goes to demoblaze page
    And user clicks on log in button
    And user clicks on username inputbox and enters the username
    And user clicks on password inputbox and enters the password
    Then user clicks login button and verifies that logged in successfully
    When user clicks on Laptops button
    And user clicks one of the products from Laptops
    And user clicks add to cart button and accept pop up message
    And user clicks cart button and verifies the added product

    @cart
  Scenario: User places an order
    When user clicks on place order button
    And user clicks the nameBox and types name
    And user clicks the countryBox and type a country
    And user clicks the cityBox and type a city
    And user clicks the CreditCardBox and types credit card number
    And user clicks the monthBox and type card month
    And user clicks on yearBox and type card year
    And user clicks purchase button
    Then user verifies the purchase and clicks on Ok button
