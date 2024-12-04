Feature: Register User
  Scenario: Successful registration
    Given User is on login
    Then User enters email "test@test.gmail"
    Then password should be 123456