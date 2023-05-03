package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		//chemin chrome driver path
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// ouverture chrome
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		//ouvrir url
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.google.tn/");
		//supprimer les cookies 
		driver.manage().deleteAllCookies();
		
		
		
		

	}

}
