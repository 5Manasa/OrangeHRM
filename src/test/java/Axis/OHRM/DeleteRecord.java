package Axis.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class DeleteRecord extends Login {
	@AfterMethod
		  public void recordDel() {
		
		WebDriver driver = Login.driver;
  		
  		WebElement myinfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
  		myinfo.click();
  		System.out.println("My Info Page");
  		
  		WebElement Immigration=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
  		Immigration.click();
  		System.out.println("My Immigration");
  		
  		WebElement checkbox=driver.findElement(By.xpath("(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[1]"));
  		checkbox.click();
  		System.out.println("Selected Checkbox");
  		
  		WebElement delete=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
  		delete.click();
  		System.out.println("Delete record");
  		
  		WebElement alertdel=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));
  		alertdel.click();
  		System.out.println("Deleted succesfully"); 
		
	}
}
	
	
	
		  
		  		
		  		
