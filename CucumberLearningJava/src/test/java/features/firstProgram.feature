Feature: Application Login 
Scenario: Admin Page default login 

Given User is on NetBanking landing page
When User login into application with "admin" and "password"
Then Home Page is displayed
And Cards are displayed

# Reusable

Scenario: User Page default login 

Given User is on NetBanking landing page
When User login into application with "<username>" and "<password>"
Then Home Page is displayed
And Cards are displayed
