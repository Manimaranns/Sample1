package org.test1.Cucumber1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sgmka\\eclipse-workspace\\Cucumber1\\src\\test\\java\\Features",
glue="org.stepdefinition",
 dryRun=false)

public class TestRunner {

}
