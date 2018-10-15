package actitime;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class actitime {

	@Test
	public void selectt() {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\photon program\\actitime\\RESOURCES\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=7g44sng7femm1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Tasks']/..")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		WebElement drop=driver.findElement(By.name("customerId"));
		Select s=new Select(drop);
	//	Boolean value=s.isMultiple();
		//if(value==true)
	//	{
		
		TreeSet <String>l=new TreeSet<String>();
		List<WebElement>optionss=	s.getOptions();
		ArrayList a=(ArrayList)optionss;
		System.out.println(a.size());
//for(int i=0;i<=optionss.size()-1;i++)
//{
//		String sel=	optionss.get(i).getText();
//		if(sel.contains("hdfc"))
//		{
//			s.selectByVisibleText(sel);
//		}
//		System.out.println(sel);
//		l.add(sel);
		for(WebElement w:optionss)
		{
		for(char c='a';c<='z';c++)
		{
			char s1=w.getText().charAt(0);
			if(s1==c) {
System.out.println("the given option is arranged in ascending order");	
}
			else {
				System.out.println("the given option are in ascending order");
			}
	//	}
		}
		}
System.out.println(l);
	}
}
