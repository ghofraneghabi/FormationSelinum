@tag
Feature: Verification page orange

  @tag1
  Scenario: Cas Passant
    Given Ouvrir Nav
    And Saisir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Remplir champs username "Admin"
    And Remplir champs Password "admin123"
    And Cliquer sur la bouton login
    Then acces sur la page home

  @tag2
  Scenario: cas non passant
    Given Ouvrir Nav
    And Saisir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Remplir champs username "Admin5"
    And Remplir champs Password "admin1"
    And Cliquer sur la bouton login
    Then acces sur la page home

  @tag3
  Scenario Outline: 
    Given Ouvrir Nav
    And Saisir URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Remplir champs username "<user>"
    And Remplir champs Password "<password>"
    And Cliquer sur la bouton login
    Then verifier le resultat obtenu "<message>"

    Examples: 
      | user     | password | message             |
      | Admin    | admin123 | Paul Collings       |
      | ghofrane | adm23    | Invalid credentials |
      | amin     | admhh3   | Invalid credentials |
