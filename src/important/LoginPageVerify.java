package important;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("rahul.gandhi484@gmail.com");
	
		driver.findElement(By.id("next")).click();
		 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Passwd']")));
		
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Azmeer@1993");
		
		driver.findElement(By.id("signIn")).click();
		
		 WebDriverWait hh=new WebDriverWait(driver,20);
		 WebElement elements=hh.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id=':j']/span")));
		
		
		String s=driver.findElement(By.xpath(".//*[@id=':j']/span")).getText();
		
		
		if(s=="Gmail") {
			System.out.println("Login SucessFul");
		}else {
			System.out.println("Login Failed");
		}
		System.out.println(s);
		

	}

}
