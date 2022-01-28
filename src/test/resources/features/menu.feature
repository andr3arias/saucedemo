Feature: menu options
  I as a user of the app
  I Want to check the menu options
  to validate its functionality

#  @AllItemsMenu
#  Scenario: all items menu
#    Given the user is in the application
#    When the user login with her credentials
#    And the user check the all items menu
#    Then the user can see how to filter all products

  @AboutMenu
  Scenario Outline: about menu
    Given the user is in the application
    When the user login with her targets
    |userName|password|
    |<userName>|<password>|
    And the user check the about menu
    Then the user can see the user can see that he is directed to a new page

    Example:
    |userName|password|
    |standard_user|secret_sauce|
