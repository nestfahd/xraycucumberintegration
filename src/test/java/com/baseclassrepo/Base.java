package com.baseclassrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static String locationPropertyFile(String keyy) throws IOException {

		File flea = new File("src/test/resources/Property/login.properties");
		FileInputStream fishing = new FileInputStream(flea);
		Properties podd = new Properties();
		podd.load(fishing);
		String values = podd.getProperty(keyy);

		return values;

	}

	public static void click(WebElement elem) {
		elem.click();
	}

	public static void jsSendKeys(WebElement elem, String keys) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + keys + "')", elem);
	}

}
