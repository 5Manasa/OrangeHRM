package Axis.OHRM;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {

	public static WebDriver driver;

@SuppressWarnings("deprecation")
@Test
  public void HRMLogin() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91630\\Documents\\NewChromeDriver\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Actions builder = new Actions(driver);

			WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));

			org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(username).click()
					.keyDown(username, Keys.INSERT).sendKeys(username, "admin").build();
			seriesofact.perform();

			WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

			org.openqa.selenium.interactions.Action seriesofact1 = builder.moveToElement(password).click()
					.keyDown(password, Keys.INSERT).sendKeys(password, "admin123").build();
			seriesofact1.perform();

			WebElement loginbutton = driver.findElement(
					By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
			loginbutton.click();

  }
}
