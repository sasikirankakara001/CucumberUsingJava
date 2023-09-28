Feature: Application Login
#@RegressionTest
#Scenario: Admin Page default login
#
#Given User is on NetBanking landing page
#When User login into application with "admin" and password "1234"
#Then Home Page is displayed
#And Cards are displayed
@SmokeTest
#Reusable
@MobileTest @NetBanking
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "0987"
Then Home Page is displayed
And Cards are displayed

When User login into application with "xyz" and password "1293"
@SmokeTest @RegressionTest @Mortgage
Scenario Outline: User Page default login
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "<user>" and password "<password>"
Then Home Page is displayed
And Cards are displayed

Examples:
| user | password |
| debit | hellowqe|
| credit | 2342sdes|
@SmokeTest @RegressionTest
Scenario: User Page default Sign up

Given User is on Practice landing page
When User signup into application
|rahul|
|shetty|
|contact@email.com|
Then Home Page is displayed
And Cards are displayed
