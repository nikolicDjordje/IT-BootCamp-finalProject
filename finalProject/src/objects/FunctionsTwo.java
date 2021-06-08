package objects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resourcec.ConstantsTwo;

public class FunctionsTwo {
	
	public static WebDriver driver;
	public static void elementsList (WebDriver driver, String s) {
		List<WebElement> elementList = driver.findElements(By.className(s));
}
	public static void clickingButton (WebDriver driver, String s) {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement search = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		search.click();
		 //driver.findElement(By.xpath(s)).click();
	}
	public static void clickingButton2 (WebDriver driver, String s) {
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement search1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id(s)));
		search1.click();
		
	}
	
	public static void inputEmployee (WebDriver driver, String s1, String s2, String s3, String s4, String s5, String s6) {
		
		//WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//WebElement search3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1)));
		//search3.findElement(By.xpath(s1)).sendKeys(s2);
		driver.findElement(By.xpath(s1)).sendKeys(s2);
		//WebDriverWait wait5 = new WebDriverWait(driver, 10);
		//WebElement search5 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s3)));
		//search5.sendKeys(s4);
		driver.findElement(By.xpath(s3)).sendKeys(s4);
		//WebDriverWait wait6 = new WebDriverWait(driver, 10);
		//WebElement search6 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s5)));
		//search6.sendKeys(s6);
		driver.findElement(By.xpath(s5)).sendKeys(s6);
	}
	public static void saveButton (WebDriver driver, String s) {
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement search2 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		search2.click();
	   // driver.findElement(By.xpath(s)).click();
	}
	
}