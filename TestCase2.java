package testCases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	//A tab function just in case.
	String switchtoWindowbyTitle(WebDriver driver, String windowTitle) {
		Set<String> handles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		for (String handle : handles) {
			driver.switchTo().window(handle);
			if (windowTitle.equalsIgnoreCase(driver.getTitle()))
				break;
		}
		
	return currentHandle;
	}
	
	
	public static void main(String[] args) {
		
	

	DesiredCapabilities ch= DesiredCapabilities.chrome();
	ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	ChromeOptions c= new ChromeOptions();
	c.merge(ch);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brandon\\Desktop\\Selenium Files\\Drivers\\chromedriver.exe");
		
				
	WebDriver driver2 = new ChromeDriver(c);
		driver2.get("https://na.leagueoflegends.com/en/");
		driver2.manage().window().maximize();
		driver2.findElement(By.cssSelector("a.continue")).click();
		driver2.findElement(By.xpath("//*[@id='riotbar-navbar']/a[2]")).click();
		driver2.findElement(By.xpath("//*[@id='toc']/div[3]/div[2]/div[3]/div[2]/div/a/img")).click();
		
		
		
		//Method for getting number items on the Items page. Also a check to make sure we got to the right page.
		
		List <WebElement> numberofItems = driver2.findElements(By.tagName("li"));
			System.out.println("Numbers of Items:" + numberofItems.size());
				int a = 0;
					if (a == 52)
						System.out.println("Verified"); 
				
				
				//This is supposed to print out the names but can't seem to that to work.
			/*	List<WebElement> namesofItems = driver2.findElements(By.xpath("//*[@id=\'item-grid-content\']/div/ul"));
			   	for(WebElement element : namesofItems) {
			   		String items = element.findElement(By.cssSelector("div.item-name")).getText();
			   		System.out.println(items); */
				
				
				driver2.findElement(By.cssSelector("input#defense-mr")).click();
				if (driver2.findElement(By.id("defense-mr")).isSelected());
					System.out.println("Magic Resist Tick Box is working");
					
					driver2.close();
	}
	
	
	
}
		            
			    

		  
				
		
	
	
		
		
	
