
    Feature: Login
    Scenario Outline: Successful Login with Valid Credentials
    Given User launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enter email as "admin@yourstore.com" and paswword as "admin"
    And Click on Login
    Then page title should be "Dashboard" / "nopCommerce administration"
    When user click on the Logout link
    Then page title should be "your store. Login"
    And close browser


