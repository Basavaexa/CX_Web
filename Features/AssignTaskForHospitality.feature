Feature: Assign Task for Hospitality

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on App_User_Configuration
Then Click on Assign Task
Then Click and Select Auditors HP


Then Click and Select Assets HP
Then Click and Select Parent Category HP
Then Click and Select HotelRestaurants Hotels HP
Then Click and Select Start Date HP
Then Click and Select End Date HP
Then Click on Assign HP

