package HandleMultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		// 1. Alert with Ok
		// driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		// driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();

/*		 2. Alert with ok and cancel
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  */
		
	//	3. Alert with textbox
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
		String name="raj";
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		String ExpText = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(ExpText.contains(name)) {
			System.out.println("Test passed !! accept buttton");
			
		}
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
		driver.switchTo().alert().dismiss();
		String ExpText2 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(ExpText2.equals(""))
			System.out.println("Test case passed !! cancel button");
		
		
		

	}
}
