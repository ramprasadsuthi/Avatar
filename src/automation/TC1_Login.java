package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("master");
		
		WebElement login = driver.findElement(By.id("btnsubmit"));
		login.click();
		
		//write the logic for validation 
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		
		System.out.println("Login page caption is : " + actResult);
		
		if (actResult.equals("Dashboard")) {
			System.out.println("Login is success, and Test Case is Passed..");
		} 
		else {
			System.out.println("Unable to Login, and Test case is Failed..");
		}

	}

}
