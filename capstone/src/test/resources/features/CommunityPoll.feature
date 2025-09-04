Feature: Community Poll
Scenario: Vote in the community poll
Given User is on the nopCommerce homepage
When User selects an option in the community poll
And User clicks on the vote button
Then The poll result should be displayed
