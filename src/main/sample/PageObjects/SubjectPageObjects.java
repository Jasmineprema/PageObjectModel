package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubjectPageObjects {

	@FindBy(id="subject")
	public static WebElement clkSubject;
	
	@FindBy(id="showAddSubjectInSec")
	public static WebElement clkAddSubjectInSec;
	
	@FindBy(id="addSubjectName")
	public static WebElement fillSubName;
	
	@FindBy(id="addSubjectOrder")
	public static WebElement fillSubOrder;
	
	@FindBy(xpath="//span[@class='arrow-down']")
	public static WebElement clkClasses;
	
	@FindBy(xpath="//div[text()='EW ']")
	public static WebElement clkSection;
	
	@FindBy(xpath="//span[@class='ss-plus']")
	public static WebElement clkSectionBtn;
	
	@FindBy(xpath="//div[text()='A']")
	public static WebElement enterSection;
	
	@FindBy(id="createSubject")
	public static WebElement clkSubjectAddBtn;
	
	
}
