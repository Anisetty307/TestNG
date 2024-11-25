package FlowOfTestNG;

import org.testng.annotations.*;

public class C1 {

@Test
 void abc()
 {
	System.out.println("Thi is abc from C1");
 }

 @BeforeTest
  void BT()
  {
	 System.out.println("This BeforeTest Method");
  }
	
	
}

