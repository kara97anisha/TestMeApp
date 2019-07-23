package maindriverrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runner {

	public class driverclass {

		@RunWith(Cucumber.class)
		@CucumberOptions(
				features="features",
				glue= {"stepdefination"}
				)
		public class LoginTestRunner {
			
		}
	}
}