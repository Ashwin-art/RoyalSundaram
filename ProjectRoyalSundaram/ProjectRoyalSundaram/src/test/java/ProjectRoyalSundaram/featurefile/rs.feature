@all
Feature: Royal Sundaram Automation

@carinsurance
Scenario: Navigate to the respective royalsundaram website and automate the car insurance form
Given user navigates to the website
And user gives in the relevant car details and clicks on get quote
And user edits vehicle details and proceeds for the next page
When user fills in the previous insurance details
Then a page with the option to buy should be displayed 
