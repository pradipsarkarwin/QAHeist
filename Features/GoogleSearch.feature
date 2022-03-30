Feature: perform a google search


Scenario Outline: simple search

Given I am on the google homepage
When I enter search "<keyword>"
And I click on google search button
Then i receive releted search result

Examples:
|keyword									|
|Quality Assurance				|
|software testing					|