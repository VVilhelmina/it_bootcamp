package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {

	// fields
	public static final String URL = "http://localhost/izlet/izlet/";
	// prebaciti na kraj
	private static final String USER_NAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	private static final String LOGOUT = "//a[@id='logoutBtn']";

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

	// login

	public static WebElement getLogin(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(LOGIN));
		return we;
	}

	public static void clickLogin(WebDriver wd) {
		getLogin(wd).click();
	}

	// logout

	public static WebElement getLogout(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(LOGOUT));
		return we;
	}

	public static void clickLogout(WebDriver wd) {
		getLogout(wd).click();
	}
}