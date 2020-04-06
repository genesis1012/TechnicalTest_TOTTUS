#Author: heriberto-hg@hotmail.com
#Keywords Summary : 

@ConsultUserRest
Feature: Consult users
  I want to consult the user to know their information

  Scenario: consult users 
    When consult the users of the fifth page
    Then I should have response 200