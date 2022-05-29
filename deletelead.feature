Feature: LeaftTaps Delete Lead functionality

#Background:
#Given Open the chrome browser
#And Load the application url

@sanity
Scenario Outline: Delete Lead with mandatory information
And  enter the username as <username>
And  enter the password as <password>
When Click on Login button
When Click on CRMSFA link
When Click on Leads link
When Click on finfLead link
When Click on Phonenumber
Given Enter phonenumber as '9'
Given Click on findLead
When  get the elements using xpth
Given Click the first list of element
Given Click on delete button
Given Click on findleads button again
Given Enter the lead id as '15005'
Given Click on find button
Given Get the page info



Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|

