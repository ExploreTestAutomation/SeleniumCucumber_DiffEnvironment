Feature: validate login Functionality 


Scenario: validate negative login functionality 
Given Navigate to utest url
When Click on sign in link
And Click on sign in button 
Then validate the error message "Invalid username or password."

Scenario: validate negative login functionality 
Given Navigate to utest url
When Click on sign in link
And Enter email "school1@gmail.com"
And Click on sign in button 
Then validate the error message "Invalid username or password."