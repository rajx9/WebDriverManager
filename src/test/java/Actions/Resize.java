package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resizable/");
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,320)", "");
	
	driver.switchTo().frame(0);
	
	WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	
	Thread.sleep(2000);
	
	act.moveToElement(resize).dragAndDropBy(resize, 100,150).build().perform();
	
	
	
	//act.moveToElement(resize).dragAndDropBy(resize, 20, 150).build().perform();
	
	

	}

}
