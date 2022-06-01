package automationexercise;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase21 {
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


        //5. Click on 'View Product' button
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

        //6. Verify 'Write Your Review' is visible
        driver.findElement(By.xpath("//a[@href='#reviews']")).isDisplayed();

        //7. Enter name, email and review
        WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
        Faker faker=new Faker();
        Actions actions = new Actions(driver);
        actions.click(name)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("Thank you")
                .perform();

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//button[@id='button-review']")).click();

        Thread.sleep(3000);

        //9. Verify success message 'Thank you for your review.'
        driver.findElement(By.xpath("//*[text()='Thank you for your review.']")).isDisplayed();


    }
}