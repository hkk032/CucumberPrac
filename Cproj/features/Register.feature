@FunctionalTesting
Feature: Registration for TestMeApp

  @SmokeTesting
  Scenario: User registers for TestMeApp
    Given User is on home page
    When User clicks on Signup
    And Enters the "<username>" and "<fname>" and "<lname>" and "<pass>" and "<cpass>" and "<gender>" and "<email>" and "<mobno>" and "<month>" and "<year>" and "<date>" and "<address>" and "<ques>" and "<ans>"
    	| jesse1 | jesse | doe | jesse | jesse | Male | jesse@gmail.com | 7845894578 | Sep | 1995 | 25 | Washington | What is your Birth Place? | Washington |
    Then User clicks on Register
