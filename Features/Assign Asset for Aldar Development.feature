Feature: Assign asset for Aldar Development

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login

#---------------------------------------------------------------------------
And Click on App and configuration
And Click on Assign Asset
And Click and Select SLA user

And Click and Select asset AD
And Click and Select journey

And Click and Select level AD

And Click and Select category AD
And Click and Select category user AD

And Click and Select Add cc AD
And Click and Select Add bcc AD
And Click on assign 
	