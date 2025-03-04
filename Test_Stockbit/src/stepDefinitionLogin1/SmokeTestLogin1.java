package stepDefinitionLogin1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestLogin1 {

	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockbit.com/#/login");
	}
	
	@When("^User enter valid username and valid password$")
	public void User_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("crismon");
		driver.findElement(By.id("password")).sendKeys("crismon123");
	    Thread.sleep(1000);
	}
	
	@Then("^User can login succesfully$")
	public void User_can_login_succesfully() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

}
