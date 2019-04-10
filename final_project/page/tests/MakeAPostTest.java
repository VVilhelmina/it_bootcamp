package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Post;
import utility.Constants;
import utility.ExcelUtils;

public class MakeAPostTest {

	public static void fillForm(WebDriver wd, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_POST);

		// MakeAPost
		Post.clickMakeAPostButton(wd);

		// Title
		Post.clickTitle(wd);
		data = ExcelUtils.getCellData(i, 1);
		Post.sendDataTitle(wd, data);

		// Location
		Post.clickLocation(wd);
		data = ExcelUtils.getCellData(i, 2);
		Post.sendDataLocation(wd, data);

		// Description
		Post.clickDescription(wd);
		System.out.println("Enter description: ");
		data = ExcelUtils.getCellData(i, 0);
		Post.sendDataDescription(wd, data);

		// Post
		Post.clickPostButton(wd);
	}

	public static void testWithAllData(WebDriver wd) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_POST);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(wd, i);
		}
	}

	public static void postManually(WebDriver wd, Scanner sc) throws Exception {
		String data;

		// MakeAPost
		Post.clickMakeAPostButton(wd);

		// Title
		Post.clickTitle(wd);
		System.out.println("Enter post title: ");
		data = sc.nextLine();
		Post.sendDataTitle(wd, data);

		// Location
		Post.clickLocation(wd);
		System.out.println("Enter location: ");
		data = sc.nextLine();
		Post.sendDataLocation(wd, data);

		// Description
		Post.clickDescription(wd);
		System.out.println("Enter description: ");
		data = sc.nextLine();
		Post.sendDataDescription(wd, data);

		// Post
		Post.clickPostButton(wd);
	}
}