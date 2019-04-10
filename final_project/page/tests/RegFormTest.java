package page.tests;

import org.openqa.selenium.*;
import java.util.Scanner;
import page.objects.RegistrationForm;
import utility.Constants;
import utility.ExcelUtils;

public class RegFormTest {

	public static void fillForm(WebDriver wd, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_REG);

		// first name
		RegistrationForm.clickFirstName(wd);
		data = ExcelUtils.getCellData(i, 0);
		RegistrationForm.sendKeysFirstName(wd, data);

		// last name
		RegistrationForm.clickLastName(wd);
		data = ExcelUtils.getCellData(i, 1);
		RegistrationForm.sendKeysLastName(wd, data);

		// user name
		RegistrationForm.clickUserName(wd);
		data = ExcelUtils.getCellData(i, 2);
		RegistrationForm.sendKeysUserName(wd, data);

		// last name
		RegistrationForm.clickEmail(wd);
		data = ExcelUtils.getCellData(i, 3);
		RegistrationForm.sendKeysEmail(wd, data);

		// password
		RegistrationForm.clickPassword(wd);
		data = ExcelUtils.getCellData(i, 4);
		RegistrationForm.sendKeysPassword(wd, data);

		// register
		RegistrationForm.clickRegister(wd);
	}

	public static void testWithAllData(WebDriver wd) throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, Constants.SHEET_REG);
		for (int i = 1; i <ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillForm(wd, i);
			// RegistrationForm.navigateTo(wd);
		}
	}
	
	public static void registerManually(WebDriver driver, Scanner sc) throws Exception {
		String data;

		// first name
		RegistrationForm.clickFirstName(driver);
		System.out.println("Enter first name: ");
		data = sc.nextLine();
		RegistrationForm.sendKeysFirstName(driver, data);

		// last name
		RegistrationForm.clickLastName(driver);
		System.out.println("Enter last name: ");
		data = sc.nextLine();
		RegistrationForm.sendKeysLastName(driver, data);

		// user name
		RegistrationForm.clickUserName(driver);
		System.out.println("Enter user name: ");
		data = sc.nextLine();
		RegistrationForm.sendKeysUserName(driver, data);

		// email
		RegistrationForm.clickEmail(driver);
		System.out.println("Enter email: ");
		data = sc.nextLine();
		RegistrationForm.sendKeysEmail(driver, data);

		// password
		RegistrationForm.clickPassword(driver);
		System.out.println("Enter password: ");
		data = sc.nextLine();
		RegistrationForm.sendKeysPassword(driver, data);

		// register
		String rb = "Register";
		System.out.println("Type 'Register': ");
		if (rb.equals(sc.nextLine())) {
			RegistrationForm.clickRegister(driver);
		} else {
			driver.close();
		}
	}
}
