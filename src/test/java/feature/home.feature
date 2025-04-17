Feature: Homepage feature automation
  This is to handle all the functionalities of home page
  Scenario: Verify home page of the application
    Given I navigate to the homepage
    When Navigate forgot password link
    Then I should see forgot password page

