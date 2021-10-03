package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@login4"}, glue = "stepDefinitionLogin4")
public class TestRunnerLogin4 {

}
