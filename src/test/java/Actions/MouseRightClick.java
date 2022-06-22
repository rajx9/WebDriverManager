package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(button).build().perform();
		
		 driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']")).click();
		 
		System.out.println( driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		 
		 driver.switchTo().alert().accept();
		

	}

}
