package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ResetTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/webapp/login.php");
		Thread.sleep(3000);
		driver.findElement(By.id("btnreset")).click();
		
		String uname = driver.findElement(By.id("username")).getAttribute("value");
		String password = driver.findElement(By.id("password")).getAttribute("value");
		
		if(uname.isEmpty() && password.isEmpty()) {
			System.out.println("RESET is working, Testcase is Passed");
		} else {
			System.out.println("RESET is not working, Testcase is Failed");
		}
	}
}
