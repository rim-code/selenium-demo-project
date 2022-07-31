@post
Feature: Je poste une publication
  En tantque utilisateur je souhaite poster une publication

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login

  @post_buzz
  Scenario Outline: Publier un post dans le modele Buzz
    When Je clique sur le module Buzz
    And Je saisis un message dans le champ mind "Bonjour selenium"
    And Je clique sur le bouton post
    Then Je verifie laffichage de message "Bonjour selenium"
    When Je clique sur l icone logout
    And Je clique sur le boutton logout
