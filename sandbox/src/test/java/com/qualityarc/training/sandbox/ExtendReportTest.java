package com.qualityarc.training.sandbox;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportTest {

	public static void main(String[] args) {
		 ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/Extent.html");
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(html);
		 extent.createTest("TestName").pass("Test Passed");
		 extent.flush();

	}

}
