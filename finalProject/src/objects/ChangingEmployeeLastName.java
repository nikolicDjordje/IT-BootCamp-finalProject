package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resourcec.Constants;
import resourcec.ConstantsTwo;
import resourcec.LinkAdresses;

public class ChangingEmployeeLastName {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		Functions.openingPage(driver, LinkAdresses.HOME_URL);
		Functions.logingIn(driver, Constants.LOGIN_XPATH, Constants.EMAIL_ID, Constants.MY_EMAIL, Constants.PASSWORD_NAME, Constants.MY_PASSWORD, Constants.BUTTON_NAME, ConstantsTwo.STUFF_XPATH);
		driver.findElement(By.xpath(ConstantsTwo.STUFF_XPATH)).click();
		driver.navigate().to("https://kompanija253.humanity.com/app/staff/detail/6364899/");
		driver.findElement(By.xpath(ConstantsTwo.EDIT_XPATH)).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ConstantsTwo.LAST_NAME_ID)));
		search.clear();
		search.sendKeys("mihajlovic");
		driver.findElement(By.xpath(ConstantsTwo.SAVE_BUTTON_XPATH)).click();
	

	}

}
