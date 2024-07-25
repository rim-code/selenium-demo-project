@directory_Module
Feature: Je me connect a l application orangeHRM
  En tant que utilisateur je souhaite chercher un dossier de client

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Welcome"

  @search_Directory
   Scenario: Chercher un client
    When je clique sur le module Directory
    And je saisie le nom dans le champ Name "Odis Adalwin"
    And je choisis dans le job Title "QA Engineer"
    And je choisis dans le location " HQ - CA, USA"
    And Je clique sur le bouton Search dans le module Directory
    Then Je verifie le resultat de recherche "Odis Adalwin"
