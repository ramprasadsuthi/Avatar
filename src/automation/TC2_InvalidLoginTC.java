package automation;

import org.openqa.selenium.By;

import commonMethods.BaseMethods;

public class TC2_InvalidLoginTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods();
		
		base.openBrowser();
		base.launchERP();
		base.driver.findElement(By.id("username")).clear();
		base.driver.findElement(By.id("username")).sendKeys("admin");
		base.driver.findElement(By.id("password")).clear();
		base.driver.findElement(By.id("password")).sendKeys("hello");
		base.driver.findElement(By.id("btnsubmit")).click();
		
		String emessage = base.driver.findElement(By.xpath("//div[contains(@class,'danger')]")).getText();
        
		if (emessage.contains("Incorrect")) {
			System.out.println("Test case is passed..");
		}
		else {
			System.out.println("Test case is failed..");
		}
	}   

}
