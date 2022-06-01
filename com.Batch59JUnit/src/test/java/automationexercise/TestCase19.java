package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase19 {

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

       // 3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

       // 4. Verify that Brands are visible on left side bar
        driver.findElement(By.xpath("//div[@class='brands_products']")).isDisplayed();

       // 5. Click on any brand name
        driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();

       // 6. Verify that user is navigated to brand page and brand products are displayed
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();

       // 7. On left side bar, click on any other brand link
        driver.findElement(By.xpath("//a[@href='/brand_products/Madame']")).click();

       // 8. Verify that user is navigated to that brand page and can see products
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();


    }
}
