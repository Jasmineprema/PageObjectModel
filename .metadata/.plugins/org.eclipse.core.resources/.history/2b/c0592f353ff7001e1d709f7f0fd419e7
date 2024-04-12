package jsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.LoginPage;

public class JsonReading {
	

public void jsonReader()  throws IOException, ParseException {

		// Object creation
		JSONParser jsonParser = new JSONParser();

		try {

			FileReader fileReader = new FileReader("jasmine.json");

			Object parsedObject = jsonParser.parse(fileReader);

			// typecasting
			JSONObject jsonObject = (JSONObject) parsedObject;

			String username = (String) jsonObject.get("username");
			System.out.println("Username is: " + username);

			String password = (String) jsonObject.get("password");
			System.out.println("password is: " + password);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
		
}		
		
		
//public static ExtentReports extent;
//public static ExtentSparkReporter reporter;
//
//public static JSONObject jsonObject;
//
//public static JSONObject setupPage() throws InterruptedException, IOException, ParseException {
//
////	reporter = new ExtentSparkReporter("./TestReport.html");
////	extent = new ExtentReports();
////	extent.attachReporter(reporter);
//
//	
//
//	JSONParser parser = new JSONParser();
//
//	try (FileReader reader = new FileReader("jasmine.json")) {
//		return (JSONObject) parser.parse(reader);
//
//	}
//}
//
//public static void loginTest() throws IOException, ParseException, InterruptedException {
//
//	PageFactory.initElements(driver, LoginPage.class);
//	jsonObject = (JSONObject) jsonObject;
//	// Access data from JSON
//	Thread.sleep(3000);
//	LoginPage.adminButton.click();
//	String userName = (String) jsonObject.get("userName");
//	String password = (String) jsonObject.get("password");
//
//}
//}
		













		//		driver.findElement(By.id("login-email")).sendKeys(userName);
//		driver.findElement(By.id("login-password")).sendKeys(password);
	

	// Long age = (Long) jsonObject.get("Age");

//		JSONArray array=(JSONArray)jsonObject.get("Qualities");
//		 Iterator iterator = array.iterator();
//		 System.out.println("UserName is:"+userName);
//		 System.out.println("Password is:"+password);

//		 while(iterator.hasNext()) {
//			 
//			 System.out.println("Qualities is:"+ iterator.next());
//			
//		}


