@LogIn
Feature: Log in Page
	As user I should be able to log in
	So I can buy Products

  @ValidCredentials
  Scenario: User should be able to login
    Given User is on login page 
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User clicks on sign in button
    Then User should be logged correclty
    
  @InvalidCredentials
  Scenario: User should not be able to login
    Given User is on login page 
    When User enters username as "tes800@hotmail.com"
    And User enters password as "test123"
    And User clicks on sign in button
    Then User should recieve the followong error message: "Authentication failed."
    
  @MissingEmail
  Scenario: User should not be able to login whithout providing email
    Given User is on login page 
    When User enters password as "test123"
    And User clicks on sign in button
    Then User should recieve the followong error message: "An email address required."
  
  @MissingPassword
  Scenario: User should not be able to login without providing password
    Given User is on login page 
    When User enters username as "tes800@hotmail.com"
    And User clicks on sign in button
    Then User should recieve the followong error message: "Password is required."
    
  @BuyProduct
  Scenario: User should be able to buy product
    Given User is logged in with username "test800@hotmail.com" and password "test123"
		When User clicks on the home button
		And User selects dress
		And User adds to cart
		And User proceeds to checkout and fills info
		And User confirms order
		Then User should see order confirmation