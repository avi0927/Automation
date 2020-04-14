package locdownactivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropdownvalue {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Myntra\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		Select dropdown = new Select(driver.findElement(By.id("day")));
//		dropdown.selectByVisibleText("1");
		WebElement element = driver.findElement(By.id("day"));
		  Select s = new Select(element);
		  s.selectByVisibleText("1");
		  List <WebElement> elementcount =s.getOptions(); 
		  System.out.println(elementcount.size()); 
		  for(int i=0 ;i<elementcount.size();i++) { 
		String value = elementcount.get(i).getText();
		  System.out.println(value); }
		 
		
	}

}
