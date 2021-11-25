package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Login.feature", //feature file location
		glue="stepDefinations"	//step definition location here its one so name is enough
		//dryRun = false
		)

public class testRunner {
	
	

}
