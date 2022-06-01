package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4_WithPageDown {
    // ...Exercise4...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    //    Type any number in the first input
    //    Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Thread.sleep(2000); //bunu cok hızlı gecitigi icin, asagiya kaydigini gorun diye ekledim sadece..
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)"); // sayfada 300 piksel asagi in demektir..

        driver.findElement(By.id("calculatetest")).click();


        driver.findElement(By.id("number1")).sendKeys("20");
        driver.findElement(By.id("number2")).sendKeys("30");
        driver.findElement(By.id("calculate")).click();
        System.out.println(driver.findElement(By.id("answer")).getText());
    }

}
