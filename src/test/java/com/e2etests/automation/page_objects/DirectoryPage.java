package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class DirectoryPage {

	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "menu_directory_viewDirectory")
	public static WebElement menu_directory;

	@FindBy(how = How.ID, using = "searchDirectory_emp_name_empName")
	public static WebElement champName;

	@FindBy(how = How.ID, using = "searchBtn")
	public static WebElement btnSearch;

	@FindBy(how = How.ID, using = "searchDirectory_job_title")
	public static WebElement JobTitle;

	@FindBy(how = How.ID, using = "searchDirectory_location")
	public static WebElement location;

	@FindBy(how = How.ID, using = "resultTable")
	public static List<WebElement> listDirectory;

	public DirectoryPage() {
		PageFactory.initElements(Setup.driver, this);
	}

	/* Create methods */

	public void fillName(String txt_name) {
		champName.sendKeys(txt_name);
	}

	public void clickOnbtnSearch() {
		btnSearch.click();
	}

	public void clickOnbtnDirectory() {
		menu_directory.click();
	}

	public void selectJobTileFromDropDownList(String job_titre) {
		Select select = new Select(JobTitle);
		select.selectByVisibleText(job_titre);
	}

	public void selectLocationFromDropDownList(String location_titre) {
		Select select = new Select(location);
		select.selectByVisibleText(location_titre);
	}

	public String findDirectorySearch(String infoImg) {

		String mytheListSearch = null;

		for (WebElement post : listDirectory) {
			if (post.getText().equalsIgnoreCase(infoImg)) {
				mytheListSearch = post.getText();
				break;
			}
		}
		return mytheListSearch;
	}

}
