package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe"); 
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//implicty time
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				WebElement User,password,login;
				User= driver.findElement(By.id("user-name"));
				password= driver.findElement(By.id("password"));
				//actions 
				User.sendKeys("standard_user");
				password.sendKeys("secret_sauce");
				
				
				login=driver.findElement(By.id("login-button"));
				login.click();
				System.out.println("TEST OK ");
				
		
		

	}

}
