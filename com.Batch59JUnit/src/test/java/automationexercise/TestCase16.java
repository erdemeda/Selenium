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

public class TestCase16 {

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

        //  4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();


        // 5. Fill email, password and click 'Login' button
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("eda.erdm86@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");

        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();


        // 6. Verify 'Logged in as username' at top
        driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();


        //  7. Add products to cart

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
               .perform();

        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

        //  8. Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //  9. Verify that cart page is displayed
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();


        //  10. Click Proceed To Checkout
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

        //  11. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//h2[text()='Address Details']")).isDisplayed();
        driver.findElement(By.xpath("//h2[text()='Review Your Order']")).isDisplayed();

        //  12. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("thank you");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();


        //  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //  14. Click 'Pay and Confirm Order' button
        WebElement nameOnCard= driver.findElement(By.xpath("//input[@name='name_on_card']"));

        actions.click(nameOnCard).sendKeys("kart adi")
                .sendKeys(Keys.TAB)
                .sendKeys("25635")
                .sendKeys(Keys.TAB)
                .sendKeys("321")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("2022")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(5000);


        //  15. Verify success message 'Your order has been placed successfully!'
        driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]")).isDisplayed();


        //  16. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();


        // 17. Verify 'ACCOUNT DELETED!' and click 'Continue' button



    }
}
