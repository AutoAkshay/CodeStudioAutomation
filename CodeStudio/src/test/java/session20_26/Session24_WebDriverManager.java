package session20_26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session24_WebDriverManager {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
