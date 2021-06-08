package tests;
// In this method I tried to check if links directs to direct page using for loop.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Functions;
import objects.FunctionsTwo;
import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class TestCompanyPage {
	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}/*
	@Test
	public void cardChecking ()	{
		List<WebElement> elementList = driver.findElements(By.className(ConstantsTwo.ELEMENTS_CLASS));
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		SoftAssert sa = new SoftAssert();
	
		for (int i = 0; i < elementList.size(); i++) {
			if (i == 0) {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantsTwo.DASHBOARD_XPATH)));
				driver.findElement(By.xpath(ConstantsTwo.DASHBOARD_XPATH)).click();
				sa.assertEquals(driver.getTitle(), ConstantsTwo.DASHBOARD_TITLE);
			} else if(i == 1)  {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConstantsTwo.PLANING_XPATH)));
				search.click();
				//driver.findElement(By.xpath(ConstantsTwo.PLANING_XPATH)).click();
				sa.assertEquals(driver.getTitle(), ConstantsTwo.PLANING_TITLE);
			}
			else if(i == 2)  {
				elementList.get(2).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.TIME_TITLE);
			}
			else if(i == 3)  {
				elementList.get(3).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.LEAVE_TITLE);
			}
			else if(i == 4)  {
				elementList.get(4).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.TRAINING_TITLE);
			}
			else if(i == 5)  {
				elementList.get(5).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.STUFF_TITLE);
			}
			else if(i == 6)  {
				elementList.get(6).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.AVIABILITY_TITLE);
			}
			else if(i == 7)  {
				elementList.get(7).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.PAYROLL_TITLE);
			}
			else if(i == 8)  {
				elementList.get(8).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.REPORTS_TITLE);
			}
			else if(i == 9)  {
				elementList.get(9).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sa.assertEquals(driver.getTitle(), ConstantsTwo.SETTINGS_TITLE);
			}
			
		}
		sa.assertAll();
		
	} */
}
