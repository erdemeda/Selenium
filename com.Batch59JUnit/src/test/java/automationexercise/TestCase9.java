package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase9 {
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
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

        // 4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        // 5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

        // 6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Stylish Dress");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();

        // 7. Verify 'SEARCHED PRODUCTS' is visible
        driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();

        // 8. Verify all the products related to search are visible
        driver.findElement(By.xpath("//div[@class='product-image-wrapper']")).isDisplayed();





    }
    }
