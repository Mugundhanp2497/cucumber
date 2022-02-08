package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class codingForFB 
{

	public static WebDriver d;
@Given("user have to enter FaceBook login page")
public void user_have_to_enter_FaceBook_login_page() 
{
	WebDriverManager.chromedriver().setup();
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.facebook.com//");
    
}

@When("valid user invalid pass")
public void valid_user_invalid_pass(String mail,String pass) 
{
	d.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
	d.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	d.findElement(By.xpath("//button[@name='login']")).click();
   
}
@When("valid user invalid pass {string} and {string}")
public void valid_user_invalid_pass_and(String mail, String pass) {
	d.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
	d.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	d.findElement(By.xpath("//button[@name='login']")).click();

  
}

@When("have to max")
public void have_to_max() 
{
d.manage().window().maximize();
}

@Then("press login")
public void press_login() 
{
	
    System.out.println("4");
}

@Then("get currentURL")
public void get_currentURL() 
{
System.out.println(d.getCurrentUrl());
}


	

}
