package Testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",
glue={"stepdefinitions"})
public class parametertestrunner extends AbstractTestNGCucumberTests{

}
