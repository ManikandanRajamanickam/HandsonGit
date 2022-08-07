package learnFromInterview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GetValueFromDropDown {

	WebDriver wd;
	void dataFromDropDown() {
		
	 		WebElement test = wd.findElement(By.xpath("//*[@input='test']"));
	 		 
	 		Select select = new Select(test);
	 		 List<WebElement> comprelist = select.getOptions();
	 		List<String> originalList = new ArrayList<String>();
	 		for (WebElement webElement : comprelist) {
	 			    originalList.add(webElement.getText());
			}
	 		
	 		WebElement targetDropdown = wd.findElement(By.id("order-changed"));
	 		Select target = new  Select(targetDropdown);
	 		List<WebElement> targetListElements = target.getOptions();
	 		List<String> targetList = new ArrayList<String>();
	 		for (WebElement webElement : targetListElements) {
	 			targetList.add(webElement.getText());
	 		}
	 		
	 		Assert.assertEquals(originalList, targetList);
	}
	
}
