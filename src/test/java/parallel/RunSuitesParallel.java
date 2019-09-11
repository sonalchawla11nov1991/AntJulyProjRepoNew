package parallel;

import org.testng.TestNG;
import java.util.Arrays;

public class RunSuitesParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testng =new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"\\testng.xml"}));
        testng.setSuiteThreadPoolSize(2);
        testng.run();
	}

}
