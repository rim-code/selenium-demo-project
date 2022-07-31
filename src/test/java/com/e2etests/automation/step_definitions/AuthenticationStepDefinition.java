package com.e2etests.automation.step_definitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;
     static Logger logger = Logger.getLogger(AuthenticationStepDefinition.class);

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
		PropertyConfigurator.configure("src/main/java/log4j.properties");
	}

	/*Login */
	@Given("Je me connecte a l'application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToURL();
		logger.info("Je me connecte a l application OrangeHRM");
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
		logger.info("Je saisie le username");
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		logger.info("Je saisie le mot de passe");
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeButonLogin() {
		authenticationPage.clickOnbtnLogin();
		logger.info("Je clique sulr le button  login");
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
	}
	/*Logout*/

	@When("Je clique sur l icone logout")
	public void jeCliqueSurLIconeLogout() {
		authenticationPage.clickOniconLogout();
	}
	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() throws InterruptedException {
		Thread.sleep(2000);
		authenticationPage.clickOnbtnLogout();
	}




}
