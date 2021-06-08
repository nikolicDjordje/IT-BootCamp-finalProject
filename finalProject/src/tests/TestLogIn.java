package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.Functions;
import resourcec.Constants;
import resourcec.LinkAdresses;

public class TestLogIn {
	
	private WebDriver driver;
	
@BeforeMethod 
 public void creatingDriver () 	{
	System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
}

@Test (priority = 1)
public void logingIn () {
	Functions.openingPage(driver, LinkAdresses.HOME_URL);
	Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, Constants.NEEDED_FOR_WAIT_ID);
	String currentUrl = Functions.gettingUrl(driver);
	Assert.assertEquals(currentUrl, LinkAdresses.LOGED_IN_URL);
} 
@Test (priority = 2)
public void aboutUs () {
	Functions.openingPage(driver, LinkAdresses.HOME_URL);
	Functions.aboutUs(driver, Constants.ABOUT_US_XPATH, Constants.ABOUT_XPATH);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
		FileUtils.copyFile(scrFile, new File("D:/djordje/eclipse-workspace/finalProject/tests.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 

}