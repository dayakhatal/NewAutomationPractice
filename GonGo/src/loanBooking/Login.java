package loanBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {


	public static void main(String[] args) throws InterruptedException 
	{
		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("incognito");
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 */
		
		  ChromeDriver driver= new ChromeDriver();
		  
		  //For Login
		  System.setProperty("webdriver.chrome.driver","/home/aqmtemp/Desktop/Learning/new/Docs/chromedriver");
		  
		  driver.manage().window().maximize();
		  //driver.get("https://ssgsit.serviceurl.in/tw/4010/#/login");
		  driver.get("https://ssgsit.serviceurl.in/aaramb/#/login");
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("A35940");
		  driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("password@123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(5000);
		  
		 // driver.findElement(By.id("'dealerValue'")).click();
		 // driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
		 driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper']")).click();
		 driver.findElement(By.id("mat-option-0")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("confirmStore")).click();
		 
		 driver.findElement(By.xpath("//button[@id='verify']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//aside[@class='sidebar']")).click();
		 
		 Thread.sleep(5000);


		//Instantiate Action Class        
		/*
		 * Actions actions = new Actions(driver); WebElement menuOption =
		 * driver.findElement(By.xpath("//app-apply[@class='ng-star-inserted']"));
		 * actions.moveToElement(menuOption).perform();
		 * System.out.println("Done Mouse hover on 'Music' from Menu");
		 * 
		 * WebElement selectMenuOption =
		 * driver.findElement(By.xpath("//i[@class='zmdi zmdi-account']"));
		 * selectMenuOption.click();
		 * System.out.println("Selected 'Alternative' from Menu");
		 */
		

		driver.findElement(By.xpath("//div[@class='ps-content']/child::ul/child::li/child::a/child::i")).click();
		
		driver.findElement(By.xpath("//input[@name='mobileNum']")).sendKeys("9860122801");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='mat-select-value']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='cdk-overlay-2']/child::div/child::div/child::mat-option/child::span")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='creditNum']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[@name='receiveOTP']")).click();
		 
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='otpKey']")).sendKeys("123456");
		 

		  
	}
	
}