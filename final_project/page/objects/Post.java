package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {

	// xpaths for making a new post
	private static final String MAKE_A_POST = "//a[contains(text(),'Make a post')]";
	private static final String TITLE = "//input[@placeholder='Naziv']";
	private static final String LOCATION = "//input[@placeholder='Lokacija']";
	//private static final String BROWSE = "//label[@class='custom-file-upload']";
	private static final String DROP_BUTTON = "//select[@name='transport']";
	private static final String DESCRIPTION = "//textarea[@placeholder='Opis']";
	private static final String POST = "//input[@value='Post']";

	// Make a post
	public static WebElement getMakeAPostButton(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(MAKE_A_POST));
		return we;
	}

	public static void clickMakeAPostButton(WebDriver wd) {
		getMakeAPostButton(wd).click();
	}

	// Title
	public static WebElement getTitle(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(TITLE));
		return we;
	}

	public static void clickTitle(WebDriver wd) {
		getTitle(wd).click();
	}

	public static void sendDataTitle(WebDriver wd, String data) {
		getTitle(wd).sendKeys(data);
	}

	// Location
	public static WebElement getLocation(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(LOCATION));
		return we;
	}

	public static void clickLocation(WebDriver wd) {
		getLocation(wd).click();
	}

	public static void sendDataLocation(WebDriver wd, String data) {
		getLocation(wd).sendKeys(data);
	}

	// Dropdown menu
	public static WebElement getDropButton(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(DROP_BUTTON));
		return we;
	}

	public static void selectDropButton(WebDriver wd, String transportation) {
		Select select = new Select(getDropButton(wd));
		select.selectByVisibleText(transportation);
	}

	// Description
	public static WebElement getDescription(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(DESCRIPTION));
		return we;
	}

	public static void clickDescription(WebDriver wd) {
		getDescription(wd).click();
	}

	public static void sendDataDescription(WebDriver wd, String data) {
		getDescription(wd).sendKeys(data);
	}

	// Post
	public static WebElement getPostButton(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(POST));
		return we;
	}

	public static void clickPostButton(WebDriver wd) {
		getPostButton(wd).click();
	}
}
