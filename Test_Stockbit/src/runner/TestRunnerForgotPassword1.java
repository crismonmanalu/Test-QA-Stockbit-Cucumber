package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@forgotpassword1"}, glue = "stepDefinitionForgotPassword1")

public class TestRunnerForgotPassword1 {

}
