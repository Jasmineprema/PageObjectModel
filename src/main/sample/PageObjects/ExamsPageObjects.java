//package PageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class ExamsPageObjects {
//	
//	
//	@FindBy(xpath = "//a[text()='Exams']")
//	public static WebElement clkExams;
//	
//	@FindBy(id = "cshowAddExam")
//	public static WebElement clkExamsplusBtn;
//	
//	@FindBy(id="Midterm")
//	public static WebElement fillExamName;
//
//	@FindBy(id="eaddOrderId")
//	public static WebElement orderId50;
//	
//	@FindBy(id="estartdate")
//	public static WebElement clkStartDate;
//	
//	@FindBy(xpath="//span[text()='13']")
//	public static WebElement clkStartdate;
//	
//	@FindBy(id="cdp2")
//	public static WebElement clkEndDate;
//	
//	@FindBy(xpath="//span[text()='20']")
//	public static WebElement clkEnddate;
//	
//	@FindBy(xpath = "/html/body/app-root/app-pages/div/app-exam/div[2]/div/div/div[2]/ul/li[3]/div/div[1]/div[2]")
//	public static WebElement clkClassField;
//	
//	@FindBy(xpath="//div[text()='2nd ']")
//	public static WebElement enterClass;//delectsuccess=/html/body/app-root/app-pages/div/app-exam/div[1]/div/div/app-display-success/div/ul/li[2]/label
//	
//	@FindBy(id="cCreateExam")//Successmsg= /html/body/app-root/app-pages/div/app-exam/div[1]/div/div/app-display-success/div/ul/li[2]
//	public static WebElement clkExamAddBtn;
//	
//	
//	//@Test(priority = 15)
//	public static void emptyExaminations() throws InterruptedException {
//
//		PageFactory.initElements(driver, ExamsPageObjects.class);
//
//		ExamsPageObjects.clkExams.click();
//		Thread.sleep(2000);
//		ExamsPageObjects.clkExamsplusBtn.click();
//		Thread.sleep(2000);
//		ExamsPageObjects.clkExamAddBtn.click();
//
//		WebElement examName = driver.findElement(By.xpath("(//span[text()='Exam Name is required'])[1]"));
//		try {
//			String examNameReq = examName.getText();
//			System.out.println("Required msg is: " + examNameReq);
//			Assert.assertEquals(examNameReq, "Exam Name is required");
//		} catch (Exception e) {
//			System.out.println("Exam Name Required Message is Not showing");
//			e.printStackTrace();
//		}
//
//		WebElement startDate = driver.findElement(By.xpath("(//span[text()='Start Date is required'])[1]"));
//		try {
//			String startDateReq = startDate.getText();
//			System.out.println("Start Date : " + startDateReq);
//			Assert.assertEquals(startDateReq, "Start Date is required");
//		} catch (Exception e) {
//			System.out.println("Start Date Msg is not Showing");
//			e.printStackTrace();
//		}
//
//		WebElement endDate = driver.findElement(By.xpath("(//span[text()='End Date is required'])[1]"));
//		try {
//			String endDateReq = endDate.getText();
//			System.out.println("Start Date : " + endDateReq);
//			Assert.assertEquals(endDateReq, "End Date is required");
//		} catch (Exception e) {
//			System.out.println("End Date Msg is not Showing");
//			e.printStackTrace();
//		}
//	}
//
//	@Test(priority = 16)
//	public static void testExamsPage() throws InterruptedException {
//
//		PageFactory.initElements(driver, ExamsPageObjects.class);
//
//		ExamsPageObjects.fillExamName.click();
//		ExamsPageObjects.fillExamName.sendKeys(properties.getProperty("Examname"));
//		Thread.sleep(2000);
//		ExamsPageObjects.clkStartDate.click();
//		Thread.sleep(2000);
//		ExamsPageObjects.clkEndDate.click();
//		Thread.sleep(2000);
//		ExamsPageObjects.clkClassField.click();
//
//	}
//	
//	
//}
