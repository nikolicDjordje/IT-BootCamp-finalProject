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
import resourcec.SalaryResources;

public class Salary {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		logingIn(driver);
		openingProfile(driver);
		openingEdit(driver);
		inputSalary(driver);
		saving(driver);
	}
	public static void logingIn (WebDriver driver) {
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.LOGIN_XPATH)).click();
		driver.findElement(By.id(Constants.EMAIL_ID)).sendKeys(Constants.MY_EMAIL);
		driver.findElement(By.name(Constants.PASSWORD_NAME)).sendKeys(Constants.MY_PASSWORD);
		driver.findElement(By.name(Constants.BUTTON_NAME)).click();
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SalaryResources.PROFILE_XPATH)));
} 

	public static void openingProfile (WebDriver driver) {
		driver.findElement(By.xpath(SalaryResources.PROFILE_XPATH)).click();
		driver.findElement(By.xpath(SalaryResources.CHOOSE_XPATH)).click();
	}
	public static void openingEdit (WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SalaryResources.EDIT_XPATH)));
		search.click(); 
		
	}
	public static void inputSalary (WebDriver driver) {
		driver.findElement(By.id(SalaryResources.SALARY_FIELD_ID)).sendKeys(SalaryResources.MY_SALARY);
	}
	public static void saving (WebDriver driver) {
		driver.findElement(By.xpath(SalaryResources.SAVE_BUTTON_XPATH)).click();
	}

}
