package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationZaraPage {

	/*@FindBy WebElement*/
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'SE CONNECTER')]")
	public static WebElement btnSeConnecter;
	
	@FindBy(how = How.XPATH, using = "//input[@name='logonId']")
	public static WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Démarrer la session')]")
	public static WebElement pageConnexion;
	
	public AuthentificationZaraPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	
	
	public void goToURL(String url) {
		Setup.driver.get(url);
	}
	
	public void clickOnbtnSeConnecter() {
		btnSeConnecter.click();
	}
	
	public void fillEmail(String mail) {
		email.sendKeys(mail);
	}
	public void fillPassword(String txt_password) {
		password.sendKeys(txt_password);
	}
	
}