Feature: Application Login

  Background:
  Given Validate the browser
  When Browser is trigrred
  Then Check if the browser is displayed
  @Smoke @Reg
  Scenario: Home Page Default Login
  Given Iam on landing page
  When User logins with uname "loks" and password "1234"
  Then Home page populates
  And Cards are displayed "true"
  @Reg
  Scenario: Home Page Default Login
  Given Iam on landing page
  When User logins with uname "jijo" and password "5432"
  Then Home page populates
  And Cards are displayed "false"
  @Sanity
  Scenario: Home Page Default Login
  Given Iam on landing page
  When User logins with following credentials
  |loks|12345|loks@gmail.com|india|8940234039|
  Then Home page populates
  And Cards are displayed "false"
  @Reg
  Scenario Outline: Home Page Default Login
  Given Iam on landing page
  When User logins with "<uname>" and "<pass>"
  Then Home page populates
  And Cards are displayed "true"
  
  Examples:
  |uname|pass |
  |user1|pass1|
  |user2|pass2|
  |user3|pass3|
  
  

