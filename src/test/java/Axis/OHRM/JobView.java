package Axis.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


public class JobView extends Login {
 
	  @AfterMethod

	  public void job() {

	  		WebDriver driver = Login.driver;
	  		
	  	  		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
	  	  		myInfo.click();
	  	  		System.out.println("Clicked on myinfo");
	  	  		
	  			WebElement immi=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[6]"));
	  			immi.click();
	  			System.out.println("On Job Details Page");
	  			

		
	  			
	  }
	  }
