@signInXlsx
Feature: Je me connect a l application OrangeHRM avec un fichier excel
  En tantque utilisateur je souhaite m authentifier  a l application OrangeHRM.

  @signIn
  Scenario: Authentification a l application OrangeHRM
    Given Je me connecte a l'application OrangeHRM
    When Je m authentifier avec un fichier excel
