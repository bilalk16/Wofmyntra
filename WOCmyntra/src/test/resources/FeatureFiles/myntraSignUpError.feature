@tag
Feature: myntra Sign up feature

  @tag1
  Scenario Outline: User sign up with insufficient information
    Given user is at sign up page
    When user enters "<email>" and "<password>"
    And user select gender
    Then User gets error message
    
    Examples: 
      | E-mail              | Password    |
      | check@mail.com      | abcefghi    |
      | check@mail.com      | abcefghi1   |
      | check@mail.com      | Abc     		|
      