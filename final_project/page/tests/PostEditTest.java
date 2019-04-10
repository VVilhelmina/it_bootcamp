package page.tests;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import page.objects.PostEdit;

public class PostEditTest {

	public static void postEditManually(WebDriver wd, Scanner sc) throws Exception {
		String data;

		PostEdit.postEdit(wd);

		// Title
		PostEdit.clickTitle(wd);
		System.out.println("Enter new post title: ");
		data = sc.nextLine();
		PostEdit.sendDataTitle(wd, data);

		// Location
		PostEdit.clickLocation(wd);
		System.out.println("Enter new location: ");
		data = sc.nextLine();
		PostEdit.sendDataLocation(wd, data);

		// Description
		PostEdit.clickDescription(wd);
		System.out.println("Enter new description: ");
		data = sc.nextLine();
		PostEdit.sendDataDescription(wd, data);

		// Submit
		PostEdit.clickSubmit(wd);
	}
}