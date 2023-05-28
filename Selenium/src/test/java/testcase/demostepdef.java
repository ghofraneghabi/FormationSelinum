package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demostepdef {
	
	WebDriver driver;
	@Given("ouvrir navigateur chrome")
	public void ouvrir_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
	}

	@Given("saisir URL")
	public void saisir_url() {
	    
	}

	@When("saisir mail")
	public void saisir_mail() {
	    
	}

	@When("saisir password")
	public void saisir_password() {
	   
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
	    
	}

	@Then("verifier page home")
	public void verifier_page_home() {
	   
	}

}
