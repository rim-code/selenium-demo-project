package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.UploadImagePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadImageStepDefinition {

	
	private  UploadImagePage  uploadImagePage ;
	public UploadImageStepDefinition () {
		this.uploadImagePage = new UploadImagePage ();
	}
	
	
	@When("Je clique sur muni Upload Images")
	public void jeCliqueSurMuniUploadImages() {
		uploadImagePage.clickOnLabelUploadImage();
	}

	@Then("Je verifie placeholder {string}")
	public void jeVerifiePlaceholder(String PlaceholderText) {
		String placeholderTxt = UploadImagePage.placeholderText.getAttribute("placeholder");
		Assert.assertTrue(placeholderTxt.contains(PlaceholderText));
	}

	@When("Je saisie information sur l image {string}")
	public void jeSaisieInformationSurLImage(String descriptionImg) {
		uploadImagePage.fillImageInfo(descriptionImg);
	}

	@When("Je clique sur le button Upload Images")
	public void jeCliqueSurLeButtonUploadImages() {
		uploadImagePage.clickOnBtnUploadImage();
	}


	@When("Je selectionne l image {string}")
	public void jeSelectionneLImage(String pathImage) {
		uploadImagePage.uploadImage(pathImage);
	}

	
	@When("Je clique sur button post")
	public void jeCliqueSurButtonPost() {
		uploadImagePage.clickOnBtnPost();
	}

	@Then("Je verifie que l information sur l image est affichee {string}")
	public void jeVerifieQueLInformationSurLImageEstAffichee(String infoImg) {
		Assert.assertEquals(uploadImagePage.findDescriptImg(infoImg),infoImg);
	}

	@Then("Je verifie que l image est chargee")
	public void jeVerifieQueLImageEstChargee() {

	}

}
