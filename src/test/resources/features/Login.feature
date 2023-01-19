Feature: To Test Login Functionality
  Developer - Maggie
  Tester - Kristo

#  here we write all scenarios

  Background:
    Given User open website
    And Verify item on the cart page

  @Smoke @Chirag
  Scenario: Verify User Can Login Into Application
    When  User enter the valid credentials
    Then Verify cart page is displayed

  @Regression @Paulina
  Scenario: Verify User Can not Login with invalid credentials
    When  user enter the invalid credentials
    Then verify invalid login error message is displayed