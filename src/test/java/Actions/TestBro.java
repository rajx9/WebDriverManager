package Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBro {
	public static String Browser="edge"; //Excel sheet /config.properties 
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("wrongid")).click();

	}

}
