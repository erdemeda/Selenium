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

public class TestCase13 {

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

        //4. Click 'View Product' for any product on home page

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).
                perform();

        driver.findElement(By.xpath("//a[@href='/product_details/5']")).click();

        //5. Verify product detail is opened
        driver.findElement(By.xpath("//div[@class='col-sm-7']")).isDisplayed();

        //6. Increase quantity to 4
        WebElement quantity=driver.findElement(By.xpath("//input[@id='quantity']"));

        quantity.sendKeys(Keys.DELETE);
        quantity.sendKeys("4");

        //7. Click 'Add to cart' button
        driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();

        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

        //9. Verify that product is displayed in cart page with exact quantity
        driver.findElement(By.xpath("//tr[@id='product-5']")).isDisplayed();












    }
}
