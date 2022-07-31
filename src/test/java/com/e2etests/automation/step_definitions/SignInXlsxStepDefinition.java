package com.e2etests.automation.step_definitions;

import io.cucumber.java.en.When;

import com.e2etests.automation.page_objects.SignInXlsxPage;
import com.e2etests.automation.utils.Constant;
import com.e2etests.automation.utils.ExcelUtils;

public class SignInXlsxStepDefinition {
	private SignInXlsxPage signInXlsxPage;

	public SignInXlsxStepDefinition() {
		this.signInXlsxPage = new SignInXlsxPage();
	}

	@When("Je m authentifier avec un fichier excel")
	public void jeMAuthentifierAvecUnFichierExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		signInXlsxPage.signInXlsx();
		ExcelUtils.setCellData("Pass", 1, 3);
	}

}
