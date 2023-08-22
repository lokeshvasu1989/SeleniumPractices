package TestMaven.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frm {
	static WebDriver driver;
	@Test
	public void fm()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Lokesh");
		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("V");
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("loks89@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("asu");
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[text()='Watch tutorial']")).getText());
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		Actions action = new Actions(driver);
		WebElement hover= driver.findElement(By.xpath("//*[text()='Courses']"));
		action.moveToElement(hover).perform();
		driver.findElement(By.xpath(" //*[text()=' Selenium-Java ']")).click();
	}


}
