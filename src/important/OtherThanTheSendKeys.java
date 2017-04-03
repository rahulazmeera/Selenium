package important;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OtherThanTheSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
			WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.com");
		//by using java script executor we can send the keys as an alternate to the send keys method
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('twotabsearchtextbox').value='Virender Testing sending'");
		

	}

}
