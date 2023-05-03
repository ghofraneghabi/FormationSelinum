package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur CHROME
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//SLEEP 
		Thread.sleep(5000);
		
		// indentificaton du web element 
		WebElement User;
		WebElement Password;
		User= driver.findElement(By.name("username"));
		Password= driver.findElement(By.name("password"));
		// Action
		User.sendKeys("Admin");
		Password.sendKeys("admin123");
		// indentification  bouton login
		WebElement Bouton;
		Bouton= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Bouton.click();
		Thread.sleep(5000);
		// verification (assert)
		//indentification de l'élement
		WebElement profil;
		profil= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		// recuperation du contenu de text;
		String text;
		text= profil.getText();
		//assert
		Assert.assertEquals("Paul Collings", text);
		// affichage résultat 
		System.out.println("TEST OK");
		
		
		
	
		
		
	}

}
