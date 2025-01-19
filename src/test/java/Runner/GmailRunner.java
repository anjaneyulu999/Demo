package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
    features = "src\\test\\resources\\features\\stripe.feature",
    glue = {"src\\test\\java\\stepDefnitions"})
   //format= {"pretty", "html:test-output"})
public class GmailRunner {

}
