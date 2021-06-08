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
import org.testng.asserts.SoftAssert;

import objects.Functions;
import objects.FunctionsTwo;
import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class TestCompany {
	
	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void checkDashboard () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.DASHBOARD_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.DASHBOARD_TITLE);
	}
	@Test(priority = 2)
	public void checkPlaning () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.PLANING_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.PLANING_TITLE);
	}
	@Test (priority = 3)
	public void checkTimeClock () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.TIME_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.TIME_TITLE);
	}
	@Test (priority = 4)
	public void checkLeave () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.LEAVE_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.LEAVE_TITLE);
	}
	@Test (priority = 5)
	public void checkTraining () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.TRAINING_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.TRAINING_TITLE);
	}
	@Test (priority = 6)
	public void checkStaff () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.STUFF_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.STUFF_TITLE);
	}
	@Test (priority = 7)
	public void checkPayroll () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.PAYROLL_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.PAYROLL_TITLE);
	}
	@Test (priority = 8)
	public void checkReports () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.REPORTS_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.REPORTS_TITLE);
	}
	@Test (priority = 9)
	public void checkSettings () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.SETTINGS_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.SETTINGS_TITLE);
	}
	@Test (priority = 10)
	public void checkAviability () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.DASHBOARD_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.AVIABILITY_XPATH);
		Assert.assertEquals(driver.getTitle(), ConstantsTwo.AVIABILITY_TITLE);
	}
	
	

}
