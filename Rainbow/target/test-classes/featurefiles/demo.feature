Feature: Login to Amazon Webpage


@SC02
#before
Scenario Outline: Login with valid credentials
# Given user navigates to Amazon webpage
And user clicks signin button
When user enters  Amazon username"<username>" and password"<password>"
And user clicks Amazon login button
Then User Verifies the Amazon homepage
#after

Examples:

|   username     |  password  |

|   9500879414   |  Kanil@143 |



@SC03
Scenario: Login with invalid credentials
Given user moves to Amazon webpage
When user enters the Amazon username "abc" and password "123" again
And user clicks Amazon Sigin button 
Then User Verifies the Amazon errormessage  