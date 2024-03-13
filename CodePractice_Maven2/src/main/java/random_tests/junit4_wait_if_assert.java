package random_tests;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class junit4_wait_if_assert {
	public WebDriver driver =null;
	public String expectedTitle = "Google";
	
	@Test
	public void test1() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	

	// navigate to testing page
	driver.get("https://www.google.com");
	
	//pageload timeout
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

//	
	
	// navigate to testing page
	String actualTitle = driver.getTitle();


	if (expectedTitle.equalsIgnoreCase(actualTitle)) {
		System.out.println("Title is same");
	}else 
	System.out.println("Title is not same");		
	
	WebElement about = driver.findElement(By.xpath("//div[contains(@class,'QS5gu ud1jmf') and (text())='Anmelden' ]"));

		
	//pageload timeout
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	//assert Anmelden button is displayed
	Assert.assertEquals(true, about.isDisplayed());

	if  (about.isDisplayed()){
	System.out.println("language button displayed");
	}
	else {
		System.out.println("language button not displayed");
		
}}
}