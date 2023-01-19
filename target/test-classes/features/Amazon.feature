Feature: Amazon e-commerce login

  Scenario: Login with valid username and password
    Given User John Doe with password abc123 is registered
    When  User John Doe with password abc123 logs in
    Then User John Doe should be navigated to HomePage

    Scenario: Login with valid username and invalid password
      Given User John Doe with password abc123 is registered
      When User John Doe with password wrongPass logs in
      Then User should be given login error message
