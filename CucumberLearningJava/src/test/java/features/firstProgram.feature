Feature: Application Login
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "1234"
Then Home Page is displayed
And Cards are displayed

#Reusable
Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "0987"
Then Home Page is displayed
And Cards are displayed

When User login into application with "xyz" and password "1293"
