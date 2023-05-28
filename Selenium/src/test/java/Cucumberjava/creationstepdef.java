package Cucumberjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class creationstepdef {
	WebDriver driver;
	WebElement creation,prenom,nom,Email,Email2,password,mois,jour,anne,genre1,genre2,genre3,login;
	Select Listem;
	@Given("ouvrir le navigateur chrome")
	public void ouvrir_le_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("saisir URL {string}")
	public void saisir_url(String string) {
		driver.get("https://www.facebook.com/");
	    
	}

	@When("cliquer sur le bouton creation de compte")
	public void cliquer_sur_le_bouton_creation_de_compte() {
		creation= driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		creation.click();
	  
	}

	@When("Remplir le champs prenom {string}")
	public void remplir_le_champs_prenom(String string) {
		prenom= driver.findElement(By.name("firstname"));
		prenom.sendKeys(string);
	}

	@When("Remplir le champs nom {string}")
	public void remplir_le_champs_nom(String string) {
		nom= driver.findElement(By.name("lastname"));
		nom.sendKeys(string);
	}

	@When("Remplir le champs mail {string}")
	public void remplir_le_champs_mail(String string) {
		Email= driver.findElement(By.name("reg_email__"));
		Email.sendKeys(string);
	}

	@When("Remplir le champs de confirmation de mail {string}")
	public void remplir_le_champs_de_confirmation_de_mail(String string) {
		Email2= driver.findElement(By.name("reg_email_confirmation__"));
		Email2.sendKeys(string);
	}

	@When("Remplir le champs mot de passe {string}")
	public void remplir_le_champs_mot_de_passe(String string) {
		password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(string);
	}

	@When("Remplir la case mois {string}")
	public void remplir_la_case_mois(String string) {
		mois= driver.findElement(By.name("birthday_month"));
		Listem= new Select(mois);
		Listem.selectByValue(string);
	}

	@When("Remplir la case jour  {string}")
	public void remplir_la_case_jour(String string) {
		jour= driver.findElement(By.name("birthday_day"));
		Listem= new Select(jour);
		Listem.selectByValue(string);
	}

	@When("Remplir le case annee {string}")
	public void remplir_le_case_annee(String string) {
		anne=driver.findElement(By.name("birthday_year"));
		Listem= new Select(anne);
		Listem.selectByValue(string);
	}

	@When("choisir le genre {string}")
	public void choisir_le_genre(String string) {
		genre1=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		genre2=driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		if(string.equals("Homme"))
		{
			genre2.click();
		}
		else if (string.equals("femme"))
		{
			genre1.click();
		}
	}

	@When("Cliquer sur le bouton Login")
	public void cliquer_sur_le_bouton_login() {
		login= driver.findElement(By.xpath("//button[@name='websubmit']"));
		login.click();
	}

	@Then("verifier inscription")
	public void verifier_inscription() {
		driver.close();
	 
	}
	@When("choisir le genre {string} et selectionner {string}")
	public void choisir_genre_et_selectionner(String string, String string2)
	{
		WebElement boutonperso,listeperso;
		if(string.equals("Personnalise"))
		{
			boutonperso= driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
			boutonperso.click();
		
		listeperso= driver.findElement(By.name("preferred_pronoun"));
		Select Listep = new Select(listeperso);
		Listep.selectByValue(string2);
		}
	   
	}

}

