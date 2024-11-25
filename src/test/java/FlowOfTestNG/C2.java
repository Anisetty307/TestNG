package FlowOfTestNG;

import org.testng.annotations.*;

public class C2 {
	
	
 @Test
  void xyz()
  {
	 System.out.println("This is xyz from C1");
  }

 @AfterTest 
 void AT()
 {
	 System.out.println("This is Aftertest method ");
 }
}
