Feature: Radio Button
  Do you like the site?
  @Radio1
  Scenario Outline: Customer like yes the site
    Given Open home page radio button
    And Click to label yes
    Then The website display you have selected "<text>"
    Examples:
    |text|
    |You have selected Yes|