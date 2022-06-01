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

public class TestCase26 {

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

        // 4. Scroll down page to bottom
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END)
                .perform();

        // 5. Verify 'SUBSCRIPTION' is visible
        driver.findElement(By.xpath("//h2[text()='Subscription']")).isDisplayed();

        // 6. Scroll up page to top

        actions.sendKeys(Keys.HOME)
                .perform();

        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        driver.findElement(By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[2]")).isDisplayed();


    }
}
