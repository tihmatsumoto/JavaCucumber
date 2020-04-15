Feature: Login functionality
  In order to access Swag Labs store
  As a valid Sauce Labs customer
  I want to login successfully

  Scenario Outline: Login Successful
    Given I am in the login page of Sauce Labs WebPage
    When I enter valid '<username>' and '<password>'
    Then I should be taken to the Inventory page
    Examples:
      |username       |password    |
      |standard_user  |secret_sauce|
      |problem_user   |secret_sauce|
