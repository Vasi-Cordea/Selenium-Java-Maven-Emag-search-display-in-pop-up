package Emag_automation;

import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmagSort_snow {
	
	//for executable Java setup
//	public static void main (String[] args) throws InterruptedException{		
//		 System.setProperty("webdriver.http.factory", "jdk-http-client");
	
	
	@Test
	public void test () throws InterruptedException{
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
	
	driver.manage().window().maximize();
		
	// navigate to testing page
	driver.get("https://www.emag.ro");

	
	
	// explicit wait - to wait for the Next button to be click-able
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
    wait.until(ExpectedConditions.elementToBeClickable(SelectorE.searchboxTrigger));
    
    driver.findElement(SelectorE.searchboxTrigger).sendKeys("boots head");
    
    wait.until(ExpectedConditions.elementToBeClickable(SelectorE.bootsSalomon));
	driver.findElement(SelectorE.bootsSalomon).click();
	
	 wait.until(ExpectedConditions.elementToBeClickable(SelectorE.ordoneaza));
	 driver.findElement(SelectorE.ordoneaza).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(SelectorE.pretAscend1));
	driver.findElement(SelectorE.pretAscend1).click();
	

	
	//pause code execution
	Thread.sleep(800);
	
	//get attribute text name of cheapest ADidas
		String nameBoots = driver.findElement(SelectorE.nameBoots).getText();
	
	//get attribute text value of cheapest ADidas
	String pretBoots = driver.findElement(SelectorE.pretBootsLei).getText();
	
	//String pretAdidasDecimal = driver.findElement(SelectorE.pretAdidasDecimal).getAttribute("value");
	// System.out.println("The cheapest sport shoes from Emag are: '"+pretAdidasName+ "'. Price: "+pretAdidas);
	
	  // Thread.sleep(300);
	
	driver.findElement(SelectorE.searchboxTrigger).clear();
	 driver.findElement(SelectorE.searchboxTrigger).sendKeys("snowboard salomon barbati");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(SelectorE.placiSnow));
		driver.findElement(SelectorE.placiSnow).click();
		
		 wait.until(ExpectedConditions.elementToBeClickable(SelectorE.ordoneaza));
		 driver.findElement(SelectorE.ordoneaza).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(SelectorE.pretAscend1));
		driver.findElement(SelectorE.pretAscend1).click();
		
		  Thread.sleep(600);

		//get attribute text name of cheapest snowboard
		String NameSnowBoard = driver.findElement(SelectorE.namePlaca).getText();
	
	//get attribute text value of cheapest snowboard
	String pretSnowboard = driver.findElement(SelectorE.pretBootsLei).getText();
		
	 // Thread.sleep(300);
	 
	//close browser
	 driver.close();
	 
	// pop-up confirmation with the search result for cheapest Salomon winter gear
	JFrame jFrame = new JFrame();
    JOptionPane.showMessageDialog(jFrame, "Best boots: '" +nameBoots+ "' ; price: "+pretBoots+ "\r\n" + "\r\n" +
    		"Best snowboard : '" +NameSnowBoard+ "' ; price: "+pretSnowboard);
	  

   
 

    
    
	}

          
}
