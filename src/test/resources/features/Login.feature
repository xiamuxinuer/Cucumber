Feature: login
  As user,I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

  @sales_manager
  Scenario: Login as sales manager and verify that title is Dashboard

    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

 @store_manager
  Scenario: Login as store manager and verify that title is Dashboard

    When user logs in as a store manager
    Then user should verify that title is a Dashboard

   @driver
    Scenario: Login as driver and verify that title is a Dashboard

      When user logs in as a driver
      Then user should verify that title is a Dashboard

     @Login_with_parameter
Scenario: Login with parameters
  When user enters "storemanager85" username and "UserUser123" password
  Then user should verify that title is a Dashboard
