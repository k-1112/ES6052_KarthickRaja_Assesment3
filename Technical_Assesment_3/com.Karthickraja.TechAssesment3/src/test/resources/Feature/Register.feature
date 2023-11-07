Feature: Register to demo web application
 
Scenario: Registering the demo web application
 
Given User is on register page
When User clicks register
And User clicks gender
And User provides the credentials
And User clicks register button
Then User successfully registered