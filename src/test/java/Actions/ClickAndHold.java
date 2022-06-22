package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Destination1 = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.clickAndHold(source1).moveToElement(Destination1).release().build().perform();
		
		Thread.sleep(2000);
		
		//other shortcut method 
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Destination2 = driver.findElement(By.xpath("//div[@id='box107']"));
		
		act.dragAndDrop(source2, Destination2).build().perform();
		
	}

}
