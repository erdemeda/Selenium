package automationexercise;

import com.github.javafaker.Faker;
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

public class TestCase15 {

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

       //  5. Fill all details in Signup and create account
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        Actions actions= new Actions(driver);
        Faker faker=new Faker();
        actions.click(isimKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        WebElement genderButonu= driver.findElement(By.xpath("//input[@id='id_gender2']"));

        actions.click(genderButonu)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("25")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("India")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("5553332211")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(3000);

       //  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement accountCreated=driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(accountCreated.isDisplayed());
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

       //  7. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();

       //  8. Add products to cart

        actions.sendKeys(Keys.PAGE_DOWN)
              // .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
               // .sendKeys(Keys.ARROW_DOWN)
                .perform();

        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();

       //  9. Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

       //  10. Verify that cart page is displayed
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

       //  11. Click Proceed To Checkout
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

       //  12. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//h2[text()='Address Details']")).isDisplayed();
        driver.findElement(By.xpath("//h2[text()='Review Your Order']")).isDisplayed();

       //  13. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("thank you");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

       //  14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
       //  15. Click 'Pay and Confirm Order' button
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


       //  16. Verify success message 'Your order has been placed successfully!'
        driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]")).isDisplayed();


       //  17. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();

       //  18. Verify 'ACCOUNT DELETED!' and click 'Continue' button








    }
}
