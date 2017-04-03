package important;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://www.pittstate.edu");
			//this java script executor will help in scrolling the webpage 
			JavascriptExecutor je=(JavascriptExecutor)driver;
			//pass the element with is only visible when the page is scrolled 
			WebElement el=driver.findElement(By.xpath(".//*[@id='quick-links']/ul[2]/li[3]/a"));
            //this will execute until the web element is visible 
			je.executeScript("arguments[0].scrollIntoView(true);", el);
			//after scrolling down the the element value is printed 
			System.out.println(el.getText());
		
	}

}
