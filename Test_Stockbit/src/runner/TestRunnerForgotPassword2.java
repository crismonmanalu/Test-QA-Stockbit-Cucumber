package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "Features", tags= {"@forgotpassword2"}, glue = "stepDefinitionForgotPassword2")

public class TestRunnerForgotPassword2 {

}
