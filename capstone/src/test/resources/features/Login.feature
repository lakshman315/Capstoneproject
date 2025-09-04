Feature: nopcommerce login
Scenario: user get successfull login
Given User should open nopcommerce home page
When User  click on login 
And the user enters their email and password
And user should click on submit button
Then User get logged in