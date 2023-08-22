package TestMaven.SeleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class App {
	static WebDriver driver;
@Test
  public static void getAttribute() {
 driver = new ChromeDriver();
 driver.get("https://www.google.com/");
// String bing = "boost";
 WebElement inputField = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
 JavascriptExecutor js = (JavascriptExecutor) driver;  
 js.executeScript("arguments[0].value='bing';", inputField);
 
  }
@Test
public static void arrt()
{
	 int array[] = {10, 20, 25, 63, 96, 57};
     int size = array.length;
     Arrays.sort(array);
     System.out.println("sorted Array ::"+Arrays.toString(array));
     int res = array[size-1];
     System.out.println("largest element is ::"+res);
}
}
