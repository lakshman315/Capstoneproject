Feature: Product Wishlist
Scenario: Add product to wishlist
Given user opens nopCommerce site
When user search for Adobe Photoshop in home page
And user added product to wishlist
Then product should be in wishlist
