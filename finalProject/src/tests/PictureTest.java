package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objects.AddingPicture;
import objects.Functions;
import objects.FunctionsTwo;
import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class PictureTest {

	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void pictureCheck () {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.STUFF_XPATH);
		FunctionsTwo.clickingButton(driver, ConstantsTwo.STUFF_XPATH);
		AddingPicture.uploadPicture(driver);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(scrFile, new File("D:/djordje/eclipse-workspace/finalProject/tests2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
