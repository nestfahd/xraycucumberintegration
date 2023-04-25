package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclassrepo.Base;

public class Locate extends Base {
	public static WebElement getUsername() {
		WebElement username = driver.findElement(By.id("Email"));
		return username;
	}
	public static WebElement getPassword() {
		WebElement password = driver.findElement(By.id("Password"));
		return password;
	}

	public static WebElement getLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		return loginBtn;
	}


}
