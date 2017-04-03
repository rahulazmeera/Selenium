package important;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
			//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "//home//rahul//Downloads//chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.amazon.com");
	        driver.manage().window().maximize();
			
			Actions act=new Actions(driver);
			WebElement el=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"));
			//act.contextClick(el).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		    act.moveToElement(el).build().perform();
		 // act.keyDown(Keys.SHIFT).moveToElement(el).sendKeys("Rahul").build().perform();
		    // act.moveToElement(el).build().perform();
		    //this is send the capital letter to the search box or the text box 
		     Actions acts=new Actions(driver);
		     
		     WebElement els=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		       
		     
		     acts.contextClick(els).build().perform();
		     //this works good for google 
		     acts.keyDown(Keys.SHIFT).moveToElement(els).sendKeys("rahul").build().perform();
	}

}
