package important;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//home//rahul//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
        driver.manage().window().maximize();
        
      int rowcount=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size();
		
      int colcount=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();
      System.out.println(rowcount);
      System.out.println(colcount);
      String firstpath="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
      String Secondpath="]/td[";
      String Thirdpath="]";
      for(int i=1;i<rowcount;i++)
      {
    	  for(int j=1;j<colcount;j++){
    		  String finapath=firstpath+i+Secondpath+j+Thirdpath;
      System.out.println(driver.findElement(By.xpath(finapath)).getText());
    	 
    	  }
      }
	}

}
