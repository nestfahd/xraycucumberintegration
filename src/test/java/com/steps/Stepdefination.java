package com.steps;

import com.exeute.Pageexecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefination extends Pageexecution {

	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		launchChrome();
	    
	}

	@When("Navigate to demoAPP url")
	public void navigate_to_demo_app_url() {
		launchDemoAPP();
	   
	}

	@Given("Enter username and password")
	public void enter_username_and_password() throws InterruptedException {
		enterUsername();
		enterPassword();
		
	}

	@When("Click Login button")
	public void click_login_button() {
		clickLoginButton();
	    
	}

}
