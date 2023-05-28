
@test
Feature: Authentification
au tant que adminstatreur  je dois m authentifier avec login et un mot de passe valide 
  

  @testpassant
  Scenario: authentification valide
    Given ouvrir navigateur chrome
    And saisir URL
    When saisir mail
    And saisir password
    And cliquer sur le bouton login
    Then verifier page home
    

  