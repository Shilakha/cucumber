Feature: Login Action 
	Description: This feature will test a LogIn and LogOut functionality
@Loginandlogout
Scenario: Login Functionality 
	Given user navigates to https://www.eazework.com/login/ 
	When user logs in using shilakha as USER 
	And password as "Hello@123" 
	And clicks on login button 
	Then Message displayed Login Successfully
	Then Message displayed logout successfully

	
