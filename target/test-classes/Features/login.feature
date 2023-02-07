Feature: to automate facebook login page

Scenario: to automate invalid credentials of login page 
 Given user should be in fb login page
 When the user enter invalid "<username>" and "<password>" 
 And click login btn
 And user has to navigate invalid login page 
 
 Examples:
 
  | username | password|
  | mani     | 12345   |
  | maran    | 34232   |
  
  Examples:
  
  | username | password|
  | kathir   | 1232313 |
  | agi      | 45454322|
  | geetha   | 12334678|