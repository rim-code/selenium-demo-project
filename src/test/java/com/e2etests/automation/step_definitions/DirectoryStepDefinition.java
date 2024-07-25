package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.DirectoryPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DirectoryStepDefinition {

	private  DirectoryPage directoryPage;

	public DirectoryStepDefinition() {
		this.directoryPage = new DirectoryPage();
	}

	@When("je clique sur le module Directory")
	public void jeCliqueSurLeModuleDirectory() {
		directoryPage.clickOnbtnDirectory();
	}

	@When("je saisie le nom dans le champ Name {string}")
	public void jeSaisieLeNomDansLeChampName(String name) {
		directoryPage.fillName(name);
	}

	@When("je choisis dans le job Title {string}")
	public void jeChoisisDansLeJobTitle(String jobTitle) {
		directoryPage.selectJobTileFromDropDownList(jobTitle);
	}

	@When("je choisis dans le location {string}")
	public void jeChoisisDansLeLocation(String locationName) {
		directoryPage.selectLocationFromDropDownList(locationName);
	}

	@When("Je clique sur le bouton Search dans le module directory")
	public void jeCliqueSurLeBoutonSearchDansLeModuleDirectory() {
		directoryPage.clickOnbtnSearch();
	}

	@Then("Je verifie le resultat de recherche {string}")
	public void jeVerifieLeResultatDeRecherche(String nameDirectory) {
		Assert.assertTrue(directoryPage.findDirectorySearch(nameDirectory).contains(nameDirectory));
	}


	
}
