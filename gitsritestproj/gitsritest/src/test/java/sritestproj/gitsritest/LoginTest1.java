package sritestproj.gitsritest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest1 {
	 WebDriver driver;	
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("(//input[contains(@aria-label,'Search')])[1]")).sendKeys("latest hollywood movies");
	  //Thread.sleep(1000);
	  driver.findElement(By.xpath("(//input[contains(@type,'submit')])[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//h3[@class='LC20lb'])[1]")).click();
	  Wait wait = new FluentWait(driver).withTimeout(30000, TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	  Boolean wb1 = driver.findElement(By.xpath("//a[@name='etimeshomelink'][contains(text(),'The Times of India')]")).isDisplayed();
	 // Boolean wb1 = driver.findElement(By.xpath("//a[contains(text(),'Testing Excellence')]")).isDisplayed();
	  if(wb1 == true)//a[contains(text(),'Testing Excellence')]
	  System.out.println("selected content is displayed");
	  else
	  System.out.println("selected content is not displayed"); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Srikanth\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
