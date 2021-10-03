package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@login1"}, glue = "stepDefinitionLogin1")

public class TestRunnerLogin1 {

}
