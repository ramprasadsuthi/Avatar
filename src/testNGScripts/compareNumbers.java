package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class compareNumbers {
 
  @Test
  public void compareTwoValues() {
	  int a, b; 
	  a = 30;
	  b = 50; 
	  Assert.assertEquals(a,  b);
   }
  
  @Test
   public void compareTwoNames() {
	  String s1;
	  s1 = "Selenium"; 
	  Assert.assertEquals(s1,  "Selenium");
   }
}
