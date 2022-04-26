package testNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

  @BeforeMethod
  public void openBrowser() {
	  System.out.println("This method will open the new browser");
  }
  
  @AfterMethod
  public void closeBrowser() {
	  System.out.println("This method will close the browser");
  }
  
  @BeforeTest
  public void createSampleData() {
	  System.out.println("This method will create sample test data");
	  System.out.println("----------------------------------------");
  }
  
  @AfterTest
  public void cleaningUpSampleData() {
	  System.out.println("----------------------------------------");
	  System.out.println("This method will clean up the sample test data");
	
  }
  
   
  @Test
  public void TestCase_1() {
	  System.out.println("This is the first Testcase in TestNG..");
  }
  
  @Test
  public void TestCase_2() {
	  System.out.println("This is the second Testcase in TestNG..");
  }
  
  @Test
  public void TestCase_3() {
	  System.out.println("This is the Third Testcase in TestNG..");
  }
  
}
