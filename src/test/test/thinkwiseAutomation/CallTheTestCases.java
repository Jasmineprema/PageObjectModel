package thinkwiseAutomation;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

@Test
public class CallTheTestCases extends LoginPageTest {

	public static void callTheObjects() throws InterruptedException, IOException, ParseException {

		// Initializes the Extent report
		LoginPageTest.setupPage();

		// Verifies the test cases

		LoginPageTest.verifyLoginTest();
		LoginPageTest.verifyAcademicsPageObjects();
		LoginPageTest.verifyManageClassPage();
		LoginPageTest.emptyPage();
		LoginPageTest.validData();
		LoginPageTest.verifySectionPage();
		LoginPageTest.verifySubjectPage();
		

	}

	
}
