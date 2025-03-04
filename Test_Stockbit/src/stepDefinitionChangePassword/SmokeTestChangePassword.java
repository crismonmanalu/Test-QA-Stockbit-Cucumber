package stepDefinitionChangePassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestChangePassword {

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
	    Thread.sleep(2000);	
	}

	@Then("^User click profile tab$")
	public void User_click_profile_tab() throws Throwable {
		if(driver.findElement(By.xpath("//div[@class=\"ant-modal-footer\"]//button[@class=\"ant-btn skip-btn ant-btn-lg\"]")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class=\"ant-modal-footer\"]//button[@class=\"ant-btn skip-btn ant-btn-lg\"]")).click();
		}
	    driver.findElement(By.xpath("//div[@class=\"menugroup-title\"]//span[@class=\"icon-menu_profile\"]")).click();
	    Thread.sleep(1000);
	}

	@Then("^User click Edit Profile button$")
	public void User_click_Edit_Profile_button() throws Throwable {
	    driver.findElement(By.xpath("//div[@class=\"profile-action-wrap\"]//a")).click();
	    Thread.sleep(1000);
	}

	@Then("^User click password tabs$")
	public void User_click_password_tabs() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"edit-profile-container\"]/div[1]/div[4]")).click();
		Thread.sleep(1000);
	}

	@Then("^User input current password$")
	public void User_input_current_password() throws Throwable {
		driver.findElement(By.xpath("//div[@class=\"securities-input-pass-wrapper\"]//input[@class=\"ant-input securities-input-pass\"]")).sendKeys("crismon123");
		Thread.sleep(1000);
	}
	
	@Then("^User click submit button$")
	public void User_click_submit_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class=\"ant-btn ok\"]")).click();
		Thread.sleep(1000);
	}
	@Then("^User input new password and confirm new password$")
	public void User_input_new_password_and_confirm_new_password() throws Throwable {
	    
		driver.findElement(By.xpath("(//div[@class=\"input-field\"]//input[@class=\"ant-input\"])[1]")).sendKeys("crismon123");
		driver.findElement(By.xpath("(//div[@class=\"input-field\"]//input[@class=\"ant-input\"])[2]")).sendKeys("crismon123");
		Thread.sleep(1000);
	}

	@Then("^User change password succesfully$")
	public void User_change_password_succesfully() throws Throwable {
		driver.findElement(By.xpath("//button[@class=\"ant-btn ok\"]")).click();
	}
}
