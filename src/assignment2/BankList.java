package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankList {
	
public WebDriver driver;
	
  @Test
  public void bankListCode() {
	  
	  driver.findElement(By.className("swift"));
// How many rows in the table
	  List <WebElement> tablerows =  driver.findElements(By.tagName("tr"));
	  int rows = tablerows.size();
	  System.out.println(rows);

// Print List of Banks
	  System.out.println("List of bank");
	  for(int i=2;i<7;i++)
	  {

	  String bankname= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr["+i+"]/td[2]")).getText();
	  System.out.println(bankname);
	  }
	  
// Print List of Swiftcode 	  
	  System.out.println("List of Siff Code");
	  for(int i=2;i<7;i++)
	  {
	  String swiffcode= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr["+i+"]/td[5]")).getText();
	  System.out.println(swiffcode);
	  }	  
	  
	  }

  
  @BeforeTest
  
  // Launch Browser
  public void LaunchBrowser(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.theswiftcodes.com/malaysia/");
}
}
