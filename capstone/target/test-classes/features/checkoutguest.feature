Feature: Checkout as Guest
Scenario: Guest checkout with product in cart
Given user opened nopCommerce site
When user do search for "Adobe Photoshop"
And user add product to cart
And user proceed to checkout as guest
And user enter billing details
And user select shipping and payment method
Then user should see order confirmation
