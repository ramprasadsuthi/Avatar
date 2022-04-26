package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.BaseMethods;


public class TG_Login {
	
BaseMethods base;
	
  @BeforeMethod
  public void launch_ERP_Application() {
	  base = new commonMethods.BaseMethods();
	  base.launchBrowser();
	  base.launchERP();
  }
  
  @AfterMethod
  public void close_ERP_Application() {
	  base.driver.close();
  }
  
  @Test 
  public void TC_1_LoginwithValidCredentials() {
	  base.loginERP();
  }
  
  @Test
  public void TC_2_Logout() {
	  base.loginERP();
	  base.logoutERP();
  }
  
  @Test
  public void TC_3_InvalidLogin() {
	  
	    base.driver.findElement(By.id("username")).clear();
		base.driver.findElement(By.id("username")).sendKeys("admin");
		base.driver.findElement(By.id("password")).clear();
		base.driver.findElement(By.id("password")).sendKeys("admin");
		base.driver.findElement(By.id("btnsubmit")).click();
		String alertWindow = base.driver.getWindowHandle();	
		base.driver.switchTo().window(alertWindow);
		base.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String actResult = base.driver.findElement(By.xpath("(//*[contains(text(),'Incorrect user ID or password')])[2]")).getText();
		Assert.assertEquals(actResult, "Incorrect user ID or password");
  }
  
  @Test
  public void TC_4_Reset() {
	  
	  base.driver.findElement(By.id("btnreset")).click();
	  Assert.assertTrue(base.driver.findElement(By.xpath("//input[@placeholder='User Name']")).isDisplayed());
	  Assert.assertTrue(base.driver.findElement(By.xpath("//input[@placeholder='Password']")).isDisplayed());
	  
  }
  
}
