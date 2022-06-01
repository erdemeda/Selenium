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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class TestCase24 {

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

        //7. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text()='Proceed To Checkout']")).click();


        //8. Click 'Register / Login' button
        driver.findElement(By.xpath("//u[text()='Register / Login']")).click();

        //9. Fill all details in Signup and create account

        WebElement isimKutusu = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        Faker faker = new Faker();
        actions.click(isimKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        WebElement genderButonu = driver.findElement(By.xpath("//input[@id='id_gender2']"));

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


        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement accountCreated = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(accountCreated.isDisplayed());
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

        //11. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();

        //12.Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

        //13. Click 'Proceed To Checkout' button
        driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

        //14. Verify Address Details and Review Your Order
        driver.findElement(By.xpath("//h2[text()='Address Details']")).isDisplayed();
        driver.findElement(By.xpath("//h2[text()='Review Your Order']")).isDisplayed();

        //15. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("thank you");
        driver.findElement(By.xpath("//*[text()='Place Order']")).click();

        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //17. Click 'Pay and Confirm Order' button

        WebElement nameOnCard = driver.findElement(By.xpath("//input[@name='name_on_card']"));

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

        Thread.sleep(2000);
        //18. Verify success message 'Your order has been placed successfully!'

        driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]")).isDisplayed();

        Thread.sleep(2000);


       // 19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
        WebElement downloadInvoiceElementi=driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
        downloadInvoiceElementi.click();
        Thread.sleep(5000);

        String farkliKisim= System.getProperty("user.home");
        String ortakKisim = "\\Downloads\\invoice.txt";
        String arananDosyaYolu= farkliKisim+ortakKisim;

        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYolu)));


       // 20. Click 'Continue' button
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

       // 21. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();





    }
}