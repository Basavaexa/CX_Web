Feature: Planned Audit Delete

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on CX Inspection
Then Click on Planned Audit
Then Click and Select the Inspection
Then Click on view
Then Select category all the No answer then click Submit
Then Select Category for observation
#Then Select Point
Then Click on Submit for PC