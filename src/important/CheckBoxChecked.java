package important;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxChecked {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.pittstate.edu/");
		Thread.sleep(3000);
		driver.findElement(By.id("right-panel-link")).click();
		
		driver.findElement(By.xpath(".//*[@id='right-panel']/ul[1]/li[2]/a")).click();
		
		Thread.sleep(3000);
		
		WebElement checkbox1;
		//this will get the information of the box 
		checkbox1=driver.findElement(By.id("kmsiInput"));
		//hear the is selected method is used to check if the box is selected or not 
		if(!checkbox1.isSelected()){
			checkbox1.click();
		}
		
		
	}

}
