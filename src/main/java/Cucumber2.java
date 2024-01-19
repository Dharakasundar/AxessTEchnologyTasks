import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

public class Cucumber2
{
	
		    WebDriver driver;			
		    		
		    @Given("^Open the chrome and launch the application$")					
		    public void open_the_chrome_and_launch_the_application() throws Throwable							
		    {		
				 System.setProperty("webdriver.chromediver","D:\\ChromeDriver");
					
		       driver= new ChromeDriver();					
		       driver.manage().window().maximize();			
		       driver.get("https://adactinhotelapp.com/");					
		    }		

		    @When("^Enter the Username and Password$")					
		    public void enter_the_Username_and_Password() throws Throwable 							
		    {		
		        WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));						
		        username.sendKeys("Dharakasundar");
		        WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));						
		        pass.sendKeys("YEVEVZ");
		    }		

		    @Then("^Click Login Button$")					
		    public void Login() throws Throwable 							
		    {		
		    	 WebElement loginBtn=driver.findElement(By.name("login"));
				    loginBtn.click();
							
		    }		
		    
	public static void main (String[]args) throws Throwable
{
		Cucumber2 t=new Cucumber2();
		t.open_the_chrome_and_launch_the_application() ;
		t.enter_the_Username_and_Password();
		t.Login();
}
	}
