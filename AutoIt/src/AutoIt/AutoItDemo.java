package AutoIt;

import java.io.IOException;   //for chrome
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\cjc Project\\Automation testing\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///F:/cjc%20Project/Automation%20testing/Programs/AutoIT_tool/uploadfile4.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("F:\\cjc Project\\Automation testing\\Programs\\AutoIT_tool\\Anuptools\\Autoitdemofile.exe");	
	
}
}
