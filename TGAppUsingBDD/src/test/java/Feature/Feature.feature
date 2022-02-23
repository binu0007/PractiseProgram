Feature: Working on TG App Testing working through BDD or Not

Background:
When user will launch the browser
And Launched the Application

And user click on Advance setting

When user will enter Valid username 
And user will enter valid password
And user click on Login button
Scenario: Testing Login Feature Of TGApp
Then LoginHome Page will Display

Scenario: Testing Home page of TG App after Login
When user click on menu item
When click on my profile
And click on my Quick task
And click on My Task
And Click on My Activity
When Click on My DSR
And click on plus DSR button
And Click on Calender toggle button
And click on Create button
Then Created DSR pop up will Display

 