package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AddPostPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddPostStepDefinition {

	private AddPostPage addPostPage;

	public AddPostStepDefinition() {
		this.addPostPage = new AddPostPage();
	}

	@When("Je clique sur le module Buzz")
	public void jeCliqueSurLeModuleBuzz() {
		addPostPage.clickOnModuleBuzz();
	}

	@When("Je saisis un message dans le champ mind {string}")
	public void jeSaisisUnMessageDansLeChampMind(String post) {
		addPostPage.fillUsernameBuzz(post);
	}

	@When("Je clique sur le bouton post")
	public void jeCliqueSurLeBoutonPost() {
		addPostPage.clickOnbtnPOst();
	}

	@Then("Je verifie laffichage de message {string}")
	public void jeVerifieLaffichageDeMessage(String myPost) {
		Assert.assertEquals(addPostPage.findMypost(myPost), myPost);
	}

}
