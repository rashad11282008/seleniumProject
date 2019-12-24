package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver obj= new FirefoxDriver();
		
		obj.get("https://www.amazon.com/?tag=tais2-desktop-20");
		
		obj.close();
		WebDriver obj1= new ChromeDriver();
		obj1.get("https://www.amazon.com/?tag=tais2-desktop-20");
		String a=obj1.getCurrentUrl();

		System.out.println(a);
	}
	


}
