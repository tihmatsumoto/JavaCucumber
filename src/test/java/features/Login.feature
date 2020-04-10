Feature: Login functionality
  In order to access Swag Labs store
  As a valid Sauce Labs customer
  I want to login successfully

  Scenario: Login Successful
    Given I am in the login page of Sauce Labs WebPage
    When I enter valid credentials
    Then I should be taken to the Inventory page