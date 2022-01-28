Feature: Buy Products
  I as a user of saucedemo
  I need to buy the products
  to my beneficts

  Scenario: Buy Products
    Given the user is in the application
    When the user login with her credentials
    And the user try to add items to shopping cart
    And the user tries to buy the products in the cart
    Then the user sees the successful purchase message
