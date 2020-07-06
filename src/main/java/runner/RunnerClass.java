package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "C:/Users/user/Desktop/Training/POMCucumber/src/main/java/features/login.feature", //Feature File Path
		glue={"stepDefinition"}, //Step Def Path
		dryRun = false, //Check the Feature file mapping with step Def
		monochrome = true ,//Console readable Format 
		strict = true,//Shows fail Execution if there are any pending tasks.
		format = {"pretty" ,"html:test_output","json:json_output/cucumber.json",
		"junit:junit_output/cucumber.xml"} //Prints the Gherkin source with additional colors and stack traces for errors
		//		tags = {"@smokeTest,@RegressionTest"}
		)
public class RunnerClass {

}
