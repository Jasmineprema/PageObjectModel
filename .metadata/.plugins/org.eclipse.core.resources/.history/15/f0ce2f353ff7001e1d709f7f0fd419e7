package jsonOperations;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenJson {

	public static WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(3000);

	}

	@Test(dataProvider = "dp")
	public void login(String data) throws InterruptedException {

		String users[] = data.split(",");
		
		driver.get("https://vvps.thinkwise.pro/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-email")).sendKeys(users[0]);
		Thread.sleep(3000);
		driver.findElement(By.id("login-password")).sendKeys(users[1]);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

	}

	@DataProvider(name="dp")
	public String[] readJson() throws IOException, ParseException{
		
	try {
			
		JSONParser parser = new JSONParser();
		
		FileReader reader = new FileReader("C:\\Users\\Jasmine\\eclipse-workspace\\PageObjectModel\\jasmine.json");

		Object object = parser.parse(reader);
		
		JSONObject userLoginJsonObj= (JSONObject) object;
		
		JSONArray userLoginArray = (JSONArray) userLoginJsonObj.get("userlogin");
		
		String arr[]= new String[userLoginArray.size()];
		
		System.out.println("length is: "+arr.length);
		
		for(int i=0; i<userLoginArray.size(); i++ ) {
			
			JSONObject users=(JSONObject)userLoginArray.get(i);
			String user = (String)users.get("username");
			String pwd = (String) users.get("password");
//			driver.findElement(By.id("btnLogin")).click();
		
			arr[i]=user+ "," + pwd;
			
			
		}
		
		return arr;
		
		} catch (IOException | ParseException e) {
    
			e.printStackTrace(); // Handle or log the exception as needed
    
			return new String[0]; // Return an empty array in case of error
}
	
	}
	@AfterClass
	public void tearDown() {

		driver.quit();
	}
	
}
	
	
	
	
	
	
	

