package testNGScripts;

import org.testng.annotations.Test;

public class TG_priorityEx {
 
  @Test (priority=1)
  public void apple() {
	  System.out.println("This is the first testcase..");
  }
  
  @Test (priority=2)
  public void carnival() {
	  System.out.println("This is the second testcase..");
  }
  
  @Test (priority=3)
  public void belano() {
	  System.out.println("This is the third testcase..");
  }
  
}
