Feature: Login



Scenario: Verify user can login
Given Open Application "<URL>"
Then Click on Signinbutton
Then Click sugninlink
Then Enter user pass and Click signin
Then Verify user can login