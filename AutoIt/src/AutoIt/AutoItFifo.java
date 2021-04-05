package AutoIt;

import java.io.IOException;
                                       
import org.openqa.selenium.By;  //required madam jar n exe path old version
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoItFifo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "F:\\cjc Project\\Automation testing\\Programs\\AutoIT_tool\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/cjc%20Project/Automation%20testing/Programs/AutoIT_tool/Anuptools/uploadfile4.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("F:\\cjc Project\\Automation testing\\Programs\\AutoIT_tool\\Anuptools\\Autoitdemofilefirefox.exe");	
		
	}
	   
}
