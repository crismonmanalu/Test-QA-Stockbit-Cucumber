package stepDefinitionLogin4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestLogin4 {
	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockbit.com/#/login");	    
	}

	@When("^User enter invalid username and invalid password$")
	public void User_enter_invalid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("crismon123");
		driver.findElement(By.id("password")).sendKeys("crismon");
	    Thread.sleep(1000);
	}

	@Then("^User cannot login succesfully$")
	public void User_cannot_login_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

}
