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

public class TestCase20 {

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

       // 4. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();

       // 5. Enter product name in search input and click search button
       WebElement aramaKutusu= driver.findElement(By.xpath("//input[@name='search']"));
       aramaKutusu.sendKeys("Blue Top");
       driver.findElement(By.xpath("//button[@id='submit_search']")).click();


       // 6. Verify 'SEARCHED PRODUCTS' is visible
        driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();

       // 7. Verify all the products related to search are visible
        driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();

       // 8. Add those products to cart
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

       // 9. Click 'Cart' button and verify that products are visible in cart
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        WebElement karttakiUrunler= driver.findElement(By.xpath("//tr[@id='product-1']"));
        Assert.assertTrue(karttakiUrunler.isDisplayed());

       // 10. Click 'Signup / Login' button and submit login details
        driver.findElement(By.xpath("(//a[@href='/login'])[1]")).click();

        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("eda.erdm86@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();


        // 11. Again, go to Cart page
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

       // 12. Verify that those products are visible in cart after login as well

        driver.findElement(By.xpath("//table[@class='table table-condensed']")).isDisplayed();

    }
}
