package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		WebElement From,To;
		From=driver.findElement(By.id("draggable"));
		To=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//draganddrop pertmet de deplacer le contenu de from dans to
		action.dragAndDrop(From, To).perform();
		String txt;
		txt=To.getText();
		org.testng.Assert.assertEquals(txt, "Dropped!");
		System.out.println("test ok");
		driver.close();
		
	}

}
