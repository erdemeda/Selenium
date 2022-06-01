package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase17 {

    //1. Launch browser

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

        //4. Add products to cart
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();

        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

        //5. Click 'Cart' button

        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //6. Verify that cart page is displayed
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();


       // 7. Click 'X' button corresponding to particular product
        driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();

       // 8. Verify that product is removed from the cart
        driver.findElement(By.xpath("//*[text()='Cart is empty!']")).isDisplayed();

    }
}
