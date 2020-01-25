@tag
Feature: ZipCode Feature
  As a user i should be able to check product delivery time using Zipcode

  @tag1
  Scenario: myntra user should be able to get delivery time using zipcode
    Given User is at myntra Sweaters page
    When when customer selects item
    And customer scrolls to delivery options
    And customer enters zipcode
    Then customer should be able to get available dilvery time

