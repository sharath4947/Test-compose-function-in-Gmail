package Gmail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_Invalid_Recipient_07 extends Gmail_Login{
	
	@Test
	
	public void testcase_7() throws Throwable
	{
		WebElement Compose = driver.findElement(By.xpath("//div[@class='aic']/div/div"));
		
		Compose.click();  
		
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.xpath("//input[@class='agP aFw']"));
		
		To.sendKeys("sharath9393184947gmail.com");
		
		WebElement Subject = driver.findElement(By.cssSelector("input[name='subjectbox']"));
		
		Subject.sendKeys("Incubyte");
		
		Thread.sleep(3000);
		
		WebElement Body = driver.findElement(By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']"));
		
		Body.sendKeys("Automation QA test for Incubyte");
		
		WebElement Send = driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		
		Send.click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
