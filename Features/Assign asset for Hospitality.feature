Feature: Assign asset for Hospitality

Scenario: Successful login with valid credentials 
Given User launches the browser
When User opens the URL "https://cx.realcube.estate/"
And User enters the email as "fzaouai@aldar.com" and password as "owner123"
And Click on the login

#---------------------------------------------------------------------------
And Click on App and configuration
And Click on Assign Asset
And Click and Select SLA user

And Click and Select asset
And Click and Select parent category
And Click and Select hotels
And Click and Select level
And Click and Select category 
And Click and Select category user
And Click and Select Add cc
And Click and Select Add bcc
And Click on assign 
	