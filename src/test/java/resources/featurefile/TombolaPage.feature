Feature: Login Feature
  @regression
  Scenario: User logs in successfully
    Given User is on the login page
    When  User clicks on accept cookies button
    And   Verify the text on the Login Page 'Login to'
    And   User enters valid User Name
    And   User enters valid Password
    And   User clicks the login button
    Then  User should be redirected to the home page and verify the text britain's biggest bingo site