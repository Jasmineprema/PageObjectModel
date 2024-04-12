package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamsPageObjects {
	
	
	@FindBy(xpath = "//a[text()='Exams']")
	public static WebElement clkExams;
	
	@FindBy(id = "cshowAddExam")
	public static WebElement clkExamsplusBtn;
	
	@FindBy(id="Midterm")
	public static WebElement examName;

	@FindBy(id="eaddOrderId")
	public static WebElement orderId50;
	
	@FindBy(id="cdp1")
	public static WebElement clkStartDate;
	
	@FindBy(id="cdp2")
	public static WebElement clkEndDate;
	
	@FindBy(xpath = "/html/body/app-root/app-pages/div/app-exam/div[2]/div/div/div[2]/ul/li[3]/div/div[1]/div[2]")
	public static WebElement clkClassField;
	
	@FindBy(id="cCreateExam")
	public static WebElement clkExamAddBtn;
	
	
}