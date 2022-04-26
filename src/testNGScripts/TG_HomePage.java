package testNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import commonMethods.BaseMethods;

public class TG_HomePage {
	
	BaseMethods base;
	
  @BeforeMethod
  public void launch_ERP_Application() {
	  base = new BaseMethods();
	  base.launchBrowser();
	  base.launchERP();
  }
  
  @AfterMethod
  public void close_ERP_Application() {
	  base.driver.close();
  }
  
  @Test 
  public void TC_5_VerifyAdminUserIsAbleToAccessTheStockItemsPage() {
	  base.loginERP();
	  base.accessStockItemsPage();
  }
  
  @Test
  public void TC_6_VerifyAdminUserIsAbleToAccessTheCustomersPage() {
	  base.loginERP();
	  base.accessCustomersPage();
  }
  
  @Test
  public void TC_7_VerifyAdminUserIsAbleToAccessTheStockCategoriesPage() {
	  
	  base.loginERP();
	  base.selectStockCategories();
  }
  
  @Test
  public void TC_8_VerifyAdminUserIsAbleToAccessTheUOMPage() {
	  
	  base.loginERP();
	  base.selectUOM();
	  
  }
}
