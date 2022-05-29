@login
Feature: LeaftTaps Create Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@smoke @sanity
Scenario Outline: Create Lead with mandatory information
And  enter the username as <username>
And  enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
When Click on Leads link
When Click on CreateLeads link
Given Enter company name as 'TCS'
Given Enter first name as 'Revathi'
Given Enter last name as 'Sathishkumar'
When Click on submit button

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
