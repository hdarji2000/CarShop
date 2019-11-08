Feature: SignUp and SignIn
  Background:
    Given I enter url as "https://www.carshop.co.uk"
    When I click on Accept Cookies
    When I click on top right menu button

  Scenario: Valid SignUp with valid Details

    And I click on Sign up now button
    Given I enter Firstname as "Harshad"
    And I enter Lastname as "Darji"
    And I enter Emailadd as "harsh_124@hotmail.com"
    And I enter Password as "Harshad18"
    And I enter Confirm Password as "Harshad18"
    When I click Sign up button on Sign up page
    Then I should see message "You're almost ready! Please check your inbox for a confirmation email, then click the link in the email to confirm your email address, so we know it's really you"

    Scenario: Valid SignIn with valid login credentials and BMW car search
      And I click on Sign in button
      Given I enter Email address as "harsh_124@hotmail.com"
      And I enter Password as "Harshad18"
      When I click Sign in button on Sign in page
      Given I enter Keyword as "BMW"
      When I click on matches button
      And I select "sort by payment:High-Low" from sort by Relevance
      And I click on Third car from list
      And I click heart icon on Third available vehicale
      And I click on top right menu button
      And I click Recently viewed
      Then I should see message as "Recently Viewed Vehicles"
      And I should see url as "https://www.carshop.co.uk/mycarshop/recently-viewed"

      Scenario: Valid SignIn with valid login credentials and Jaguar car Search with Recently viewed

        And I click on Sign in button
        Given I enter Email address as "harsh_124@hotmail.com"
        And I enter Password as "Harshad18"
        When I click Sign in button on Sign in page
        Given I entered Keyword as "Jaguar"
        When I click on matches button
        And I selected "sort by payment:Low-High" from sort by Relevance
        And I click on Second car from list
        And I click heart icon on Second available vehicale
        And I click on top right menu button
        And I click Recently viewed
        Then I should see message as "Recently Viewed Vehicles"
        And I should see url as "https://www.carshop.co.uk/mycarshop/recently-viewed"













