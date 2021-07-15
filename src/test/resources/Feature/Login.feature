Feature: Book Store
  I want Login in book store

  @BST_LG_01
  Scenario Outline: Verify on entering data to all textfield
    Given Open home page login
    And   User enters Credentials to LogIn
      | userLogin | passWord   |
      | kieu    | Mykieu123@ |
    And   Click to login
    Then  The website display book store login correct with "<value>"
    Examples:
      | value  |
      | kieu |

  @BST_LG_02
  Scenario Outline: Verify password field
    Given Open home page login
    And   User enters Credentials to LogIn
      | userLogin | passWord |
      | b         | kieu1    |
    And   Click to login
    Then  The website display book store login incorrect with "<text>"
    Examples:
      | text                          |
      | Invalid username or password! |

  @BST_LG_03
  Scenario: Verify blank textfield
    Given Open home page login
    And   Click to login
    Then  The website display warning textfield with boder red

  @BST_LG_04
  Scenario: Successful Login with Valid Credentials then LogOut
    Given Open home page login
    And User enters Credentials to LogIn
      | userLogin | passWord |
      | a         | Test@153 |
    And   Click to login
    Then Message displayed User Register Successfully.
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

  @BST_LG_05
  Scenario: Empty password field
    Given Open home page login
    And User enters Credentials to LogIn
      | userLogin | passWord |
      | Mykieu    |          |
    And Click to login
    Then The website display warning password textfield with boder red
  @BST_LG_06
  Scenario: Login and delete book store
    Given Open home page login
    And User enters Credentials to LogIn
        | userLogin | passWord   |
        | kieu    | Mykieu123@ |
    And Click to login
    And Click to btnDelete
    And Click to OK to delete this book
    Then The display message deleted


