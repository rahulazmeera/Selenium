package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.facebook.com");
		
		// this is to make the wait tille the required elemnt is visible
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		
		
		
		//use select class to handle the drop downs 
		Select dropdown=new Select(driver.findElement(By.id("month")));
		
		dropdown.selectByIndex(3);
		
		//to get the selected element value we need to blow method 
		
		WebElement option=dropdown.getFirstSelectedOption();
		System.out.println(option.getText());
		
		Select day=new Select(driver.findElement(By.id("day")));
		
		day.selectByIndex(9);
		
		WebElement val=day.getFirstSelectedOption();
		System.out.println(val.getText());
		
		Select year=new Select(driver.findElement(By.id("year")));
		
		
		year.selectByIndex(30);
		
		
		WebElement vall=year.getFirstSelectedOption();
		
		System.out.println(vall.getText());
		

	}

}
