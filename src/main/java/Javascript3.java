import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Javascript3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		// System.setProperty("webdriver.chromediver", "D:\\ChromeDriver");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
	       driver.get("https://www.facebook.com/");					

		 WebElement username=driver.findElement(By.id("email"));						
	        username.sendKeys("Gayathridharaka@gmail.com");
			js.executeScript("arguments[0].value='Gayathridharaka@gmail.com'", username);

	        WebElement password=driver.findElement(By.id("pass"));
			js.executeScript("arguments[0].value='Gaya123@'", password);
			 WebElement loginBtn=driver.findElement(By.name("login"));
				js.executeScript("arguments[0].click()", loginBtn);

	}
}
			


