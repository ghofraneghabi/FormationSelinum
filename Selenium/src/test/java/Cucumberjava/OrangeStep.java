package Cucumberjava;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeStep {
	WebDriver driver;
	@Given("Ouvrir Nav")
	public void ouvrir_nav() {
	    System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("Saisir URL {string}")
	public void saisir_url(String string) {
	   driver.get(string);
	}

	@When("Remplir champs username {string}")
	public void remplir_champs_username(String string) {
	   WebElement user;
	   user= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	   user.sendKeys(string);
	 
	}

	@When("Remplir champs Password {string}")
	public void remplir_champs_password(String string) {
	    WebElement Password;
	    Password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    Password.sendKeys(string);
	}

	@When("Cliquer sur la bouton login")
	public void cliquer_sur_la_bouton_login() {
	    WebElement bouton;
	    bouton= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    bouton.click();
	}

	@Then("acces sur la page home")
	public void acces_sur_la_page_home() {
	    
	
	
	
	
	}
	
	@Then("verifier le resultat obtenu\"Embun Jati\"")
	public void verifier_le_resultat_obtenu_embun_jati() {
	     
	}

	@Then("verifier le resultat obtenu {string}")
	public void verifier_le_resultat_obtenu(String string) {
		String url;
		url=driver.getCurrentUrl();
		if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			WebElement profil;
			profil=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
			String text;
			text= profil.getText();
			Assert.assertEquals(text,string);
			System.out.println("test ok");
		
		}
		else
		{
			WebElement msgerreur;
			msgerreur= driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
			String text2;
			text2= msgerreur.getText();
			Assert.assertEquals(text2, string);
			System.out.println("test non ok erreur");
			
			
		}
	   
	}


}
