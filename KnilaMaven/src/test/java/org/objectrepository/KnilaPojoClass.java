package org.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.KnilaUtlityClass;

public class KnilaPojoClass extends KnilaUtlityClass {

	public KnilaPojoClass() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getInpatientWard() {
		return inpatientWard;
	}

	@FindBy(id = "Inpatient Ward")
	private WebElement inpatientWard;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(xpath = "//*[contains(text(),'')]//i[@class='icon-user']")
	private WebElement iconUser;

	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement name;

	public WebElement getIconUser() {
		return iconUser;
	}

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//input[@name='familyName']")
	private WebElement familyName;

	@FindBy(id = "next-button")
	private WebElement nextButton;

	@FindBy(id = "gender-field")
	private WebElement genderField;

	@FindBy(id = "birthdateDay-field")
	private WebElement birthdateDayField;

	@FindBy(id = "birthdateMonth-field")
	private WebElement birthdateMonthField;

	@FindBy(id = "birthdateYear-field")
	private WebElement birthdateYearField;

	@FindBy(id = "address1")
	private WebElement address1;

	@FindBy(id = "address2")
	private WebElement address2;

	@FindBy(id = "cityVillage")
	private WebElement cityVillage;

	@FindBy(id = "stateProvince")
	private WebElement stateProvince;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "postalCode")
	private WebElement postalCode;

	@FindBy(name = "phoneNumber")
	private WebElement phoneNumber;

	@FindBy(xpath = "//span[@class='title' and text()='Name: ']//parent::p")
	private WebElement nameValues;

	@FindBy(xpath = "//span[@class='title' and text()='Gender: ']//parent::p")
	private WebElement genderValue;

	@FindBy(xpath = "//span[@class='title' and text()='Birthdate: ']//parent::p")
	private WebElement birthDate;

	public WebElement getBirthDate() {
		return birthDate;
	}

	@FindBy(xpath = "//span[@class='title' and text()='Address: ']//parent::p")
	private WebElement addressValue;

	@FindBy(xpath = "//span[@class='title' and text()='Phone Number: ']//parent::p")
	private WebElement PhoneValue;

	public WebElement getPhoneValue() {
		return PhoneValue;
	}

	@FindBy(id = "submit")
	private WebElement submitBtn;

	@FindBy(xpath = "//div[@class='gender-age col-auto']//span[2]")
	private WebElement textdateofbirth;

	@FindBy(xpath = "//h3[text()='General Actions']//parent::ul//div[contains(text(),'Start Visit')]")
	private WebElement startvist;

	@FindBy(id = "start-visit-with-visittype-confirm")
	private WebElement confirmStartVist;

	@FindBy(id = "attachments.attachments.visitActions.default")
	private WebElement attachments;

	@FindBy(xpath = "//textarea[@placeholder=\"Enter a caption\"]")
	private WebElement enterACaption;

	@FindBy(xpath = "//button[text()='Upload file']")
	private WebElement uploadFile;

	@FindBy(xpath = "//span[@class='visit-start-date']")
	private WebElement date;

	@FindBy(xpath = "//a[@class='button task activelist' and text()=' End Visit']")
	private WebElement endVisit;

	public WebElement getEndVisit() {
		return endVisit;
	}

	@FindBy(xpath = "(//button[text()='Yes'])[3]")
	private WebElement endVisitYes;

	public WebElement getEndVisitYes() {
		return endVisitYes;
	}

	@FindBy(id = "noVisitShowVisitCreationDialog")
	private WebElement startVist;

	public WebElement getStartVist() {
		return startVist;
	}

	@FindBy(id = "start-visit-with-visittype-confirm")
	private WebElement startVistType;

	public WebElement getStartVistType() {
		return startVistType;
	}

	@FindBy(xpath = "//a[text()=' Capture Vitals']")
	private WebElement captureVitals;

	public WebElement getCaptureVitals() {
		return captureVitals;
	}

	@FindBy(id = "w8")
	private WebElement height;

	public WebElement getHeight() {
		return height;
	}

	@FindBy(id = "w10")
	private WebElement weight;

	public WebElement getWeight() {
		return weight;
	}

	@FindBy(id = "calculated-bmi")
	private WebElement calculatedBmi;

	public WebElement getCalculatedBmi() {
		return calculatedBmi;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public WebElement getEnterACaption() {
		return enterACaption;
	}

	@FindBy(xpath = "//textarea[@placeholder='Enter a caption']")
	private WebElement fileup;

	public WebElement getFileup() {
		return fileup;
	}

	@FindBy(xpath = "//div[@class='status-container']")
	private WebElement visit;

	public WebElement getVisit() {
		return visit;
	}

	/*
	 * @FindBy(xpath = "//span[text()=' Actions ']") private WebElement actions;
	 * 
	 * public WebElement getActions() { return actions; }
	 */

	@FindBy(xpath = "//i[@class='icon-link']")
	private WebElement iconLink;

	public WebElement getIconLink() {
		return iconLink;
	}

	@FindBy(xpath = "//span[text()=' Actions ']")
	private WebElement actionDropDown;

	public WebElement getActionDropDown() {
		return actionDropDown;
	}

	@FindBy(xpath = "//a[text()='Add Past Visit']")
	private WebElement addPastVisit;

	public WebElement getAddPastVisit() {
		return addPastVisit;
	}

	@FindBy(xpath = "(//table[@class=' table-condensed']//td[@class])[25]")
	private WebElement futureDate;

	public WebElement getFutureDate() {
		return futureDate;
	}

	@FindBy(xpath = "(//label[@for='startDate'])[2]")
	private WebElement startDate;

	public WebElement getStartDate() {
		return startDate;
	}

	@FindBy(id = "retrospectiveVisitStartDate-display")
	private WebElement crDate;

	public WebElement getCrDate() {
		return crDate;
	}

	@FindBy(xpath = "//span[@class='PersonName-givenName']")
	private WebElement personName;

	public WebElement getPersonName() {
		return personName;
	}

	@FindBy(xpath = "//div[@class='row']//div[@class='col-11 col-lg-10' and contains(text(),'Delete Patient')]")
	private WebElement deletePatient;

	public WebElement getDeletePatient() {
		return deletePatient;
	}

	@FindBy(id="delete-reason")
	private WebElement deleteReason;

	public WebElement getDeleteReason() {
		return deleteReason;
	}

	@FindBy(xpath = "//input[@id='delete-reason']//parent::div//following-sibling::button[text()='Confirm']")
	private WebElement deleteReasonConfirm;

	public WebElement getDeleteReasonConfirm() {
		return deleteReasonConfirm;
	}

	@FindBy(xpath = "//p[text()='Patient has been deleted successfully']")
	private WebElement deletePatientSuccessfully;

	public WebElement getDeletePatientSuccessfully() {
		return deletePatientSuccessfully;
	}

	@FindBy(xpath = "//table[@id='patient-search-results-table']//td[2]")
	private List<WebElement> allDatas;

	public List<WebElement> getAllDatas() {
		return allDatas;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkBox1;

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox2;

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	@FindBy(id = "mergeVisitsBtn")
	private WebElement mergeVisitsBtn;

	public WebElement getMergeVisitsBtn() {
		return mergeVisitsBtn;
	}

	@FindBy(xpath = "//input[@value='Return']")
	private WebElement returnBtn;

	public WebElement getReturnBtn() {
		return returnBtn;
	}

	@FindBy(xpath = "//a[text()='Add Past Visit']")
	private WebElement pastVist;

	public WebElement getPastVist() {
		return pastVist;
	}

	// span[@class='visit-start-date' and contains(text(),'06.Jun.2024')]
	@FindBy(xpath = "//span[@class='visit-start-date']")
	private List<WebElement> visits;

	public List<WebElement> getVisits() {
		return visits;
	}

	/*
	 * @FindBy(xpath = "//span[text()=' Actions ']") private WebElement actions2;
	 * 
	 * public WebElement getActions2() { return actions2; }
	 */

	public WebElement getAttachments() {
		return attachments;
	}

	public WebElement getNameValues() {
		return nameValues;
	}

	public WebElement getGenderValue() {
		return genderValue;
	}

	public WebElement getAddressValue() {
		return addressValue;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getTextdateofbirth() {
		return textdateofbirth;
	}

	public WebElement getStartvist() {
		return startvist;
	}

	public WebElement getConfirmStartVist() {
		return confirmStartVist;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getGenderField() {
		return genderField;
	}

	public WebElement getBirthdateDayField() {
		return birthdateDayField;
	}

	public WebElement getBirthdateMonthField() {
		return birthdateMonthField;
	}

	public WebElement getBirthdateYearField() {
		return birthdateYearField;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCityVillage() {
		return cityVillage;
	}

	public WebElement getStateProvince() {
		return stateProvince;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

}
