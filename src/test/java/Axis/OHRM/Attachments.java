package Axis.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


public class Attachments extends Login {

			@AfterMethod
			public void BlankDoc() {

				WebDriver driver = Login.driver;

				WebElement myinfo =  driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
				myinfo.click();
				
				
				WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
				immigration.click();
				
				WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[2]"));
				addinfo.click();
		
				WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		
				upload.sendKeys("C:\\Users\\91630\\Desktop\\Manipal QA Training\\Testing\\OHRM Testing\\OH-T15 Bug.png");
				System.out.println("File attached");
				
				WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
				comments.click();
				comments.sendKeys("Done");
				
				WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
				save.click();
				System.out.println("Saved successfully");
				
		
	}

  }

