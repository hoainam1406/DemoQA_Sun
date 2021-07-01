Feature: DemoQA
  I want to verify the Registration Form
  @TC_FO_PF_01
  Scenario Outline: Verify the Generic form fields: Check the behavior of form by not filling up any data into the form.
    Given Open the Registration Form page
    When Click the submit button
    Then The "<message>" "Thanks for submitting the form" should not show
    Examples:
      | message |
      |Thanks for submitting the form|