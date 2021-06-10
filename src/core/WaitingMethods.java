package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMethods {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//implicit wait example
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Explicit wait 1st way
		
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		WebElement username = Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='email']"))));
		username.sendKeys("vaishali@yopmail.com");
		
		//2nd way
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Wait.until(ExpectedConditions.visibilityOf(Password));
		Password.sendKeys("123456788");
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='login']"));
		Wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		System.out.println("Welcome");
		
	}

}
