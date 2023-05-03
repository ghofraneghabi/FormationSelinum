package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestYoutube {

	public static void main(String[] args) throws InterruptedException {
	
// chemin drive 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur chrome
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//sleep
		
		Thread.sleep(5000);
		
		
		//indentifation du web element 
		WebElement zone;
		zone= driver.findElement(By.name("search_query"));
		zone.sendKeys("tunisie");
		
		WebElement   bouton;
		bouton= driver.findElement(By.id("search-icon-legacy"));
		bouton.click();
		String Url;
		Url= driver.getCurrentUrl();
		Assert.assertEquals("https://www.youtube.com/results?search_query=tunisie", Url);
		System.out.println("TEST OK");
		Thread.sleep(5000);
		WebElement   boutonF;
		boutonF= driver.findElement(By.xpath("//*[@id=\"container\"]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
		boutonF.click();
		Thread.sleep(5000);
		
		WebElement   boutonD;
		boutonD= driver.findElement(By.xpath("//*[@id=\"label\"]/yt-formatted-string"));
		boutonD.click();
	
		
	
		
		}}
		
		