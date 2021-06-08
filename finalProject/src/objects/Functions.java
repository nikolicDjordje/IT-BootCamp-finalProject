package objects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Functions {
	public static WebDriver driver;
 
	public static void openingPage (WebDriver driver, String s1) {
		driver.navigate().to(s1);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
	    	driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();
	    } catch (NoAlertPresentException e) {
	        e.printStackTrace();
	    }
	}
	public static void logingIn (WebDriver driver, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath(s1)).click();
			driver.findElement(By.id(s2)).sendKeys(s3);
			driver.findElement(By.name(s4)).sendKeys(s5);
			driver.findElement(By.name(s6)).click();
			org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 3);
			WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s7)));
		}
	public static void aboutUs (WebDriver driver, String s, String s1) {
		driver.findElement(By.xpath(s)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(s1)).click();
		
	}
	public static String gettingUrl (WebDriver driver) {
		return driver.getCurrentUrl();
		
	}
	
	
		
	}


