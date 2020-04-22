@login
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


  @scenario_outline
  Scenario Outline: User names test for <name>
    When user enters "<username>" username and "<password>" password
    Then user name should be "<name>"
    Examples:credentials
      | username        | password    | name             |
      | user187         | UserUser123 | Jerel Vandervort |
      | user200         | UserUser123 | Lonzo Leuschke   |
      | storemanager52  | UserUser123 | Roma Medhurst    |
      | storemanager66  | UserUser123 | Carlos Ernser    |
      | salesmanager125 | UserUser123 | Cleveland Heller |
      | salesmanager140 | UserUser123 | Jameson Paucek   |