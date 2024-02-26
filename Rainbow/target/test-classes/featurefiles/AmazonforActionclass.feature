Feature: work on Actionclass


@AC01
Scenario Outline: Login with Amazon credentials

#Given user navigates to amazon site
And user clicks signin button again
When user enters  Amazon username"<username>" and password"<password>" again
And user clicks Amazon login buttonagain
When user mouse hower to particular option
And user clicks the option

Examples:

|   username     |  password  |

|   9500879414   |  Kanil@143 |


@Drag

Scenario: Working on Drag and Drop
Given User handles the drag and drop