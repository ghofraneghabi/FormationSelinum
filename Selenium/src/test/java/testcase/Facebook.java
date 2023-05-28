package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement creation;
		creation= driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		creation.click();
		WebElement prenom,nom,Email,Email2,password,mois,jour,anne,genre1,genre2,genre3,login;
		prenom= driver.findElement(By.name("firstname"));
		nom= driver.findElement(By.name("lastname"));
		Email= driver.findElement(By.name("reg_email__"));
		Email.sendKeys("ghofrane.125@gmail.com");
		Email2= driver.findElement(By.name("reg_email_confirmation__"));
		password= driver.findElement(By.name("reg_passwd__"));
		mois= driver.findElement(By.name("birthday_month"));
		jour= driver.findElement(By.name("birthday_day"));
		anne=driver.findElement(By.name("birthday_year"));
		genre1=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		genre2=driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		genre3= driver.findElement(By.xpath("(//label[normalize-space()='Personnalisé'])[1]"));
		login= driver.findElement(By.xpath("//button[@name='websubmit']"));
		//actions 
		prenom.sendKeys("ghofrane");
		nom.sendKeys("ghabi");
		
		Email2.sendKeys("ghofrane.125@gmail.com");
		password.sendKeys("MIPS1990");
		Select Listem= new Select(mois);
		Listem.selectByValue("11");
		Select listed = new Select(jour);
		listed.selectByValue("24");
		Select Listea= new Select(anne);
		Listea.selectByValue("1990");
		genre2.click();
		login.click();
	
		
		
		
		//	Select ListeD = new Select(liste);
		//ListeD.selectByValue("5");
		
		
		//User.sendKeys("Admin");
		//Password.sendKeys("admin123");
		
		
		
		
	}

}
