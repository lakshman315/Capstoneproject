Feature: Add to Cart
Scenario: Add product to cart
Given user on nopCommerce site 
When user searched for Adobe Photoshop
And user added product to cart
Then product should be in cart
