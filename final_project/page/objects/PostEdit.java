package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostEdit {

// xpaths for editing post
	public static final String DOTS = "//i[@class='fas fa-ellipsis-v']";
	public static final String EDIT = "//i[@class='fas fa-edit']";
	public static final String TITLE = "//input[@id='title']";
	public static final String LOCATION = "//input[@id='location']";
	public static final String DROP_BUTTON = "//select[@id='transport']";
	public static final String DESCRIPTION = "//textarea[@id='description']";
	public static final String SUBMIT = "//div[@class='popupEdit']//input[@value='Post']";

	public static void postEdit(WebDriver wd) {
		List<WebElement> dots = wd.findElements(By.xpath(DOTS));
		List<WebElement> edit = wd.findElements(By.xpath(EDIT));
		dots.get(0).click();
		edit.get(0).click();
	}

	// Title
	public static WebElement getTitle(WebDriver wd) {
		WebDriverWait wait = new WebDriverWait(wd, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TITLE)));
		WebElement we = wd.findElement(By.xpath(TITLE));
		return we;
	}

	public static void clickTitle(WebDriver wd) {
		getTitle(wd).click();
		getTitle(wd).clear();
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
		getLocation(wd).clear();
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
		getDescription(wd).clear();
	}

	public static void sendDataDescription(WebDriver wd, String data) {
		getDescription(wd).sendKeys(data);
	}

	// Submit
	public static WebElement getSubmit(WebDriver wd) {
		WebElement we = wd.findElement(By.xpath(SUBMIT));
		return we;
	}

	public static void clickSubmit(WebDriver wd) {
		getSubmit(wd).click();
	}
}
