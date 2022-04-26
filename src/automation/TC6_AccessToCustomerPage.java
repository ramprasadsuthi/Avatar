package automation;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;

public class TC6_AccessToCustomerPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods(); 
		
		base.openBrowser();
		base.launchERP();
		base.loginERP();
		base.driver.findElement(By.xpath("//li[@id='mi_a_customers']")).click();
		
		String pcaption = base.driver.findElement(By.xpath("//span[@id='ewPageCaption']")).getText();
        
		if(pcaption.equals("Customers")) {
			System.out.println("Customers page is displayed, Test case passed");
		} else {
		    System.out.println("Test case failed");
		}
	}

}
