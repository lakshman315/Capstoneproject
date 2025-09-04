Feature: Search Product
Scenario: Search for a product
Given user open nopCommerce site 
When user search for MacBook
Then user should see MacBook in results
