package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//implicty time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	WebElement liste;
	liste= driver.findElement(By.id("oldSelectMenu"));
	// appel fonction SELECT
	
	Select ListeD = new Select(liste);
	ListeD.selectByValue("5");
	System.out.println("Test ok");
	
	

	
	
	
	
	

	}

}
