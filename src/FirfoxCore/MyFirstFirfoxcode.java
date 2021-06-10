package FirfoxCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
			
public class MyFirstFirfoxcode {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
//		String title = driver.getTitle();
//		System.out.println("Title of Current Website:" +title);
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();	
		WebElement Searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		Searchbox.sendKeys("mobile");
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		 
		Thread.sleep(3000);
		
		WebElement SelectOption = driver.findElement(By.xpath("//div[@title='OnePlus']"));
		wait.until(ExpectedConditions.elementToBeClickable(SelectOption));
		SelectOption.click();
		
		WebElement cart = driver.findElement(By.xpath("//a[@href='/viewcart?otracker=Cart_Icon_Click']"));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
		
		
		driver.navigate().to("http://automationpractice.com/index.php");  //for navigate to another website
		driver.navigate().back();										//for navigate to back page	
		
		Thread.sleep(3000);
		driver.navigate().forward();										//for navigate to one page forward
		
		driver.navigate().refresh();                                        //Refresh the browser page
//		WebElement popularity = driver.findElement(By.linkText("Price -- Low to High"));		//element not found error occured
//		popularity.click();
		
		
		//teardown();
		
		

	}
	public static void teardown() {
		driver.quit();
	}

}
