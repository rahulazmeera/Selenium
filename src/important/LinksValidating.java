package important;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksValidating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","//home//rahul//Downloads//selenium //geckodriver");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://www.google.com");
			//crea the list array method to collect all the links from the web page.
			List<WebElement> links=driver.findElements(By.tagName("a"));
			//get the total number of links by using size 
			System.out.println(links.size());
		    // get travese through all the links 
			for(int i=0;i<links.size();i++){
				
				//store every link in the every element 
				
				WebElement ele=links.get(i);
				//store the total href total elements in the url string and make it work in method 
				String url=ele.getAttribute("href");
				//for this we have to create the method 
				vrifylinkactive(url);	
			}	
	}

	private static void vrifylinkactive(String linkUrl) {
		// TODO Auto-generated method stub
		
		try{
			// cret URL class object
			URL url=new URL(linkUrl);
			//open the the url connection which you have got from the link
			HttpURLConnection httpUrlConnect=(HttpURLConnection)url.openConnection();
			//set the time out for the url to connect in maximum value 
			httpUrlConnect.setConnectTimeout(3000);
			//make object to connect
			httpUrlConnect.connect();
			//make condition to check if it is equal to 200 or not 
			if(httpUrlConnect.getResponseCode()==200){
				System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage());
			}
			//check if it is equal to http not found so it is about to fail
			if(httpUrlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+"-"+httpUrlConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
			}
					
		}catch(Exception e){
			
			
		}
			
	}

}
