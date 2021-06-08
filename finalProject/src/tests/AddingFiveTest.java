package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.AddingFive;
import objects.Functions;
import objects.FunctionsTwo;
import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class AddingFiveTest {

	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void checkAddingFive () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.STUFF_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.STUFF_XPATH);
		FunctionsTwo.clickingButton2(driver, ConstantsTwo.ADD_ID);
		AddingFive.addingNewName(driver, ConstantsTwo.FIRST_NAME_CLASS);
		AddingFive.addingNewLastName(driver, ConstantsTwo.LAST_NAME_CLASS);
		AddingFive.addingNewEmail(driver, ConstantsTwo.EMAIL_CLASS);
		AddingFive.savingButton(driver, ConstantsTwo.SAVE_ID);
		driver.navigate().to(LinkAdresses.STAFF_URL);
		Assert.assertTrue(driver.getPageSource().contains("prvi@email.com"));
		Assert.assertTrue(driver.getPageSource().contains("drugi@email.com"));
		Assert.assertTrue(driver.getPageSource().contains("treci@email.com"));
		Assert.assertTrue(driver.getPageSource().contains("cetvrti@email.com"));
		Assert.assertTrue(driver.getPageSource().contains("peti@email.com"));	
	}
}
