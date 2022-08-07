package learnFromInterview;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicTable {

	@Test
	void getRowSize() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\MANI_QA_FILES\\Chrome_Driver\\chromedriver.exe");
		
		ChromeDriver dr  = new  ChromeDriver();
		dr.get("https://demo.guru99.com/test/web-table-element.php");
		
	   Thread.sleep(1000);
		
	   List<WebElement> data = dr.findElements(By.xpath("//tbody//tr"));
	  System.out.println(data.size());
	
	}
	 
}
