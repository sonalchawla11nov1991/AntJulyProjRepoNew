package suiteTwo;

import org.testng.annotations.Test;

public class TestF {
	
	@Test
	public void testC() throws InterruptedException
	{
		System.out.println("Starting Test F");
		Thread.sleep(3000);
		System.out.println("Ending Test F");
		
	}


}
