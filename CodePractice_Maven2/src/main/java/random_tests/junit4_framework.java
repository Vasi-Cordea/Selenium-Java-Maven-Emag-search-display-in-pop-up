package random_tests;

import java.time.Duration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class junit4_framework {
	
	public WebDriver driver =null;
	public String expectedTitle = "Google";
	

@Before
public void init() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	

	// navigate to testing page
	driver.get("https://www.google.com");
	
	//pageload timeout
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	//selenium 4 wait example
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'FYXSad') and (text())='de' ]")));
//	
//	//assert button is displayed
//	WebElement about = driver.findElement(By.xpath("//div[contains(@class,'FYXSad') and (text())='de' ]"));
//	Assert.assertEquals(true, about.isDisplayed());
//	
//	System.out.println("language button displayed");
	;

 }	



@Test
	 
	public void verifyTitle() {

	
// navigate to testing page
String actualTitle = driver.getTitle();


if (expectedTitle.equalsIgnoreCase(actualTitle)) {
	System.out.println("Title is same");
}else 
System.out.println("Title is not same");
	
}


@Test
public void verifylanguage() {
	
//selenium 4 wait example
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'FYXSad') and (text())='de' ]")));

//assert button is displayed
WebElement about = driver.findElement(By.xpath("//div[contains(@class,'FYXSad') and (text())='de' ]"));
Assert.assertEquals(true, about.isDisplayed());

System.out.println("language button displayed");
;
}
@After
	public void teardown() {
		
		driver.close();
	 }
}
