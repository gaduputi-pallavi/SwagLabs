
Feature: To Validate Login Page

  
  Scenario Outline: To Validat login functionality for valid credentials
    Given User launch the application with "<url>"
    When user enter valid username "<username>"
    And user enter valid password "<password>"
    And user click on submit button
    Then user should br able to logged in successfully
  
    Examples: 
      |url|username|password|
      |https://www.saucedemo.com/|standard_user|secret_sauce|
      |https://www.saucedemo.com/|locked_out_user|secret_sauce|

     Scenario Outline: To validate login functionality for inavalid creds
      Given User launch the application with "<url>"
      When user enter inavalid creds as "<username>" and password as "<password>"
      And user click on submit button
      Then user should get some error message
     Examples:
     |url|username|password|
     |https://www.saucedemo.com/|ajjdsvj|ydhc|
     |https://www.saucedemo.com/|ajjdsvj|secret_sauce|