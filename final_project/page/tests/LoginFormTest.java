package page.tests;

import org.openqa.selenium.*;
import java.util.Scanner;
import page.objects.LoginForm;
import utility.Constants;
import utility.ExcelUtils;

public class LoginFormTest {

		public static void fillForm(WebDriver wd, int i) throws Exception {
			String data;
			ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_REG);

			// user name
			LoginForm.clickUserName(wd);
			data = ExcelUtils.getCellData(i, 2);
			LoginForm.sendKeysUserName(wd, data);
			
			// password
			LoginForm.clickPassword(wd);
			data = ExcelUtils.getCellData(i, 4);
			LoginForm.sendKeysPassword(wd, data);

			// login
			LoginForm.clickLogin(wd);
			
			LoginForm.clickLogout(wd);
		}
		

		public static void testWithAllData(WebDriver wd) throws Exception {
			ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_REG);
			for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(wd, i);
				// RegistrationForm.navigateTo(wd);
		}
		}

		public static void loginManually(WebDriver wd, Scanner sc) throws Exception {
			String data;

			// user name
			LoginForm.clickUserName(wd);
			System.out.println("Enter user name: ");
			data = sc.nextLine();
			LoginForm.sendKeysUserName(wd, data);

			// password
			LoginForm.clickPassword(wd);
			System.out.println("Enter password: ");
			data = sc.nextLine();
			LoginForm.sendKeysPassword(wd, data);

			// login
			String lb = "Login";
			System.out.println("Type 'Login': ");
			if (sc.nextLine().equals(lb)) {
				LoginForm.clickLogin(wd);
			} else {
				wd.close();
			}
		}
	}
