package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	
public WebDriver driver;
	
  @Test
  public void Images () {
	  
// List of images on a page	  
	 List<WebElement> listImages = driver.findElements(By.tagName("img"));
	 System.out.println(listImages.size());
	 
	 for (int i = 0; i < listImages.size(); i++){
		 
		 if (!(listImages.get(i).getAttribute("src").equals("")) && !(listImages.get(i).getAttribute("src") == null)){
			 
			 System.out.println(listImages.get(i).getAttribute("src"));
		 }
	 }
	  
  }
  
  @BeforeTest
	  
// Launch Browser  
  public void LaunchBrowser(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
  }
}
