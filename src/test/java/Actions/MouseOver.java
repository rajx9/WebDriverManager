package Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver   {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement nav1 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement nav2 = driver.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li[3]/a"));
		WebElement nav3 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		
		act.moveToElement(nav1).moveToElement(nav2).moveToElement(nav3).click().build().perform();
		
	}
	

}
