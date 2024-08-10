package session25_DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.com", "C:\\Software\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Software\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.navigate().to(("https://www.dummyticket.com/dummy-ticket-for-visa-application/"));
		Thread.sleep(5000);
//		WebElement month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		month_drp.selectByVisibleText("Oct");
		
	}
}
