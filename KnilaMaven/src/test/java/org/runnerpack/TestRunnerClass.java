package org.runnerpack;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Downloads\\KnilaMaven\\KnilaMaven\\src\\test\\resources\\openmrs.feature",
glue = "org.stepdefinition",dryRun=false,plugin= {"json:C:\\Users\\Admin\\Downloads\\KnilaMaven\\KnilaMaven\\AllReports\\JsonReport\\knila.json"})
public class TestRunnerClass {

	@AfterClass
	public static void report() {
	
		JVMReport.generateJvmReport("C:\\Users\\Admin\\Downloads\\KnilaMaven\\KnilaMaven\\AllReports\\JsonReport\\knila.json");

	}

}
