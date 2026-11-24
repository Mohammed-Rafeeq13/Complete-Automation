Feature: OrangeHRM Login 

  @Sanity 
  Scenario: OrangeHRM
    Given User Opens the Chrome Browser
    When User Opens the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"	
    Then User Enter Username "Admin" and Password as "admin123"
    And Click on Login button 
    Then User Redirect to the Home Page