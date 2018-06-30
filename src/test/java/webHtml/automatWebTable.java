package webHtml;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automatWebTable {
	WebDriver driver;
	String url = "file:///Users/asanbaisuranov/Desktop/main.html";
	@BeforeClass
public void setUp() {
		//Setting up web browser 
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
		@Test
	public void TestWebTable() {
			driver.get(url);
			//Read and print whole table data
			WebElement element = driver.findElement(By.tagName("table"));
			System.out.println(element.getText());
			
			//Find out how many rows on the table
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='worldcup']/tbody/tr "));
			System.out.println("Number of row on table is: " + rows.size());
			
			//print all table headers. one by one
			//get all headers into a list
			//use a loop to print out
			
			List<WebElement> headers = driver.findElements(By.xpath("//table[@id='worldcup']/thead/"));
			for (WebElement webElement : headers) {
				System.out.println(webElement + " ");
				
				
			}
			//if there is needed to be specific
//			String headerPath  = "//table[@id='worldcup']/thead/tr/th";
//			List<WebElement> headers = driver.findElements(By.xpath(headerPath));
//			for (WebElement h : headers) {
//				System.out.println(h.getText());
//			}
			
			
		}

			@AfterClass
		public void EndTask() {
				driver.close();
			}
}
