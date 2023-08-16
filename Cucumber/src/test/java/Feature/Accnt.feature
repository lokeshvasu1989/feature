Feature: Application Login
  
  Scenario: Home Page Default Login
  Given Iam on landing page
  When User logins with uname "loks" and password "1234"
  Then Home page populates
  
 