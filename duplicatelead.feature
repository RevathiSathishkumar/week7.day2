@lead
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
When Click on Leads link
When Click on finfLead link
When Click on Phonenumber
Given Enter phonenumber as '9'
Given Click on findLead
Given Click the first list of element
Given Click on duplicate lead button
Given Click on submit as button



Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

