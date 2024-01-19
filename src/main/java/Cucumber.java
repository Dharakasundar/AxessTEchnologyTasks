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

public class Cucumber 
{
	
		    WebDriver driver;			
		    		
		    @Given("^Open the chrome and launch the application$")					
		    public void open_the_chrome_and_launch_the_application() throws Throwable							
		    {		
				 System.setProperty("webdriver.chromediver","D:\\ChromeDriver");
					
		       driver= new ChromeDriver();					
		       driver.manage().window().maximize();			
		       driver.get("https://www.facebook.com/");					
		    }		

		    @When("^Enter the Username and Password$")					
		    public void enter_the_Username_and_Password() throws Throwable 							
		    {		
		        WebElement username=driver.findElement(By.id("email"));						
		        username.sendKeys("Gayathridharaka@gmail.com");
		        WebElement password=driver.findElement(By.id("pass"));
			    password.sendKeys("Gaya123@");
                
		    }		

		    @Then("^Click Login Button$")					
		    public void Login() throws Throwable 							
		    {		
		    	 WebElement loginBtn=driver.findElement(By.name("login"));
				    loginBtn.click();
							
		    }		
		    
	public static void main (String[]args) throws Throwable
{
		Cucumber t=new Cucumber();
		t.open_the_chrome_and_launch_the_application() ;
		t.enter_the_Username_and_Password();
		t.Login();
}
	}



