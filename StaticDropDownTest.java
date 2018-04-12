package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDownTest {

	public static void main(String[] args) {
		
		String error = "Dropdown is not working";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brandon\\Desktop\\Selenium Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
		//Method for selecting the static dropdown (done via value).
		Select dropdown=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")));
		
		Boolean dropdownWorking = driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).isDisplayed();

		if(dropdownWorking==true) {
		dropdown.selectByValue("AIP");
		}
		else {
			System.out.println(error);
		}
		
		Select dropdown2= new Select(driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")));
		
		if (dropdownWorking==true) {
			dropdown2.selectByValue("DEL");
		}
		else {
			System.out.println(error);
		}
		
	System.out.println("Dropdowns are working as intended");
	
		

	}
	
	

}
