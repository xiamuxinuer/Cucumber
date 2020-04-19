@Create_car
Feature: Create a car

  As user,I want to be able to add new cars

  Scenario: Add new car
    Given user is on the login page
    When user logs in as a sales manager
    Then user navigates to "Fleet" and "Vehicles"
    And user clicks on create a car button
    Then user creates a car with following info:
    |License Plate|Driver|Location|Model Year|Color|
    |sdet         |pro race|Rome  |2020      |red  |
