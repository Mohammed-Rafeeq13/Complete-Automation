Feature: Login 

Scenario: 
	Given User Opens the Chrome Browser
	Then User opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	When User Enter username "<Username>" and Password as "<Password>"
	Then User clicks on Login button
	And User Closes the Browser
	
	Examples:
	| Username | Password |
	| Admin    | admin123 |
	| admin    | admin    |