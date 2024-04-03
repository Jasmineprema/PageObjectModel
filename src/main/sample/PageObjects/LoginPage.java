package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
//Annotate webElements using @FindBy
	
	@FindBy(xpath = "//strong[text()='Admin']")
	public static WebElement adminButton;
	
	@FindBy(id="login-email")
	public static WebElement userName;

	@FindBy(id="login-password")
	public static WebElement password;

	@FindBy(id ="btnLogin")
	public static WebElement loginBtn;

}
