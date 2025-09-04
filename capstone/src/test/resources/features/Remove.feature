Feature: Remove from Cart
Scenario: Remove product from cart
Given user goes to nopCommerce site
When user searches for Adobe Photoshop
And user added the product to cart
And user goes to cart
And user remove the product
Then cart should be empty
