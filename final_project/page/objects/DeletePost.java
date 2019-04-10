package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeletePost {

	// class names for deleting posts
	public static final String DOTS = "fa-ellipsis-v";
	public static final String TRASH = "fa-trash-alt";

	// Dots
	public static WebElement getDots(WebDriver wd, int i) {
		List<WebElement> list = wd.findElements(By.className(DOTS));
		WebElement we = list.get(i);

		return we;
	}

	public static void clickDots(WebDriver wd, int i) {
		getDots(wd, i).click();
	}

	// Trash
	public static WebElement getTrash(WebDriver wd, int i) {
		List<WebElement> list = wd.findElements(By.className(TRASH));
		WebElement we = list.get(i);

		return we;
	}

	public static void clickTrash(WebDriver wd, int i) {
		getTrash(wd, i).click();
	}
}
