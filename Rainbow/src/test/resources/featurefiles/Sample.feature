Feature: Login Page of Salesforce

@dryrun @regression
Scenario: Error messsage  with invalid credentials
Given user navigates to webpage
When user enters the username " abc" and password "123"
And user clicks login button
Then User Verifies the error message 

@multiple
Scenario Outline: Passing diff login data
Given user navigates to webpage
When user enters the username "<username>" and password "<password>"
And user clicks login button
Then User Verifies the error message

Examples: 

| username| password |

|   Kiru   | 123      |
|   hari   | abc      |
|   Kanil  | kij      |


@SC01 @regression
Scenario: Login with valid credentials
Given user moves to webpage
When user gives the username " aravinth" and password "abc"
And user clicks login button again
Then User Verifies the homepage 