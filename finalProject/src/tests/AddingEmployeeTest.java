package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.Functions;
import objects.FunctionsTwo;
import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class AddingEmployeeTest {
	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	   
	@Test
	public void addingEmployeeCheck () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.STUFF_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.STUFF_XPATH);
		FunctionsTwo.clickingButton2(driver, ConstantsTwo.ADD_ID);
		FunctionsTwo.inputEmployee(driver, ConstantsTwo.NAME_XPATH, ConstantsTwo.NAME, ConstantsTwo.LAST_NAME_XPATH, ConstantsTwo.LAST_NAME, ConstantsTwo.EMAIL_XPATH, ConstantsTwo.EMAIL);
		FunctionsTwo.saveButton(driver, ConstantsTwo.SAVE_XPATH);
		driver.navigate().to(LinkAdresses.STAFF_URL);
		Assert.assertTrue(driver.getPageSource().contains(ConstantsTwo.EMAIL));
		
		}
	    
} 

