package Gmail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_With_LongSubject_08 extends Gmail_Login{
	
	@Test
	
	public void testcase_8() throws Throwable
	{
		WebElement Compose = driver.findElement(By.xpath("//div[@class='aic']/div/div"));
		
		Compose.click();  
		
		Thread.sleep(5000);
		
		WebElement To = driver.findElement(By.xpath("//input[@class='agP aFw']"));
		
		To.sendKeys("sharath9393184947@gmail.com");
		
		WebElement Subject = driver.findElement(By.cssSelector("input[name='subjectbox']"));
		
		Subject.sendKeys("The most significant power in the current scenario is the ability to control information that consumes millions of minds. Social media, in recent times, has become a tool to control and manipulate people’s thinking. Popular social media apps like Facebook, Instagram, Twitter etc., are helping people stay connected by sharing information with just a click of a button. With their highly interactive platforms and user-friendly nature, social media are becoming more versatile and accessible.\r\n"
				+ "\r\n"
				+ "Benefits Of Social Media | It serves as an excellent education tool. Media platforms like Whatsapp and Facebook help people stay connected. Instagram and Twitter are excellent marketing tools for small and medium businesses that can’t afford to advertise. They help people keep updated with the latest news happening around the world.\r\n"
				+ "\r\n"
				+ "Disadvantages Of Social Media | Online scams and fraud are increasing with increased social media. Prolonged use of social media results in addiction and reduced attention span. Oversharing in social media leads to mean comments and bullying, ultimately affecting the user's mental health. Invasion of privacy is also a severe issue.");
		
		Thread.sleep(3000);
		
		WebElement Body = driver.findElement(By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']"));
		
		Body.sendKeys("Automation QA test for Incubyte");
		
		WebElement Send = driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		
		Send.click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
