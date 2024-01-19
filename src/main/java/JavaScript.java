
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

public class JavaScript {

	public static void main(String[] args) throws InterruptedException, IOException {

		// System.setProperty("webdriver.chromediver", "D:\\ChromeDriver");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIkqXM797WgwMV3guDAx00PgqdEAAYASAAEgK9s_D_BwE");

		WebElement Firstname = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));

		js.executeScript("arguments[0].value='Dharaka'", Firstname);

		WebElement lastname = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));

		js.executeScript("arguments[0].value='Sundar'", lastname);

		WebElement EmailId = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));

		js.executeScript("arguments[0].value='Dharaka451@gmail.com'", EmailId);

		WebElement RewriteEmailId = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));

		js.executeScript("arguments[0].value='Dharaka451@gmail.com'", RewriteEmailId);

		WebElement pass = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));

		js.executeScript("arguments[0].value='1234455'", pass);

		WebElement selectDay = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));

		js.executeScript("arguments[0].value='30'", selectDay);

		WebElement selectMonth = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));

		js.executeScript("arguments[0].value='may'", selectMonth);

		js.executeScript("arguments[0].value='may'", selectDay);
		WebElement selectyear = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		selectyear.sendKeys("1999");

		WebElement Gender = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label"));
		js.executeScript("arguments[0].click()", Gender);

		WebElement signup = driver.findElement(By
				.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		js.executeScript("arguments[0].click()", signup);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(3000);

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f1, new File("D:\\ScreenShort\\FacebookScreen.jpg"));

		js.executeScript("arguments[0].scrollIntoView()", Firstname);

		js.executeScript("arguments[0].setAttribute('style','color:Green')", Firstname);

		js.executeScript("arguments[0].style.border='2px solid Brown'", Firstname);
	}

}
