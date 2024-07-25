package com.e2etests.automation.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class UploadImagePage {
	
	
	/* Find Element */
	
	@FindBy(how = How.ID, using = "images-tab-label")
	public static WebElement labelUploadImage;
	
	@FindBy(how = How.ID, using = "phototext")
	public static WebElement placeholderText;
	
	@FindBy(how = How.ID, using = "image-upload-button")
	public static WebElement btnUploadImage;
	
	@FindBy(how = How.ID, using = "imageUploadBtn")
	public static WebElement btnPost;

	@FindBy(how = How.CLASS_NAME, using = "postContent")
	public static List<WebElement> listInfoImg;
	
	
	@FindBy(how = How.CLASS_NAME, using = "postPhoto")
	public static List<WebElement> listImages;
	
	
	

	public UploadImagePage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	
	/* Create Methode */
	
	public void clickOnLabelUploadImage() {
		labelUploadImage.click();
	}
	public void fillImageInfo(String infoImage) {
		placeholderText.sendKeys(infoImage);
	}
	public void clickOnBtnUploadImage() {
		btnUploadImage.click();
	}
	public void uploadImage(String pathImg) {
		btnUploadImage.sendKeys(pathImg);
	}
	
	public void clickOnBtnPost() {
		 btnPost.click();
	}
	
	
	public String findDescriptImg(String infoImg) {

		String myPostIntheListImg = null;

		for (WebElement post : listInfoImg) {
			if (post.getText().equalsIgnoreCase(infoImg)) {
				myPostIntheListImg = post.getText();
				break;
			}
		}
		return myPostIntheListImg;
	}
	
	
	
	
	
	
	
	

}
