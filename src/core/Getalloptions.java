package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Getalloptions {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		

	}

}
