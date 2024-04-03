package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SectionPageObjects {

	@FindBy(id="section")
	public static WebElement clkSection;
	
	@FindBy(id="showAddSection")
	public static WebElement showAddSec;
	
	@FindBy(id="alphaNumericOnly")
	public static WebElement fillSecField;
	
	@FindBy(id="addSection")
	public static WebElement clkAddBtn;
	
	}
