package Emag_automation;

import org.openqa.selenium.By;

public class SelectorE {
	
	
	public static By searchboxTrigger = By.id("searchboxTrigger");
	
	 public static By bootsSalomon= By.xpath("//span[contains(@class,'searchbox-suggestion-highlight') and normalize-space(text())='head']");
	 
	 public static By ordoneaza= By.xpath("(//span[contains(@class,'sort-control-btn-option text-truncate') and normalize-space(text())='Relevanta'])[1]");
	 public static By pretAscend1= By.xpath("//a[contains(@class,'js-sort-option') and normalize-space(text())='Pret descrescator' ]");
	 

	 
      //name of cheapest sport shoes
	 public static By nameBoots= By.xpath("(//a[contains(@class,'card-v2-title semibold mrg-btm-xxs js-product-url') ])[2]");
	 public static By pretBootsLei= By.xpath("(//p[@class='product-new-price'])[1]");
	 
	 public static By placiSnow= By.xpath("//span[contains(@class,'searchbox-suggestion-highlight') and normalize-space(text())='snowboard']");
	
			 public static By namePlaca= By.xpath("(//div//a[contains(@class,'card-v2-title semibold mrg-btm-xxs js-product-url') ])[1]");
}
