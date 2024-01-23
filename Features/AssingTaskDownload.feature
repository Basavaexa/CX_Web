Feature: Assign Task Download

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on Assign Task

Then Click on Download Assign Report