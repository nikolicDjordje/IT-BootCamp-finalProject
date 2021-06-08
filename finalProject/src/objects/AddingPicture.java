package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resourcec.PictureResources;

public class AddingPicture {

	public static void uploadPicture (WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PictureResources.EMPLOYEE_XPATH)));
		search.click();
		//driver.findElement(By.linkText(PictureResources.EMPLOYEE_URL)).click();
		driver.findElement(By.xpath(PictureResources.EDIT_XPATH)).click();
		WebElement choosePhoto = driver.findElement(By.id(PictureResources.UPLOAD_ID));
		choosePhoto.sendKeys("D:\\djordje\\Sa starog HDD\\kaca\\New folder\\slikaZaTest.jpg");	
		driver.findElement(By.xpath(PictureResources.SAVE_BTN_XPATH));
	}
}
