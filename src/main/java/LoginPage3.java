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

public class LoginPage3
{
	
		    WebDriver driver;			
		    		
		    @Given("^Open the chrome and launch the application$")					
		    public void open_the_chrome_and_launch_the_application() throws Throwable							
		    {		
				 System.setProperty("webdriver.chromediver","D:\\ChromeDriver");
					
		       driver= new ChromeDriver();					
		       driver.manage().window().maximize();			
		       driver.get("https://www.instagram.com/?hl=en");					
		    }		

		    @When("^Enter the Username and Password$")					
		    public void enter_the_Username_and_Password() throws Throwable 							
		    {		
		        WebElement username=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));						
		        username.sendKeys("Dharakasundar502024");
		        WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));						
		        pass.sendKeys("Gaya12");
		    }		

		    @Then("^Click Login Button$")					
		    public void Login() throws Throwable 							
		    {		
		    	 WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
				    loginBtn.click();
							
		    }		
		   
	public static void main (String[]args) throws Throwable
{
		LoginPage3 t=new LoginPage3();
		t.open_the_chrome_and_launch_the_application() ;
		t.enter_the_Username_and_Password();
		t.Login();
}
	}
