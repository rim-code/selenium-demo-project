
 @admin
  Feature: Je cherche un utilisateur
  En tantque utilisateur je souhaite verifier  la presence d un utilisateur

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @search_admin
  Scenario: Verifier la presence d un utilisateur
    When Je clique sur le module admin
    And Je saisis "admin" dans le champ Username
    And Je clique sur le bouton Search
    Then Je verifie la presence d un utilisateur dans le tableau
    When Je clique sur l icone logout
    And Je clique sur le bouton logout