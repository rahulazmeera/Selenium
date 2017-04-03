package important;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MultiipleWindowHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
		//setting the language preference before opening the browser
		FirefoxProfile profile=new FirefoxProfile();
		//setting the local language to the french: fr
		profile.setPreference("intl.accept_languages", "fr");
		
		
		WebDriver driver=new FirefoxDriver(profile);
		
		 driver.get("https://twitter.com");
		 
		
		String winone=driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		
		
		//driver.findElement(By.xpath(".//*[@id='phx-signup-form']/div[1]/div[4]/label/span/a")).click();
		
		
	
	 for(String handle : driver.getWindowHandles()){
		 System.out.println(driver.getTitle());
		driver.switchTo().window(winone);
	    
		System.out.println(driver.getTitle());
	
	}
	//driver.close();
	 System.out.println(driver.getTitle());
	
	}
		
	
		
       
}
