package practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q5 {
     /*
       // ...Exercise5...
       // Navigate to website  https://testpages.herokuapp.com/styled/index.html
       // Under the  ORIGINAL CONTENTS
       // click on Alerts
       // print the URL
       // navigate back
       // print the URL
       // Click on Basic Ajax
       // print the URL
       // enter value-> 20 and Enter
       // and then verify Submitted Values is displayed open page
       // close driver

        */

   @Test
    public void test1() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe" );
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Navigate to website  https://testpages.herokuapp.com/styled/index.html
       driver.get("https://testpages.herokuapp.com/styled/index.html");

       // Under the  ORIGINAL CONTENTS
       // click on Alerts
       driver.findElement(By.xpath("//a[@id='alert']")).click();
       // print the URL
       String url1=driver.getCurrentUrl();
       System.out.println("url1 = " + url1);

       // navigate back
       driver.navigate().back();

       // print the URL
       String url2=driver.getCurrentUrl();
       System.out.println("url2 = " + url2);

       // Click on Basic Ajax
       driver.findElement(By.xpath("//a[@id='basicajax']")).click();

       // print the URL
       String url3=driver.getCurrentUrl();
       System.out.println("url3 = " + url3);

       // enter value-> 20 and Enter
       WebElement enterValue=driver.findElement(By.xpath("//input[@id='lteq30']"));
       enterValue.sendKeys("20"+Keys.ENTER);

       // and then verify Submitted Values is displayed open page
       boolean isTrue = driver.findElement(By.xpath("//*[text()='Submitted Values']")).isDisplayed();
       if (isTrue) System.out.println("Test Passed");
       else System.out.println("Test Failed");

       Thread.sleep(3000);

       // close driver
       driver.close();







   }




}
