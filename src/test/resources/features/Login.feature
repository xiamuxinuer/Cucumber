Feature: login
  As user,I want to be able to login with username and password
  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

