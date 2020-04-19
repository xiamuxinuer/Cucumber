
@View_Calendar_Event
Feature: View Calendar Events
  As a user, I should be able to view all calendar events as a table


  Scenario: User permissions

    Given user is on the login page
    When user logs in as a store manager
    And user navigates to "Activities" and "Calendar Events"
    Then View Per Page menu should have following options
      | 10  |
      | 25  |
      | 50  |
      | 100 |












