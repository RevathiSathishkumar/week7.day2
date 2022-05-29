@regression
Feature: LeaftTaps duplicate Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@smoke  @sanity
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
Given Click on Edit lead button
Given Update company name as 'Infosys'
Given Click on as submit as button



Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

