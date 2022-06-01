package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase8 {

    //1. Launch browser

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

       // 4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

       // 5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

       // 6. The products list is visible
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();

       // 7. Click on 'View Product' of first product
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

       // 8. User is landed to product detail page
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

       // 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        driver.findElement(By.xpath("//*[.='Blue Top']")).isDisplayed();
        driver.findElement(By.xpath("//*[.='Category: Women > Tops']")).isDisplayed();
        driver.findElement(By.xpath("//*[.='Rs. 500']")).isDisplayed();
        driver.findElement(By.xpath("//*[.='Availability:']")).isDisplayed();
        driver.findElement(By.xpath("//*[.='Condition:']")).isDisplayed();
        driver.findElement(By.xpath("//*[.='Brand:']")).isDisplayed();


    }
}
