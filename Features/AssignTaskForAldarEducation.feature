Feature: Assign Task for Aldar Education

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on Assign Task
Then Click and Select Auditors AE


Then Click and Select Assets AE
Then Click and Select Location
Then Click and Select Start Date AE
Then Click and Select End Date AE
Then Click on Assign AE

