Feature: validate login Functionality 

Scenario: validate negative login functionality 
Given Navigate to utest url
When Click on sign in link
And Enter email "EMAIL"
And Click on sign in button 
Then validate the error message "EXPECTED"