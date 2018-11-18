package com.qualityarc.training.sandbox;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Driver {

	@Test
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "../drivers/chromedriver_win32/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://qualityarc.com/");
		driver.manage().window().maximize();
	}

}
