Feature: Portal Login

Background: 
Given validate the browser
When Browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home Page default login
Given User is on NetBanking landing page
When User login to application with username "John" and password "pass1"
Then Homepage is populated
And Cards are displayed
