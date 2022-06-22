package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/all-countries.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
//		1.scroll by pixel
	//	js.executeScript("window.scrollBy(0,1000)", "");
		
		//2.  Scroll by visible text   (scroll till Ukraine not found)
		//WebElement Ukraine = driver.findElement(By.xpath("//li[text()='Ukraine']"));
		//js.executeScript("arguments[0].scrollIntoView()",Ukraine);
		
		//3. scroll page end
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
