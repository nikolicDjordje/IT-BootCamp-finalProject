package objects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import resourcec.Constants;
import resourcec.LinkAdresses;
import resourcec.SettingsConstants;

public class LanguageChange {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		languageChange(driver, SettingsConstants.SETTING_XPATH);
	}
	public static void languageChange (WebDriver driver, String s) {
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, SettingsConstants.SETTING_XPATH);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(SettingsConstants.SETTINGS_ID)));
		search.click();
		WebElement menu = driver.findElement(By.xpath(SettingsConstants.ADD_LANGUAGE_XPATH));
		menu.click();
		List<WebElement> options = driver.findElements(By.xpath(SettingsConstants.ADD_LANGUAGE_XPATH));

		for (WebElement option : options) {
		    if (option.getText().contains(SettingsConstants.LANGUAGE_TEXT)) {
		        option.click();
		        break;
		    }
		}
		driver.findElement(By.id(SettingsConstants.BUTTON_ID)).click();
	
		}
	}

//}
