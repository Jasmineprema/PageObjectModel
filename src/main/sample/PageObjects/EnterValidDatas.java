package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterValidDatas {

	@FindBy(id="addClassName")
	public static WebElement addValidClassName;
	
	@FindBy(id="addClassOrder")
	public static WebElement addValidClassOrder;
	
	@FindBy(xpath="//span[@class='ss-plus']")
	public static WebElement clkPlusBtn;
	
	@FindBy(xpath="(//div[@class=\"ss-option\"])[6]")
	public static WebElement clkOption;
	
	@FindBy(id="addClassTotalMark")
	public static WebElement addValidClassTotalMark;
	
	@FindBy(id="createClass")
	public static WebElement clkAdd ;
//	@FindBy(xpath="//table[@class='table']")
//	public static WebElement table;
	
	@FindBy(id="showDeleteClass")
	public static WebElement delectBtn;
	
	@FindBy(id="confirmDeleteClass")
	public static WebElement clkOkBtn;
	
//	@FindBy(xpath="//h5[text()='Add Class']")
//	public static WebElement actualMsg;

	
	
}
