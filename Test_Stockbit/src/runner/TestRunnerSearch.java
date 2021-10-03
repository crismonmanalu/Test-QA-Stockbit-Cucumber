package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@search"}, glue = "stepDefinitionSearch")
public class TestRunnerSearch {

}
