package testNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;


public class TG_StockItems {
	
	BaseMethods base;
	
	@BeforeMethod
	public void launch_ERP_Application() {
		  base = new BaseMethods();
		  base.launchBrowser();
		  base.launchERP();
		  base.loginERP();
	}
  
  @AfterMethod
  public void close_ERP_Application() {
	  base.driver.close();
  }
  
  @Test 
  public void TC_9_AddNewStockItem() {
	  base.addStockItem();
  }
  
   
}
