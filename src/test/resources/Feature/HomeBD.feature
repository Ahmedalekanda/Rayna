Feature: Home page


@BD

Scenario: Verify search result display
Given Open Application "<URL>"
Then Enter XPS in SearchFiled
Then Click on SearchLink
Then Verify search result display
