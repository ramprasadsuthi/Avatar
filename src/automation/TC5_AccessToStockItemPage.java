package automation;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;

public class TC5_AccessToStockItemPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods(); 
		
		base.openBrowser();
		base.launchERP();
		base.loginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		
		String pcaption = base.driver.findElement(By.xpath("//span[@id='ewPageCaption']")).getText();
        
		if(pcaption.equals("Stock Items")) {
			System.out.println("Stock Item page is displayed, Test case passed");
		} else {
		    System.out.println("Test case failed");
		}
	}

}
