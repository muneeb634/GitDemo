package ConceptMaven.IntroMaven;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//executes all test cases from cmd
	//testng.xml file can be integrated with the maven by using 
	//<configuration> under surefire plugin
	
	// command to run single test - mvn -Dtest=AppiumTest test
	
	@Test
	public void BrowserAutomation() {
		
		System.out.println("BrowserAutomation");
	}
	@Test
	public void elementUi() {
		System.out.println("elementUi");
		
	}
}
