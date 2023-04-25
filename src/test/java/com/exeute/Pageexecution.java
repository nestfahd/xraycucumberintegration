package com.exeute;

import java.io.IOException;

import com.baseclassrepo.Base;
import com.location.Locate;

public class Pageexecution extends Locate {
	
	public static void launchChrome() {
		Base.launchChromeBrowser();
	}
	
	public static void launchDemoAPP() {
		try {
			Base.launchURL(Base.locationPropertyFile("url"));
		} catch (IOException e) {
			System.out.println("The Exception is "+e);
		}
	}
	
	public static void enterUsername() {
		try {
			Base.jsSendKeys(getUsername(), Base.locationPropertyFile("username"));
		} catch (IOException e) {
			System.out.println("The Exception of entering username "+e);
		}
	}

	public static void enterPassword() throws InterruptedException {
		try {
			Base.jsSendKeys(getPassword(), Base.locationPropertyFile("password"));
		} catch (IOException e) {
			System.out.println("The Exception of entering password "+e);
		}
		Thread.sleep(3000);
	}

	public static void clickLoginButton() {
		Base.click(getLoginBtn());
	}

}
