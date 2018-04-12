package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownTest {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brandon\\Desktop\\Selenium Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("gmail");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/a[3]")).click();
		
		//Method for tabbing.
		
		 Set<String> handles = driver.getWindowHandles();
		    String currentHandle = driver.getWindowHandle();
		    for (String handle : handles) {

		     if (!handle .equals(currentHandle))
		     {
		         driver.switchTo().window(handle);
		     }
		   }
		
		//Filling out the rest of the page.
		driver.findElement(By.id("FirstName")).sendKeys("Brandon");
		driver.findElement(By.id("LastName")).sendKeys("Pozil");
		driver.findElement(By.id("GmailAddress")).sendKeys("123456789abc");
		driver.findElement(By.id("Passwd")).sendKeys("1245poi");
		driver.findElement(By.id("PasswdAgain")).sendKeys("1245poi");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions builder = new Actions(driver);

		WebElement selectMonth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Birthday']")));
		builder.moveToElement(selectMonth);     
		selectMonth.click();

		WebElement monthOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'January']")));
		builder.moveToElement(monthOption);  
		monthOption.click();
		
		driver.findElement(By.id("BirthDay")).sendKeys("01");
		driver.findElement(By.id("BirthYear")).sendKeys("2000");
	
		WebElement selectGender = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Gender']")));
		builder.moveToElement(selectGender);
		selectGender.click();
		
		WebElement genderOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'Male']")));
		builder.moveToElement(genderOption);
		genderOption.click();
				
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("5485612357");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("abc@hotmail.com");
		
		WebElement selectLocation =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Location']")));
		builder.moveToElement(selectLocation);
		selectLocation.click();
		
		WebElement locationOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text() = 'Australia']")));
		builder.moveToElement(locationOption);
		locationOption.click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		
		}
		
	}
