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
	
	
	
}
