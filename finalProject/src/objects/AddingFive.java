package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingFive {

	public static void addingNewName (WebDriver driver, String s) {
		File f = new File("zaposleni.xlsx");
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			List<WebElement> list = driver.findElements(By.className(s));
			for (int i = 0; i < 5; i++) {
					//Row row = sheet.getRow(i);
						if (i == 0) {
						Row row = sheet.getRow(i);
						Cell c0 = row.getCell(0);
						String firstName = c0.toString();
						list.get(0).sendKeys(firstName);
					}
						else if (i == 1) {
						Row row = sheet.getRow(i);
						Cell c0 = row.getCell(0);
						String firstName = c0.toString();
						list.get(1).sendKeys(firstName);
				
					}
						else if (i == 2) {
						Row row = sheet.getRow(i);
						Cell c0 = row.getCell(0);
						String firstName = c0.toString();
						list.get(2).sendKeys(firstName);
				
					}
						else if (i == 3) {
					Row row = sheet.getRow(i);
					Cell c0 = row.getCell(0);
					String firstName = c0.toString();
					list.get(3).sendKeys(firstName);
			
				}
						else if (i == 4) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				String firstName = c0.toString();
				list.get(4).sendKeys(firstName);
		
			}
				}
				wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void addingNewLastName (WebDriver driver, String s) {
		File f = new File("zaposleni.xlsx");
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);
			List<WebElement> list = driver.findElements(By.className(s));
			for (int i = 0; i < 5; i++) {
					//Row row = sheet.getRow(i);
						if (i == 0) {
						Row row = sheet.getRow(i);
						Cell c1 = row.getCell(1);
						String firstName = c1.toString();
						list.get(0).sendKeys(firstName);
					}
						else if (i == 1) {
						Row row = sheet.getRow(i);
						Cell c1 = row.getCell(1);
						String lastName = c1.toString();
						list.get(1).sendKeys(lastName);
				
					}
						else if (i == 2) {
						Row row = sheet.getRow(i);
						Cell c1 = row.getCell(1);
						String lastName = c1.toString();
						list.get(2).sendKeys(lastName);
				
					}
						else if (i == 3) {
					Row row = sheet.getRow(i);
					Cell c1 = row.getCell(1);
					String lastName = c1.toString();
					list.get(3).sendKeys(lastName);
			
				}
						else if (i == 4) {
				Row row = sheet.getRow(i);
				Cell c1 = row.getCell(1);
				String lastName = c1.toString();
				list.get(4).sendKeys(lastName);
		
			}
				}
				wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void addingNewEmail (WebDriver driver, String s) {
			File f = new File("zaposleni.xlsx");
			try {
				InputStream is = new FileInputStream(f);
				XSSFWorkbook wb = new XSSFWorkbook(is);
				Sheet sheet = wb.getSheetAt(0);
				List<WebElement> list = driver.findElements(By.className(s));
				for (int i = 0; i < 5; i++) {
						//Row row = sheet.getRow(i);
							if (i == 0) {
							Row row = sheet.getRow(i);
							Cell c2 = row.getCell(2);
							String emailFirst = c2.toString();
							list.get(0).sendKeys(emailFirst);
						}
							else if (i == 1) {
							Row row = sheet.getRow(i);
							Cell c2 = row.getCell(2);
							String emailSecond = c2.toString();
							list.get(1).sendKeys(emailSecond);
					
						}
							else if (i == 2) {
							Row row = sheet.getRow(i);
							Cell c2 = row.getCell(2);
							String emailThird = c2.toString();
							list.get(2).sendKeys(emailThird);
					
						}
							else if (i == 3) {
						Row row = sheet.getRow(i);
						Cell c2 = row.getCell(2);
						String emailFourth = c2.toString();
						list.get(3).sendKeys(emailFourth);
				
					}
							else if (i == 4) {
					Row row = sheet.getRow(i);
					Cell c2 = row.getCell(2);
					String emailFifth = c2.toString();
					list.get(4).sendKeys(emailFifth);
			
				}
					}
					wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		public static void savingButton (WebDriver driver, String s) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(s)));
			search.click();
			//driver.findElement(By.id(s));
		}
}

	