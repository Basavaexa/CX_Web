Feature: Ticket List

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/dashboard"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login


Then Click on CX Inspection
Then Click on Tickets

Then Click on View icon for any Open Tickets

Then Click and Select the Status Inprogress
Then Upload Photo "C:\Users\SuvenduB\Downloads\\ict.png"
Then Enter Comment "Inprogress"
Then Click on Submit

Then Click on View icon for any Inprogress Tickets

Then Click and Select the Status Disputed
Then Upload Photo DS  "C:\Users\SuvenduB\Downloads\\ict.png"
Then Enter Comment DS "Disputed"
Then Click on Submit DS


Then Click on View icon for any Disputed Tickets

Then Click and Select the Status Completed
Then Upload Photo CP  "C:\Users\SuvenduB\Downloads\\ict.png"
Then Enter Comment CP  "Completed"
Then Click on Submit CP


Then Click on View icon for any Completed Tickets

Then Click on Transaction Logs Plus icon





