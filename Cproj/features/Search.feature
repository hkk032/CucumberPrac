@FuntionalTesting
Feature: Product search functionality

  @SmokeTesting
  Scenario: User searches for a particular product
    Given User is on login page of TestMeApp
    When User logs into the TestMeApp
    Then Searches for headphone
