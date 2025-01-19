package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
    features = "C:\\new java\\com.clinztech.test1\\src\\test\\resources\\google.feature",
    glue = {"stepDefnitions"})
   //format= {"pretty", "html:test-output"})
public class TestRunner1 {

}
