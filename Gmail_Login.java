package Gmail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Login {
	
 public WebDriver driver;

@BeforeClass

public void openApp()
{

	
    driver = new ChromeDriver();
	
    driver.manage().window().maximize();
        
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://mail.google.com/");
    
}

@BeforeMethod

public void Login() throws Throwable

{
	
	WebElement Gmail_id = driver.findElement(By.cssSelector("input[type='email']"));
	
	Gmail_id.sendKeys("officialuse3110@gmail.com");
	
//	Thread.sleep(3000);
	
	WebElement Next = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	
	Next.click();
	
	Thread.sleep(3000);
	
	WebElement Password = driver.findElement(By.name("Passwd"));
	
	Password.sendKeys("Office@3110");
	
	Thread.sleep(3000);
	
	WebElement Next1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	
	Next1.click();
	
	Thread.sleep(3000);
	

}

}