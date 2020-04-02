@Rest
Feature: Employee feature

  @GetEmployees
  Scenario: User should be able to login
    Given User set valid auth key
    When User send a Get request on "users"
    Then User should get status code 200
    
  @GetEmployee
  Scenario: User should be able to login
    Given User set valid auth key
    And User sends an id of 2
    When User send a Get request on "users/{id}"
    Then User should get status code 200