package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyClassPage {

	@FindBy(xpath = "//span[text()='Class Name is required'])[1]")
	public static WebElement emptyClassName;
	
	
	
	
}
