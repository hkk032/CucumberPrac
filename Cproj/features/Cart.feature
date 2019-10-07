@FunctionalTesting
Feature: Cart Availability Functionality

  @SmokeTesting
  Scenario: The one where user moves to cart without adding any item in it
    Given Alex has registered into TestMeApp
    When Alex search a particular product like headphones
    And try to proceed to payment without adding any item in the cart
    Then TestMe doesn't display the cart icon