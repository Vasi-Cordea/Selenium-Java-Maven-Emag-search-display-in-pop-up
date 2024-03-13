package random_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boolean {

	public static void main(String[] args) {
		
		 
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
			
		// navigate to testing page
		driver.get("https://www.GOOGLE.COM");

		
		
		// explicit wait - to wait for the Next button to be click-able
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'QS5gu ud1jmf') and (text())='Anmelden' ]")));
	    
	    driver.findElement(By.xpath("//div[contains(@class,'QS5gu ud1jmf') and (text())='Anmelden' ]")).click();
	    
	    

boolean isdisplayed = driver.findElement(By.xpath("//div[contains(@class,'QS5gu ud1jmf') and (text())='Anmelden' ]")).isDisplayed();


if (isdisplayed){
	
	System.out.println("is displayed");
}else 
System.out.println("is not displayed");
}
}