package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("cusid"));
		name.sendKeys("12345");
		WebElement Reset = driver.findElement(By.name("res"));
		Reset.click();
		WebElement name1 = driver.findElement(By.name("cusid"));
		name1.sendKeys("54321");
		WebElement Submit = driver.findElement(By.name("submit"));
		Submit.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		alert.dismiss();
		
		Thread.sleep(5000);
//		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
		
		System.out.println("Welcome to Alert Code");
		Thread.sleep(5000);
		 driver.quit();
		
	}

}
