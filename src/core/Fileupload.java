package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/upload/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("url title is:" +currenturl);
		
		

	}

}
