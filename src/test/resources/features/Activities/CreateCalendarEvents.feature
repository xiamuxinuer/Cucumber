@activities
Feature: create new calendar even
  As user, I want to be able to create calendar event

  Scenario: Create new calendar event as sales manager

    Given user is on the login page
    When user logs in as a sales manager
    And user navigates to "Activities" and "Calendar Events"
    Then user clicks on create calendar event button
    And user enters "Sprint Retro" as title
    And user enters "Discuss what went well,what went wrong" as description
    Then user click on save and close button
    And user verifies that description of new calender event is "Discuss what went well,what went wrong"
    And user verifies that title of new calender event is "Sprint Retro"

  @create_calendarEvent_data_table
  Scenario: Create new calendar event as sales manager with data table

    Given user is on the login page
    When user logs in as a sales manager
    And user navigates to "Activities" and "Calendar Events"
    Then user clicks on create calendar event button
    And  user enters new calendar event information:
      | description | Discuss what went well,what went wrong |
      | title       | Sprint Retro                           |
    Then user click on save and close button
    And user verifies that new calendar event was created successfully
      | description | Discuss what went well,what went wrong |
      | title       | Sprint Retro                           |


