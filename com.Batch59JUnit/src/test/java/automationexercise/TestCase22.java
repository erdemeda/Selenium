package automationexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestCase22 {

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

        // 3. Scroll to bottom of page
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END)
                .sendKeys(Keys.PAGE_UP)
                .perform();

        //4. Verify 'RECOMMENDED ITEMS' are visible
        driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]")).isDisplayed();

        //5. Click on 'Add To Cart' on Recommended product
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[72]")).click();

        //6. Click on 'View Cart' button
        driver.findElement(By.xpath("//u[text()='View Cart']")).click();

        //7. Verify that product is displayed in cart page
        driver.findElement(By.xpath("//table[@class='table table-condensed']")).isDisplayed();



    }
    }
