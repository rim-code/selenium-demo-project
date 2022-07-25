@authentification
Feature: Je me connect a l'application OrangeHRM
  En tantque utilisateur je souhaite me authentifier  a l'application OrangeHRM.

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @connexion_ok
  Scenario: Authentification a l'application OrangeHRM
    Then Je me redirige vers la page home "Welcome"

  @deconnexion
  Scenario: Verifier la deconnexion
    When Je clique sur l icone logout
    And Je clique sur le bouton logout
