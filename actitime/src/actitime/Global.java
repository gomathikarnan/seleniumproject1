package actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Global {
@Test
	public static void hello() throws InterruptedException {
	
	System.out.println("hi");
	System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\photon program\\actitime\\RESOURCES\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://stores.xoxoday.com/experiences/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement w=driver.findElement(By.xpath("//div[@class='top-search-bar show']/div[@class='city-drop-down']/ul/li/a[text()='Bangalore']"));
	Actions act=new Actions(driver);
	act.moveToElement(w).perform();
	WebElement search=driver.findElement(By.xpath("//li[@class='city-search']/input[@placeholder='Search for city']"));
//act.moveToElement(search).click().sendKeys("chennai").build().perform();
//act.sendKeys(Keys.ENTER).perform();
//driver.findElement(By.xpath("//a[text()='View All']")).click();
WebElement chennai=driver.findElement(By.id("city-1443"));
act.moveToElement(chennai).click().build().perform();
driver.findElement(By.xpath("//a[text()='Login']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
driver.findElement(By.name("full-name")).sendKeys("saranya");

driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("saranya.k@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("901047890");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("01091993");
driver.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("01091993");

driver.findElement(By.xpath("//button[text()='Sign up']")).click();

}
}
