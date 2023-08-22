package TestMaven.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.get("https://talent.capgemini.com/in");
 Thread.sleep(15000);

 driver.findElement(By.xpath("//img[@src='/image/responsive/close-cross.jpg']")).click();
 driver.findElement(By.xpath("//a[@href='javascript:hideCookie();']")).click();
 driver.findElement(By.xpath("//span[text()='Applied Innovation Newsletter - Issue 53']")).click();
	}

}
