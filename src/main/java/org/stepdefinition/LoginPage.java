package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPage {

	static WebDriver driver ;
	
	@Given("user should be in fb login page")
	public void user_should_be_in_fb_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@When("the user enter invalid username {string }and password {string}")
	public void the_user_enter_invalid_username_and_password(String user ,String pass) {
		WebElement usrname = driver.findElement(By.id("email"));
		usrname.sendKeys(user);
		
		WebElement usrpass = driver.findElement(By.id("pass"));
		usrpass.sendKeys(pass);
		
	}
	@When("click login btn")
	public void click_login_btn() {
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}
	
	@When("user has to navigate invalid login page")
	public void user_has_to_navigate_invalid_login_page() {
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("privacy"));
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("privacy");
		Assert.assertTrue(contains);
		System.out.println("user is in invalid page");
		//driver.quit();		
	}
}
