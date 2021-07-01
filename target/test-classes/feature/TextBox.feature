Feature: ToolsQA
  I want to view textbox on screen

  @TextBox
  Scenario Outline: Verify on entering data to all textfield
    Given Open home page
    And   Input data in textfield
    And   Click to submit
    Then  The website display data in textbox correct with "<userName>"and"<email>"and"<currentAddress>"and"<permanentAddress>"
    Examples:
      | userName | email          | currentAddress | permanentAddress |
      | MyKieu   | kieu@gmail.com | DaNang         | QuangNam         |

  @TextBox
  Scenario Outline: Verify on empty all textfield
    Given Open home page
    And   Invalid data in textfield
    And   Click to submit
    Then  The website display data blank in textbox correct with "<userName>"and"<email>"and"<currentAddress>"and"<permanentAddress>"
    Examples:
      | userName | email | currentAddress | permanentAddress |
      |          |       |                |                  |

  @TextBox
  Scenario Outline:Verify email textfield
    Given Open home page
    And   Enter all data but email textfield incorrect format
    And   Click to submit
    Then  The website display data with "<userName>"and"<email>"and"<currentAddress>"and"<permanentAddress>"
    Examples:
      | userName | email | currentAddress | permanentAddress |
      | MyKieu   | kieu  | DaNang         | QuangNam         |

  @TextBox
  Scenario Outline: Verify fullName textfield
    Given Open home page
    And Entering all data but FullName field is blank
    And Click to submit
    Then  The website display data blank in textbox correct with "<userName>"and"<email>"and"<currentAddress>"and"<permanentAddress>"
    Examples:
      | userName | email          | currentAddress | permanentAddress |
      |          | kieu@gmail.com | DaNang         | QuangNam         |



