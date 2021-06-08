package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resourcec.LinkAdresses;
import resourcec.PasswordResources;
import resourcec.SalaryResources;

public class ChangingPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Salary.logingIn(driver);
		Salary.openingProfile(driver);
		openingPasswordSettings(driver);
		inputPassword(driver);
		saving(driver);
		
		
		
	}
	public static void openingPasswordSettings (WebDriver driver) {
		driver.findElement(By.xpath(PasswordResources.PASSWORD_XPATH)).click();
	}
	public static void inputPassword (WebDriver driver) {
		File f = new File("lozinka.xlsx");
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
				Row row = sheet.getRow(0);
				Cell c0 = row.getCell(0);
				String currentPassword = c0.toString();
				driver.findElement(By.id(PasswordResources.CURRENT_PASSWORD_ID)).sendKeys(currentPassword);
			}
				if (i == 1) {
					Row row = sheet.getRow(1);
					Cell c0 = row.getCell(0);
					String newPassword = c0.toString();
					driver.findElement(By.id(PasswordResources.NEW_PASSWORD_ID)).sendKeys(newPassword);
				}
				if (i == 2) {
					Row row = sheet.getRow(2);
					Cell c0 = row.getCell(0);
					String confirmPassword = c0.toString();
					driver.findElement(By.id(PasswordResources.NEW_PASSWORD_CONFIRM_ID)).sendKeys(confirmPassword);
				}
			}
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void saving (WebDriver driver) {
		driver.findElement(By.xpath(PasswordResources.BUTTON_XPATH)).click();
	}
}
