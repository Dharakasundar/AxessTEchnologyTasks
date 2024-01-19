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

public class Loginpage4
{
	
		    WebDriver driver;			
		    		
		    @Given("^Open the chrome and launch the application$")					
		    public void open_the_chrome_and_launch_the_application() throws Throwable							
		    {		
				 System.setProperty("webdriver.chromediver","D:\\ChromeDriver");
					
		       driver= new ChromeDriver();					
		       driver.manage().window().maximize();			
		       driver.get("https://www.netflix.com/in/");					
		    }		

		    @When("^Enter the Username and Password$")					
		    public void enter_the_Username_and_Password() throws Throwable 							
		    {		
		        WebElement Sigin=driver.findElement(By.xpath("//*[@id=\"signIn\"]"));						
		        Sigin.click();

		        WebElement user=driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]"));						
		        user.sendKeys("Dharakasundar2@hotmail.com");
		        WebElement pass=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));	
		        pass.sendKeys("sjkvdfmdkf");
		       
		    

		    }

		    @Then("^Click Login Button$")					
		    public void Login() throws Throwable 							
		    {		
		    	 WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button"));
		    	 loginBtn.click();

							
		    }		
		   
	public static void main (String[]args) throws Throwable
{
		Loginpage4 t=new Loginpage4();
		t.open_the_chrome_and_launch_the_application() ;
		t.enter_the_Username_and_Password();
		t.Login();
}
	}
