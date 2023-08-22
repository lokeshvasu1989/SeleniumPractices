package TestMaven.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
static WebDriver driver;
@Test
	public void tstr() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

 driver = new ChromeDriver();
 driver.get("https://www.google.com/");
 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
 driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
System.out.println(driver.findElement(By.xpath("//h4[@class='alert-heading text-center m-0']")).getText());
 
 
	}

}
