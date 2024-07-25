@buzz
Feature: Je poste une publication
  En tantque utilisateur je souhaite poster une publication

  Background: 
    Given Je me connecte a l'application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Welcome"
    When Je clique sur le module Buzz

  @post_buzz
  Scenario: Publier un post dans le modele Buzz
    And Je saisis un message dans le champ mind "Bonjour selenium"
    And Je clique sur le bouton post
    Then Je verifie laffichage de message "Bonjour selenium"

  @upload_image
  Scenario: Upload image dans  le module Buzz
    When Je clique sur muni Upload Images
    Then Je verifie placeholder "Say something about these photos"
    When Je saisie information sur l image "descriptif image"
    And Je clique sur le button Upload Images 
    And Je selectionne l image "C:\Users\Lenovo\Desktop\formation-Expert-Zied\image test\fleur.jpg"
    And Je clique sur button post
    Then Je verifie que l information sur l image est affichee "descriptif image"
    And Je verifie que l image est chargee

  @deconnexion
  Scenario: Verifier la deconnexion
    When Je clique sur l icone logout
    And Je clique sur le bouton logout
