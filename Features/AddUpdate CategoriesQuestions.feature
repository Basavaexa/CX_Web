Feature: Add/Update Categories & Questions

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on Add Update Categories Questions


Then Click and Select Asset for Category Question
Then Click and Add Parent Category for Category Question "Test P"
Then Click and Add Category for Category Question "Test C"
Then Click and Add Question for Category Question "Testing Question?"
Then Click and Add Options for Category Question "Yes#NO#NA"
Then Click on Add button