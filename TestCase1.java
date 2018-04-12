package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		/* Selenium Code establishing
		Chrome Driver Start */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brandon\\Desktop\\Selenium Files\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://facebook.com");
	}
		

}
