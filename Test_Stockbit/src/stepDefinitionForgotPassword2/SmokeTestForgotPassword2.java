package stepDefinitionForgotPassword2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestForgotPassword2 {

	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockbit.com/#/login");  
		Thread.sleep(1000);
	}
	
	@When("^User click forgot password$")
	public void User_click_forgot_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[1]/div[4]/p/a")).click();
	}
	
	@Then("^User input registered email$")
	public void User_input_registered_email() throws Throwable {
		driver.findElement(By.xpath("(//div[@class=\"loginshadow\"]//input")).sendKeys("crismonmanalu@gmail.com");
	}
	
	@Then("^User will not receive forgot password email$")
	public void User_will_not_receive_forgot_password_email() throws Throwable {
		driver.findElement(By.xpath("//div[@class=\"loginshadow\"]//input[@type]")).click();
	}


}
