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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase12 {

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

       // 5. Hover over first product and click 'Add to cart'
        Actions actions=new Actions(driver);

        WebElement firstProductElementi= driver.findElement(By.xpath("(//div[@class='single-products'])[1]"));
        actions.moveToElement(firstProductElementi).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[2]")).click();

       // 6. Click 'Continue Shopping' button
        driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();

       // 7. Hover over second product and click 'Add to cart'
        WebElement secondPruductElementi= driver.findElement(By.xpath("(//div[@class='single-products'])[2]"));
        actions.moveToElement(secondPruductElementi).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[4]")).click();


       // 8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();

       // 9. Verify both products are added to Cart
        driver.findElement(By.xpath("//a[text()='Blue Top']")).isSelected();
        driver.findElement(By.xpath("//a[text()='Men Tshirt']")).isSelected();

       // 10. Verify their prices, quantity and total price
        driver.findElement(By.xpath("//*[text()='Rs. 500']")).isDisplayed();//price1
        driver.findElement(By.xpath("(//button[@class='disabled'])[1]")).isDisplayed();//quantity1
        driver.findElement(By.xpath("(//p[@class='cart_total_price'])[1]")).isDisplayed();//total price1
        driver.findElement(By.xpath("(//p[text()='Rs. 400'])[1]")).isDisplayed();//price2
        driver.findElement(By.xpath("(//button[@class='disabled'])[2]")).isDisplayed();//quantity2
        driver.findElement(By.xpath("(//p[@class='cart_total_price'])[2]")).isDisplayed();//total price2







}
}
