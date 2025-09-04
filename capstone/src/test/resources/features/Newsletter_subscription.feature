Feature: Newsletter Subscription
Scenario: Subscribe to newsletter
Given userr open nopCommerce site
When userr enter my email for newsletter
And userr click subscribe
Then userr should see newsletter subscription confirmation
