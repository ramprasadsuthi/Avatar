package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.BaseMethods;

public class TC8_AccessToUOMPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods(); 
		
		base.openBrowser();
		base.launchERP();
		base.loginERP();
		
		WebElement stockItem = base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']"));
		
		Actions actions = new Actions(base.driver);
		actions.moveToElement(stockItem).build().perform();
		
		WebElement uom = base.driver.findElement(By.xpath("//li[@id='mi_a_unit_of_measurement']"));
		actions.moveToElement(uom).build().perform();
		uom.click();
		
		String pcaption = base.driver.findElement(By.xpath("//span[@id='ewPageCaption']")).getText();
        
		if(pcaption.equals("Unit of Measurement")) {
			System.out.println("Unit of Measurement page is displayed, Test case passed");
		} else {
		    System.out.println("Test case failed");
		}
	}

}
