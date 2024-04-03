package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcademicsPageObjects {

	@FindBy(id = "academic")
	public static WebElement clkAcademics;

	@FindBy(id = "classes")
	public static WebElement clkClasses;

	@FindBy(id = "showAddClass")
	public static WebElement clkAddBtn;

}