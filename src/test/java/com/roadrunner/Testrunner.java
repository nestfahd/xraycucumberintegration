package com.roadrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features/logDemo.feature"},
glue = {"com.steps.Stepdefination.java"},
dryRun = false,
plugin = { "html:Reports/HtmlReports.html",	"json:Reports/JsonReports.json"},
monochrome = true,
publish = true)

public class Testrunner {

}
