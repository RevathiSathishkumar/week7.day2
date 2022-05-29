@smoke
Feature: LeaftTaps duplicate Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@regression
Scenario Outline: Duplicate Lead with mandatory information
And  enter the username as <username>
And  enter the password as <password>
When Click on Login button
When Click on CRMSFA link
Given Click on Leads link
And Click on MergeLeads link
And Click on FromLead widget
And Enter From FirstName as 'Revathi'
And Click on FindLeads button for FromLead
And Click on First FromLead
And Click on ToLead widget
And Enter To FirstName as 'S'
And Click on FindLeads button for ToLead
And Click on First ToLead
When Click on Merge button
Given Click on FindLeads link after Merging
And Enter the From FirstLead ID
And Click on FindLeads button for searching FirstLeadId
Then Verify Merged record is available


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

