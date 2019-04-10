package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {

	// fields
	public static final String URL = "http://localhost/izlet/izlet/";
	// prebaciti na kraj
	//xpaths for registration
	private static final String FIRST_NAME = "//input[@name='firstname']";
	private static final String LAST_NAME = "//input[@name='lastname']";
	private static final String USER_NAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTER = "//input[@value='Register']";

	// first name
	public static WebElement getFirstName(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(FIRST_NAME));
		return we;
	}

	public static void clickFirstName(WebDriver wd) {
		getFirstName(wd).click();
	}

	public static void sendKeysFirstName(WebDriver wd, String str) {
		getFirstName(wd).sendKeys(str);
	}

	// last name
	public static WebElement getLastName(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(LAST_NAME));
		return we;
	}

	public static void clickLastName(WebDriver wd) {
		getLastName(wd).click();
	}

	public static void sendKeysLastName(WebDriver wd, String str) {
		getLastName(wd).sendKeys(str);
	}

	// user name
	public static WebElement getUserName(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(USER_NAME));
		return we;
	}

	public static void clickUserName(WebDriver wd) {
		getUserName(wd).click();
	}

	public static void sendKeysUserName(WebDriver wd, String str) {
		getUserName(wd).sendKeys(str);
	}

	// email
	public static WebElement getEmail(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(EMAIL));
		return we;
	}

	public static void clickEmail(WebDriver wd) {
		getEmail(wd).click();
	}

	public static void sendKeysEmail(WebDriver wd, String str) {
		getEmail(wd).sendKeys(str);
	}

	// password
	public static WebElement getPassword(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(PASSWORD));
		return we;
	}

	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String str) {
		getPassword(wd).sendKeys(str);
	}

	// register

	public static WebElement getRegister(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(REGISTER));
		return we;
	}

	public static void clickRegister(WebDriver wd) {
		getRegister(wd).click();
	}
}
