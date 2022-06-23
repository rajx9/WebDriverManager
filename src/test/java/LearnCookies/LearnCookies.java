package LearnCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		Set<Cookie> cookies;
		
		cookies = driver.manage().getCookies();
		System.out.println("initial size "+cookies.size());
		
		Cookie cobj=new Cookie("Mycookie","1234567890");
		driver.manage().addCookie(cobj);
		
		 cookies = driver.manage().getCookies();
		System.out.println("cookie added size "+cookies.size());
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+"->"+cookie.getValue());
		}
		
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();
		System.out.println("cookie added size "+cookies.size());
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+"->"+cookie.getValue());
		}
		
		

	}

}
