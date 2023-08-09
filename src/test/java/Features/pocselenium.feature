
Feature: To validate the Selenium-demo page
  I want to use this template for my feature file

  
  Scenario: able to validate the demo page
    Given user open the Url "https://artoftesting.com/samplesiteforselenium"
    And user clikc the link under the sample text
    And user enter the some text in textbox 
    When user click on submit button
    And user double-click on alert button 
    When the alert is open click ok on it
    When user click  any one radio button
    When user click on any one of checkboxs
    And user go to the dropdown 
    When user select any one option on dropdown
    When user click on generate alert box alert will open click on ok
    When user click on generateconfirm button on the page
    Then user validate the result
    When user go to draganddrop perfrom the action 
    Then user validate the outcomes

  
