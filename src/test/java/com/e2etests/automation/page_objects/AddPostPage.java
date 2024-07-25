package com.e2etests.automation.page_objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class AddPostPage {

	/* @FindBy WebElement */
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	public static WebElement btnLogout;
	
	@FindBy(how = How.ID, using = "menu_buzz_viewBuzz")
	public static WebElement buzzModule;
	
	@FindBy(how = How.ID, using = "createPost_content")
	public static WebElement postContent;
	
	@FindBy(how = How.ID, using = "postSubmitBtn")
	public static WebElement btnPost;
	
	@FindBy(how = How.CLASS_NAME, using = "postContent")
	public static List<WebElement> listPost;
	
	@FindBy(how = How.ID, using = "rightBarHeadingMl")
	public static WebElement likedPosts;
	
	public AddPostPage() {
		PageFactory.initElements(Setup.driver, this);

	}
	/* Create methods */
	public void fillUsernameBuzz(String txt_post) {
		postContent.sendKeys(txt_post);
	}

	public void clickOnModuleBuzz() {
		buzzModule.click();
	}

	public void clickOnbtnPOst() {
		btnPost.click();
	}
	public String findMypost(String myPost) {

		String myPostIntheList = null;

		for (WebElement post : listPost) {
			if (post.getText().equalsIgnoreCase(myPost)) {
				myPostIntheList = post.getText();
				break;
			}
		}
		return myPostIntheList;
	}
	public void clickOnBtnLogout() {
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(3));
		btnLogout = wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
		btnLogout.click();
	}
	

}
