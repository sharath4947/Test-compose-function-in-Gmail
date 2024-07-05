package Gmail;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Verify_With_LongBody_09 extends Gmail_Login{
	
	@Test
	
	public void testcase_9() throws Throwable
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
		
		Body.sendKeys("Daisy is a social media ‘influencer’ with many followers, posting reviews on make-up and commenting on her life and current events. \r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "Last year she received a large delivery of make-up from Beauty Inc, with the understanding that she would receive sponsorship if she gave them a favorable review. Although she thought the products were substandard and cheap, she gave their products a rave review, not mentioning that she was connected to the company. \r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "She also posts multiple videos showing her six-year-old son Karl ‘unboxing’ toys and writing about his reaction. \r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "Yesterday she was contacted by Ben, Karl’s father, complaining that she should not be using Karl’s face to promote her business. \r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "In addition, she was horrified to see that in response to a number of complaints about her rave review of substandard products, Ben had posted a video of her giving her very frank opinion on Beauty’s make up, where she describes it a ‘cheap’, ‘awful’ and is very uncomplimentary about her followers. The video was taken in secret when Ben picked Karl up from the local park for a parental visit. \r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "The video has gone viral and Jane, a former friend and college but now a rival ‘influencer’, has turned a clip into a meme which itself has gone viral; she has also posted a video explaining Daisey’s editing techniques. In addition she has reported Daisy to the Advertising Standards Authority for receiving sponsorship from Beauty Inc.\r\n"
				+ "\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "Finally, Daisy notices that Twitter are using her content and the video of her true opinions in a cautionary advertising campaign, warning people about the dangers of social media, with the caption ‘Don’t be like Daisy."
				+ "The case of Daisy, a social media influencer, presents a complex scenario that touches on various ethical, legal, and social issues. The first issue is Daisy's decision to give a favorable review to Beauty Inc's substandard products in exchange for sponsorship. This action raises ethical questions about honesty, transparency, and integrity in influencer marketing. Influencers have a responsibility to their followers to provide honest reviews. By giving a false positive review, Daisy has not only deceived her followers but also potentially damaged their trust in her recommendations. This could have long-term implications for her credibility and reputation.\r\n"
				+ "\r\n"
				+ "The second issue is the use of Daisy's son, Karl, in her social media posts. This raises concerns about children's privacy and their rights in the digital age. While it is not illegal to feature children in social media posts, it is essential to consider the potential risks and implications. In this case, Karl's father, Ben, has expressed his disapproval, which suggests that Daisy did not obtain his consent. This could potentially lead to legal issues, especially if Ben decides to take legal action to protect his son's privacy.\r\n"
				+ "\r\n"
				+ "The third issue is the secret video taken by Ben, which reveals Daisy's true opinion about Beauty Inc's products. This video, which has gone viral, further damages Daisy's credibility and reputation. It also raises legal questions about privacy and consent. While Ben may have felt justified in exposing Daisy's dishonesty, the fact that he recorded her without her knowledge or consent could potentially be considered a violation of her privacy rights.\r\n"
				+ "\r\n"
				+ "The fourth issue is the actions of Jane, Daisy's former friend and now rival influencer. Jane's decision to turn a clip of the secret video into a meme and to expose Daisy's editing techniques can be seen as a form of cyberbullying. While competition among influencers is common, it is important to maintain a level of professionalism and respect. Jane's actions could potentially be seen as defamatory, especially if they cause significant harm to Daisy's reputation.\r\n"
				+ "\r\n"
				+ "The final issue is Twitter's use of Daisy's content in a cautionary advertising campaign. This raises questions about copyright and fair use. While social media platforms often have terms of service that allow them to use user-generated content, it is unclear whether this extends to using such content in advertising campaigns. Daisy could potentially have a legal claim against Twitter for unauthorized use of her content.\r\n"
				+ "\r\n"
				+ "In conclusion, this case highlights the complexities and challenges of being a social media influencer. It underscores the importance of honesty, transparency, and ethical conduct in influencer marketing. It also raises important questions about privacy, consent, and the rights of children and individuals in the digital age. Finally, it serves as a reminder of the potential legal implications of actions taken on social media, both for influencers and for the platforms that host their content.");
		
		WebElement Send = driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		
		Send.click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
