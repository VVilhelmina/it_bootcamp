package page.tests;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.DeletePost;

public class DeletePostTest {

	// Use to delete first two posts
	public static void deletePost(WebDriver wd, int i) {
		DeletePost.clickDots(wd, i);
		DeletePost.clickTrash(wd, i);
	}

	public static void deletePosts(WebDriver wd, int k) throws Exception {
		for (int i = 0, j = 0; j < k; j++) {
			deletePost(wd, i);
		}
	}
}
