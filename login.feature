Feature: LeafTaps login functionality
Scenario Outline: Login with positive creditials

Given  open chromebrowser
And    load the appiclation url
And    enter the username as <username>
And    enter the password as <password>
When   click on login button
Then   home page should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|