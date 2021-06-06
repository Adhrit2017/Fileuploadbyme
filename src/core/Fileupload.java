package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/upload/";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("url title is:" +currenturl);
		
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		ChooseFile.sendKeys("C:\\Users\\User\\Desktop\\Vaishali Doc");
		WebElement terms = driver.findElement(By.name("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		

		String Title = driver.getTitle();
		System.out.println("Current Website Title = " + Title);
		Thread.sleep(10000);
		driver.quit();
	}
	

}
