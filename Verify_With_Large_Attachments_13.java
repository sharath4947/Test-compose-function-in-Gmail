package Gmail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_With_Large_Attachments_13 extends Gmail_Login{
	
	@Test
	
	public void testcase_13() throws Throwable
	{
WebElement Compose = driver.findElement(By.xpath("//div[@class='aic']/div/div"));
		
		Compose.click();  
		
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.xpath("//input[@class='agP aFw']"));
		
		To.sendKeys("sharath9393184947@gmail.com");
		
		WebElement Subject = driver.findElement(By.cssSelector("input[name='subjectbox']"));
		
		Subject.sendKeys("Incubyte");
		
		Thread.sleep(3000);
		
		WebElement Body = driver.findElement(By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']"));
		
		Body.sendKeys("Automation QA test for Incubyte");
		
		WebElement file = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
		
		file.click();
		
		StringSelection ss = new StringSelection("C:\\Users\\nipun\\Downloads\\AI Art Generator for Create Stunning Artwork - Google Chrome 2023-09-11 13-32-44.mp4");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r = new Robot();
		
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Send = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		
		Send.click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
