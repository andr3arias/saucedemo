Feature: Cart buy Operation
  I as a user of saucedemo
  I need to trade the products
  to check the operation of the shopping cart

  Scenario: Add items to shopping cart
    Given the user is in the application
    When the user login with her credentials
    And the user try to add items to shopping cart
    Then the user validating the cart with message
