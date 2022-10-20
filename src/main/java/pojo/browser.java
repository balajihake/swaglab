package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
 public static WebDriver openBrowser() {
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option=new ChromeOptions();
	
	WebDriver driver=new ChromeDriver(option);
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	return driver;
	
	
	
}
}
