Feature: myntra Login Feature

Scenario: myntra Login with wrong username and wrong password

Given myntra login page is launched
When user input wrong "Email" and wrong "password"
Then user should get error message
