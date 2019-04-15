Feature: Application Login


@SmokeTest
Scenario: Home Page default login
Given User is on NetBanking landing page
When User login to application with username "John" and password "pass1"
Then Homepage is populated
And Cards are displayed

@MobileTest
Scenario: Home Page new user
Given User is on NetBanking landing page
When User sign up with following details
| John Applegate | abcdxyz | john@apple.com | Australia | 3424345 | 
Then Homepage is populated
And Cards are displayed


Scenario Outline: Home Page default login
Given User is on NetBanking landing page
When User login to the application with username <username> and password <password>
Then Homepage is populated
And Cards are displayed

Examples:
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|