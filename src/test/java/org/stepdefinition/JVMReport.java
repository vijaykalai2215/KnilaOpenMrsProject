package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonPath) {
		
		File f= new File("C:\\Users\\arsha\\Downloads\\Files\\KnilaMaven\\KnilaMaven\\AllReports");
		
		Configuration c= new Configuration(f,"KNILA");
		
		c.addClassifications("Platforms", "Windows");
		c.addClassifications("JDK Version","1.8");
		
		List<String>l= new ArrayList<String>();
		l.add(jsonPath);
		
		ReportBuilder r= new ReportBuilder(l, c);
		
		r.generateReports();
	}
}
