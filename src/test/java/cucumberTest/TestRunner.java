package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//feature files to be provided here
@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "src/test/java/features/",
		glue = "stepDefinations")


public class TestRunner {

}
