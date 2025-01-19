package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/com.clinztech.test1/src/test/resources/openbrowser.feature",
		 glue = {"stepDefnitions"})

public class TestRunner2 {

}
