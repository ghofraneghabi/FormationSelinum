package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FonctionClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//implicty time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	
	
	WebElement  Bdoubleclick;
	Bdoubleclick = driver.findElement(By.id("doubleClickBtn"));
	Actions action= new Actions(driver);
	action.doubleClick(Bdoubleclick).perform();
	
	WebElement msg;
	msg= driver.findElement(By.id("doubleClickMessage"));
	String text;
	text= msg.getText();
	Assert.assertEquals(text, "You have done a double click");
	System.out.println("test ok ");
	
	
	WebElement Rightclick;
	Rightclick = driver.findElement(By.id("rightClickBtn"));
	action.contextClick(Rightclick).perform();
	
	WebElement msg2;
	msg2=driver.findElement(By.id("rightClickMessage"));
	String text2;
	text2=msg2.getText();
	Assert.assertEquals(text2,"You have done a right click");
	System.out.println("TEST 2 OK");

	WebElement boutton3;
	boutton3=driver.findElement(By.xpath("//div[3]//button[1]"));
	Actions action2=new Actions(driver);
	action2.click(boutton3).perform();
	//boutton3.click();
	WebElement message;		
    message=driver.findElement(By.id("dynamicClickMessage"));
    String text3;
    text3=message.getText();
    Assert.assertEquals("You have done a dynamic click", text3);
    System.out.println("test ok");
    
}

}
