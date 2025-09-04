Feature: User Registration
Scenario: Successful registration
Given User is on nopCommerce homepage
When User clicks on register link
And User enters required registration details
And User submits the registration form
Then User should see registration confirmation
