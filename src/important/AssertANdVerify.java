package important;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertANdVerify {
    @Test
	public void assertion(){
		
		 System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
			WebDriver driver=new FirefoxDriver();
						
			driver.get("http://www.google.com");
		  String Title="Googles";
			String actualtitle=driver.getTitle();
			//here assert method check for validation
		  // Assert.assertEquals(Title, actualtitle);
		   //if assert is passe then the below code will execute if not it will be stopped 
		   //System.out.println("passed");
		   //using try catch method will give the verify method 
		   try{ 
			   Assert.assertEquals(Title, actualtitle);
		   }
		   // here Throwable will give make the below code code to run even after failing the case 
		   catch(Throwable e){
			   
			   System.out.println("it still runs after failing ");
		   }
		   //this will close the current browser session
		   //driver.close
		   // driver.quit will completely closes the browser 
		   driver.quit();
		   
	}

}
