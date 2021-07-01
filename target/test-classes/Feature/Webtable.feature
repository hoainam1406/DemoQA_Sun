Feature: Webtable
I want to add member to Webtable element

  @TC_EL_WT_01
Scenario Outline: Verify that data display correct in Grid Member
    Given Open home page
    Then The website display Member in Grid correct with "<firstname>" and "<lastname>"
    Examples:
      | firstname | lastname |
      | Cierra | Vega |

  @TC_EL_WT_02
  Scenario Outline: Verify that open Registration Form success when user click on add button
    Given Open home page
    When Click on add button
    Then The website display Form correct with "<formname>"
    Examples:
      | formname |
      | Registration Form |
  @TC_EL_WT_03
  Scenario Outline: Verify on entering data to all textfield
    Given Open home page
    When Click on add button
    And Enter data to all textfield
    And Click submit button
    Then The website display Member in Grid correct with "<firstname>" and "<lastname>" and "<age>" and "<email>" and "<salary>" and "<department>"
    Examples:
      | firstname | lastname | age | email | salary | department |
      | Phuong | Hong | 18 | phuong123@gmail.com | 2000000 | Tester Team |
