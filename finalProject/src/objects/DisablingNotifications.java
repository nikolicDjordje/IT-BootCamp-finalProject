package objects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resourcec.Constants;
import resourcec.LinkAdresses;
import resourcec.SettingsConstants;


public class DisablingNotifications {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		logingIn(driver);
		openingSetting(driver);
		disablingEmail(driver);
		disablingSMS(driver);
		disablingPush(driver);
		
		
		
		
	}
	public static void openingSetting (WebDriver driver) {
		driver.navigate().to("https://kompanija253.humanity.com/app/admin/settings/");
	}
	public static void disablingEmail (WebDriver driver) {
		if (driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_EMAIL_ID)).isSelected()) {
			driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_EMAIL_ID)).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			WebElement search1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SettingsConstants.BUTTON_XPATH)));
			search1.click();
			driver.navigate().refresh();
		} 
	}
	public static void disablingSMS (WebDriver driver) {
	if (driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_SMS_ID)).isSelected()) {
		driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_SMS_ID)).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement search2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SettingsConstants.BUTTON_XPATH)));
		search2.click();
		driver.navigate().refresh();
	}
	} 
	public static void disablingPush (WebDriver driver) {
		if (driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_PUSH_ID)).isSelected()) {
			driver.findElement(By.id(SettingsConstants.SETTINGS_NOTIFICATIONS_PUSH_ID)).click();
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			WebElement search3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SettingsConstants.BUTTON_XPATH)));
			search3.click();
		} 
	} 
	public static void logingIn (WebDriver driver) {
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.LOGIN_XPATH)).click();
		driver.findElement(By.id(Constants.EMAIL_ID)).sendKeys(Constants.MY_EMAIL);
		driver.findElement(By.name(Constants.PASSWORD_NAME)).sendKeys(Constants.MY_PASSWORD);
		driver.findElement(By.name(Constants.BUTTON_NAME)).click();
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 3);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(SettingsConstants.SETTINGS_ID)));
} 
}
