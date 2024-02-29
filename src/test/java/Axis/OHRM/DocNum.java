package Axis.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


 public class DocNum extends Login {
            
			@AfterMethod
			public void BlankDoc() {

				WebDriver driver = Login.driver;

				WebElement myinfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
				myinfo.click();		
				
				WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
				immigration.click();
				
				WebElement addinfo = driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--text'])[1]"));
				addinfo.click();
				
				WebElement doctype = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
				doctype.click();

				WebElement docnum = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
				docnum.click();
				docnum.sendKeys("");
				String text = docnum.getText();
				String expectedTxt = "Required";
				if (text.equals(expectedTxt)) {
					System.out.println("Blank DocNum is not allowed");
				} else {
					System.out.println("DocNum is entered");
				}
				
				
//				WebElement issuedate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
//				issuedate.click();
//				issuedate.sendKeys("2019-15-02");
//				
//				WebElement expirydate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
//				expirydate.click();
//				expirydate.sendKeys("2029-28-02");
//				System.out.println("Expiry Date is entered");
//
//				WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
//				eligiblestatus.click();
//				eligiblestatus.sendKeys("Yes");
//				System.out.println("Eligible Status Entered");
//				
//
//				WebElement reviewdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
//				reviewdate.click();
//				reviewdate.sendKeys("2024-02-04");
//				System.out.println("Review Date Selected");
//				
//				WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
//				comments.click();
//				comments.sendKeys("Done");
//				System.out.println("comments are entered");
//				
				
				WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
				save.click();
				System.out.println("Unable to Save");

				WebElement cancel = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
				cancel.click();
				System.out.println("Unable to add the data");

			}

		}

  

