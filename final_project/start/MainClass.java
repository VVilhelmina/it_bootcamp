package start;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.tests.DeletePostTest;
import page.tests.LoginFormTest;
import page.tests.MakeAPostTest;
import page.tests.PostEditTest;
import page.tests.RegFormTest;

public class MainClass {

	public static void main(String[] args) {

		// Initializing driver
		WebDriver wd = new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		try {
			wd.get(utility.Constants.URL);
			RegFormTest.testWithAllData(wd);
			RegFormTest.registerManually(wd, sc);
			LoginFormTest.testWithAllData(wd);
			LoginFormTest.loginManually(wd, sc);
			MakeAPostTest.testWithAllData(wd);
			MakeAPostTest.postManually(wd, sc);
			DeletePostTest.deletePosts(wd, 2);
			PostEditTest.postEditManually(wd, sc);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		sc.close();
	}
}
