
Feature: Oddo CRM Price check for discount Feature


Scenario: Oddo CRM Price check Scenario

Given user is on the home page after login process after entering "<username>" and "<password>"
When  Oddo is the ppage title
Then user clicks on price text
Then user gets the price and check the discount 
Then Close the browser


Examples:
	| username | password |
	| deep123@gmail.com  | 11111111 |
	 