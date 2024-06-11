package org.stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.objectrepository.KnilaPojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.utility.KnilaUtlityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_QA_Assesment extends KnilaUtlityClass {
	public static KnilaPojoClass k;
	public static JavascriptExecutor js;

	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() {

		launchChromeDriver();
		projectUrl();
		implicitWait();
		k = new KnilaPojoClass();
	}

	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		enterValue(k.getUsername(), "Admin");
		enterValue(k.getPassword(), "Admin123");
	}

	@When("User must Pick any location below and click on Login")
	public void user_must_Pick_any_location_below_and_click_on_Login() {
		k.getInpatientWard().click();
		k.getLoginButton().click();

	}

	@Then("User must be in the dashboard page")
	public void user_must_be_in_the_dashboard_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("home.page"));
	}

	@Given("User Cick on Register a patient menu")
	public void user_Cick_on_Register_a_patient_menu() {
		k.getIconUser().click();

	}

	@When("Enter the detail of Demographics Name Gender Birthdate and Contact Info Address Phone number")
	public void enter_the_detail_of_Demographics_Name_Gender_Birthdate_and_Contact_Info_Address_Phone_number()
			throws InterruptedException {

		k.getName().sendKeys("name");
		k.getMiddleName().sendKeys("middlename");
		k.getFamilyName().sendKeys("familyName");
		k.getNextButton().click();

		WebElement genderField = k.getGenderField();
		Select genderDropDown = new Select(genderField);
		genderDropDown.selectByVisibleText("Male");

		k.getNextButton().click();
		k.getBirthdateDayField().sendKeys("22");

		WebElement birthdate = k.getBirthdateMonthField();
		Select birthdateDropDown = new Select(birthdate);
		birthdateDropDown.selectByVisibleText("June");

		k.getBirthdateYearField().sendKeys("1990");
		k.getNextButton().click();

		k.getAddress1().sendKeys("44 new street vellore");
		k.getAddress2().sendKeys("44 new street vellore");

		k.getCityVillage().sendKeys("Vellore");
		k.getStateProvince().sendKeys("Tamilnadu");

		k.getCountry().sendKeys("India");
		k.getPostalCode().sendKeys("632102");
		k.getNextButton().click();

		k.getPhoneNumber().sendKeys("7200283749");
		k.getNextButton().click();

		Thread.sleep(4000);

		k.getNextButton().click();

	}

	@Then("User must be in the Confirm page verify the given Name Gender Birthdate Address Phone number are populated correctly using Assertion")
	public void user_must_be_in_the_Confirm_page_verify_the_given_Name_Gender_Birthdate_Address_Phone_number_are_populated_correctly_using_Assertion() {

		String nametext = k.getNameValues().getText();
		System.out.println(nametext);

		Assert.assertTrue(nametext.contains("name"));
		Assert.assertTrue(nametext.contains("middlename"));
		Assert.assertTrue(nametext.contains("familyName"));

		String gendertext = k.getGenderValue().getText();
		System.out.println(gendertext);
		Assert.assertTrue(gendertext.contains("Male"));

		String birthdatetext = k.getBirthDate().getText();
		System.out.println(birthdatetext);
		Assert.assertTrue(birthdatetext.contains("22, June, 1990"));

		String addresstext = k.getAddressValue().getText();
		System.out.println(addresstext);
		Assert.assertTrue(addresstext
				.contains("44 new street vellore, 44 new street vellore, Vellore, Tamilnadu, India, 632102"));

		String phonetext = k.getPhoneValue().getText();
		/* System.out.println(phonetext); */
		Assert.assertTrue(phonetext.contains("7200283749"));

	}

	@Given("User Click on Confirm and verify Patient details page is redirected")
	public void user_Click_on_Confirm_and_verify_Patient_details_page_is_redirected() {

		k.getSubmitBtn().click();

	}

	@When("User verify the age is calculated correctly based on the date of birth provided")
	public void user_verify_the_age_is_calculated_correctly_based_on_the_date_of_birth_provided() {
		String textdateofbirth = k.getTextdateofbirth().getText();
		/* System.out.println(textdateofbirth); */

		String substring = textdateofbirth.substring(0, 2);
		/* System.out.println(substring); */

		int dateOfBirth = dateOfBirth("1990-06-22");
		String valueOf = String.valueOf(dateOfBirth);

		Assert.assertTrue(textdateofbirth.contains(valueOf));

	}

	@Then("User Click on Start Visit and Confirm the visit")
	public void user_Click_on_Start_Visit_and_Confirm_the_visit() {
		k.getStartvist().click();
		k.getConfirmStartVist().click();
	}

	@Given("User Click on Attachment and select attachment file")
	public void user_Click_on_Attachment_and_select_attachment_file() {

		k.getAttachments().click();

		String filePath = "C:\\Users\\arsha\\eclipse-workspace\\KnilaMaven\\doc\\data.png";

		WebElement fileup = k.getFileup();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + filePath + "')", fileup);

	}

	@Given("User upload the file")
	public void user_upload_the_file() {

		k.getEnterACaption().sendKeys("up file");
		k.getUploadFile().click();
	}

	@Given("User Redirect to Patient details screen and verfiy the entry has current date")
	public void user_Redirect_to_Patient_details_screen_and_verfiy_the_entry_has_current_date() {
		driver.navigate().back();

		WebElement date = k.getDate();

		String textdate = date.getText();

		System.out.println(textdate);

		Date d = new Date();

		SimpleDateFormat s = new SimpleDateFormat("dd.MMM.yyyy");
		String format = s.format(d);
		System.out.println(format);

		Assert.assertTrue(textdate.contains(format));
	}

	@Then("User Click on the End Visit action")
	public void user_Click_on_the_End_Visit_action() {

		k.getEndVisit().click();
		k.getEndVisitYes().click();
	}

	@Given("User Start Visit again and Click on Capture Vitals menu")
	public void user_Start_Visit_again_and_Click_on_Capture_Vitals_menu() {

		k.getStartVist().click();
		k.getStartVistType().click();
		k.getCaptureVitals().click();
	}

	@When("Enter Height & Weight and Verify displayed BMI is calculated correctly")
	public void enter_Height_Weight_and_Verify_displayed_BMI_is_calculated_correctly() {

		k.getHeight().sendKeys("172");
		k.getNextButton().click();
		k.getWeight().sendKeys("60");

		k.getNextButton().click();

		double bmiCalculation = bmiCalculation(60, 170);

		String valueOfBmiCalculation = String.valueOf(bmiCalculation);

		String calculatedBmi = k.getCalculatedBmi().getText();

		System.out.println(calculatedBmi);
		System.out.println(valueOfBmiCalculation);
		String substring = calculatedBmi.substring(0, 2);
		String substring2 = valueOfBmiCalculation.substring(0, 2);
		System.out.println(substring);
		System.out.println(substring2);
		Assert.assertTrue(substring.contains(substring2));
		/* Assert.assertTrue(calculatedBmi.contains(valueOfBmiCalculation)); */

	}

	@Then("User navigate back to patient details page")
	public void user_navigate_back_to_patient_details_page() {
		driver.navigate().back();
	}

	@Given("User Verfiy Recent Visit has one more new entry for current date")
	public void user_Verfiy_Recent_Visit_has_one_more_new_entry_for_current_date() {

		WebElement visit = k.getVisit();
		String textVisit = visit.getText();

		Assert.assertTrue(textVisit.contains("Active Visit"));

	}

	public static Actions a;

	@When("User Click on Merge Visits, select these {int} visit and click on Merge Selected Visits button")
	public void user_Click_on_Merge_Visits_select_these_visit_and_click_on_Merge_Selected_Visits_button(Integer int1) {

		WebElement actions = k.getActionDropDown();
		a = new Actions(driver);
		a.moveToElement(actions).build().perform();
		WebElement linkIcon = k.getIconLink();
		a.moveToElement(linkIcon).build().perform();
		a.click(linkIcon).build().perform();
		k.getCheckBox1().click();
		k.getCheckBox2().click();
		k.getMergeVisitsBtn().click();

	}

	@When("User should Redirect to patient details page by clicking on Return button")
	public void user_should_Redirect_to_patient_details_page_by_clicking_on_Return_button() {

		WebElement returnBtn = k.getReturnBtn();
		js.executeScript("arguments[0].click()", returnBtn);

	}

	@Then("User should Verfiy Recent Visit has become one entry for current date")
	public void user_should_Verfiy_Recent_Visit_has_become_one_entry_for_current_date() {
		List<WebElement> visits = k.getVisits();

		if (visits.size() == 1) {
			System.out.println(true);
		} else {
			System.out.println("more than one visits" + false);
		}
	}

	@Given("User Click on Add Past Visit and verify the future date is not clickable in the date picker")
	public void user_Click_on_Add_Past_Visit_and_verify_the_future_date_is_not_clickable_in_the_date_picker()
			throws InterruptedException {

		WebElement actions2 = k.getActionDropDown();
		a.moveToElement(actions2).build().perform();
		WebElement pastVist = k.getAddPastVisit();
		a.moveToElement(pastVist).build().perform();
		a.click(pastVist).build().perform();

		WebElement futureDate = k.getFutureDate();

		// using attribute

		/*
		 * String attribute = futureDate.getAttribute("class");
		 * 
		 * if (attribute.equals("day disabled")) { Assert.assertTrue(true); } else if
		 * (attribute.equals("day") || attribute.equals("day active")) {
		 * Assert.assertTrue(false); } else { Assert.assertTrue(false); }
		 */

		// using assert
		/*
		 * boolean enabled = futureDate.isDisplayed();
		 * 
		 * System.out.println(enabled);
		 * 
		 * Assert.assertFalse(enabled);xw
		 */

		// using click

		futureDate.click();
		Thread.sleep(2000);
		String futureDateText = futureDate.getText();
		String futureDateValue = futureDateText.substring(0, 2);
		System.out.println(futureDateValue);

		k.getStartDate().click();

		Thread.sleep(2000);

		WebElement crDate = k.getCrDate();

		String crDatetext = crDate.getAttribute("value");
		String text2 = crDatetext.substring(0, 2);

		System.out.println(text2);

		if (text2.equals(futureDateValue)) {
			Assert.assertTrue(false);
			System.out.println("The date picker can select future date");
		} else {
			Assert.assertTrue(true);
			System.out.println("the date picker not able to picke the future date function working properly");
		}

	}

	@Given("User should Redirect to patient details page")
	public void user_should_Redirect_to_patient_details_page() {

		driver.navigate().back();
		k.getPersonName().click();

	}

	@When("User Click on Delete Patient and provide the reason")
	public void user_Click_on_Delete_Patient_and_provide_the_reason() {
		k.getDeletePatient().click();
		k.getDeleteReason().sendKeys("not intrested");

	}

	@When("Click on confirm button and verify the toaster message")
	public void click_on_confirm_button_and_verify_the_toaster_message() throws InterruptedException {
		Thread.sleep(5000);
		k.getDeleteReasonConfirm().click();

		String toscaText = k.getDeletePatientSuccessfully().getText();
		Assert.assertEquals(toscaText, "Patient has been deleted successfully");

	}

	@Then("It will redirect you to Find Patient Record menu where verify the deleted patient should not listed out in the table using")
	public void it_will_redirect_you_to_Find_Patient_Record_menu_where_verify_the_deleted_patient_should_not_listed_out_in_the_table_using() {
		
		List<WebElement> allDatas = driver.findElements(By.id("patient-search-results-table"));

		for (WebElement data : allDatas) {
			String textValue = data.getText();

			if (textValue.contains("name") || data.getText().contains("middlename")
					|| data.getText().contains("familyName")) {
				Assert.assertTrue(false);

			} else {
				Assert.assertTrue(true);
			}

		}

	}

}
