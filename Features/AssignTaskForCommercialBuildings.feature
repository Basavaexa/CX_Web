Feature: Assign Task for Commercial Building

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on Assign Task
Then Click and Select Auditors CB


Then Click and Select Assets CB
Then Click and Select Commercial Building
Then Click and Select Start Date CB
Then Click and Select End Date CB
Then Click on Assign CB

