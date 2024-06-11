package org.utility;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KnilaUtlityClass {
	public static WebDriver driver;

	public static int dateOfBirth(String dobD) {
		String dobStr = dobD;

		// Parse date of birth string to LocalDate object
		LocalDate dob = LocalDate.parse(dobStr, DateTimeFormatter.ISO_DATE);

		// Get current date
		LocalDate currentDate = LocalDate.now();

		// Calculate age
		int age = calculateAge(dob, currentDate);

		/* System.out.println("Age: " + age); */
		return age;
	}

	public static int calculateAge(LocalDate dob, LocalDate currentDate) {
		int age = currentDate.getYear() - dob.getYear();

		// Adjust age if the birthday hasn't occurred yet this year
		if (currentDate.getMonthValue() < dob.getMonthValue() || (currentDate.getMonthValue() == dob.getMonthValue()
				&& currentDate.getDayOfMonth() < dob.getDayOfMonth())) {
			age--;
		}

		return age;

	}

	public static double bmiCalculation(double w, double h) {

		double weight = w;
		double height = h;
		double BMI = weight / (height * height);
		double BMIValue = BMI * 10000;
		/* System.out.println(BMIValue); */

		return BMIValue;

	}

	public static void launchChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	
	public static void maximizeChrome() {
		driver.manage().window().maximize();

	}
	public static void projectUrl() {
		driver.get("https://qa-refapp.openmrs.org/openmrs/login.htm");

	}

	public static void enterValue(WebElement e, String value) {
		e.sendKeys(value);

	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
