package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(slider).dragAndDropBy(slider, 200, 0).build().perform();
		
	}

}
