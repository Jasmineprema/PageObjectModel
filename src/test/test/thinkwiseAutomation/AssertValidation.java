package thinkwiseAutomation;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AssertValidation {

	public static void validation() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://vvps.thinkwise.pro/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement clkAdmin = driver.findElement(By.xpath("//strong[text()='Admin']"));
		clkAdmin.click();
		Thread.sleep(2000);
		WebElement loginEmail = driver.findElement(By.id("login-email"));
		loginEmail.sendKeys("rnarayanan@thapovan-inc.com");
		Thread.sleep(2000);
		WebElement loginPassword = driver.findElement(By.id("login-password"));
		loginPassword.sendKeys("Qwerty@123");
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement adminClk = driver.findElement(By.id("academic"));
		adminClk.click();
		Thread.sleep(2000);
		WebElement clkClass = driver.findElement(By.id("classes"));
		clkClass.click();
		Thread.sleep(2000);
		driver.findElement(By.id("showAddClass")).click();
		
		Thread.sleep(2000);
		WebElement enterClassName = driver.findElement(By.id("addClassName"));
		enterClassName.sendKeys("4th std");
		Thread.sleep(2000);
		WebElement enterOrderId = driver.findElement(By.id("addClassOrder"));
		enterOrderId.sendKeys("1");
		Thread.sleep(2000);
		WebElement clkSectionPlusBtn = driver.findElement(By.xpath("//div[@class='ss-add']"));
		clkSectionPlusBtn.click();
		Thread.sleep(2000);
		WebElement selectOption = driver.findElement(By.xpath("//div[text()='12A ']"));
		selectOption.click();
		Thread.sleep(2000);
		WebElement addClassTotalMrk = driver.findElement(By.id("addClassTotalMark"));
		addClassTotalMrk.sendKeys("500");
		Thread.sleep(3000);
		WebElement clkAddBtn = driver.findElement(By.id("createClass"));
		clkAddBtn.click();
		Thread.sleep(3000);
		
		try {
		//Assert Validation
		WebElement successMsgElement = driver.findElement(By.xpath("/html/body/app-root/app-pages/div/app-classes/div[1]/div/div/app-display-success/div/ul/li[2]/label"));
		String actualMsg = successMsgElement.getText();
		System.out.println(actualMsg);
		String expectedMsg = "Success! Class Added Successfully";
		
		assertEquals(actualMsg, expectedMsg);
		}catch (Exception e) {

			System.out.println("Doesn't match Actual and Expected Msgs");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement multipleDD = driver.findElement(By.id("multiple"));
//		Select select = new Select(multipleDD);
//		
//		select.selectByVisibleText("12A ");
//	
//		List<WebElement> options = select.getOptions();
//		int size = options.size();
//		System.out.println(size);

		driver.quit();

	}

}
