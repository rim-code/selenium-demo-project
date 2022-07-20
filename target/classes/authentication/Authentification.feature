@authentification
Feature: Je me connect a l'application OrangeHRM
  En tantque utilisateur je souhaite me authentifier  a l'application OrangeHRM.

  @connexion_ok
  Scenario: Authentification a l'application OrangeHRM
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le buton login
    Then Je me redirige vers la page home "Welcome"
