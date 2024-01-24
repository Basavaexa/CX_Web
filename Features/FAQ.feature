Feature: Assign Task for Aldar Development

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on FAQ
Then Click and Select Role
Then Enter the Question "Test question for FAQ?"
Then Enter Answer"Test fine"
Then Click on Add
