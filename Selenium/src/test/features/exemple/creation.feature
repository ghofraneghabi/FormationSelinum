@tag
Feature: Creation compte facebook


 


  @tag1
  Scenario: Creation compte facebook valide
    Given ouvrir le navigateur chrome
    Given saisir URL "https://www.facebook.com/"
    When cliquer sur le bouton creation de compte
    And Remplir le champs prenom "cristiano"
    And Remplir le champs nom "ronaldo"
    And Remplir le champs mail "cristiano.ronaldo7@gmail.com"
    And Remplir le champs de confirmation de mail "cristiano.ronaldo7@gmail.com"
    And Remplir le champs mot de passe "tunisia2023"
    And Remplir la case mois "2"
    And Remplir la case jour  "5"
    And Remplir le case annee "1985"
    And choisir le genre "Homme"
    And Cliquer sur le bouton Login 
    Then verifier inscription
   
    @tag2-perso 
    Scenario: creation compte facebook avec genre perso
    
    Given ouvrir le navigateur chrome
    Given saisir URL "https://www.facebook.com/"
    When cliquer sur le bouton creation de compte
    And Remplir le champs prenom "aline"
    And Remplir le champs nom "kanari"
    And Remplir le champs mail "aline.kanari7@gmail.com"
    And Remplir le champs de confirmation de mail "aline.kanari7@gmail.com"
    And Remplir le champs mot de passe "tunisia2023"
    And Remplir la case mois "11"
    And Remplir la case jour  "24"
    And Remplir le case annee "1990"
    And choisir le genre "Personnalise" et selectionner "1"
    And Cliquer sur le bouton Login 
    Then verifier inscription
    
 @tag3_cas_accepter
  Scenario Outline: cas d acceptance
    Given ouvrir le navigateur chrome
    Given saisir URL "https://www.facebook.com/"
    When cliquer sur le bouton creation de compte
    And Remplir le champs prenom "<prenom>"
    And Remplir le champs nom "<nom>"
    And Remplir le champs mail "<mail>"
    And Remplir le champs de confirmation de mail "<mail>"
    And Remplir le champs mot de passe "<mdp>"
    And Remplir la case jour  "<jdn>"
    And Remplir la case mois "<mdn>"
    And Remplir le case annee "<adn>"
    And choisir le genre "<genre>"
    And Cliquer sur le bouton Login
    Then verifier inscription 

    Examples: 
      | nom   | prenom | mail                     | mdp        | jdn | mdn | adn  | genre |
      | kais  | salah  | mohamed.salah54@gmail.fr | salah12345 |  15 |  12 | 2000 | Homme |
      | leila | fatma  | lailaaftma45@hotmail.fr  | fatma12578 |  30 |  10 | 1994 | femme |
 