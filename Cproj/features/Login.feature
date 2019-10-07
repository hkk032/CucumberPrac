@tag
Feature: User Login functionality

  @tag2
  Scenario Outline: User Logs into the TestMeApp
    Given User is on Login page
    When User enter the "<username>" and "<password>"
    Then User clicks on Login button

    Examples: 
      | username | password |
      | jesse    | jesse    |
