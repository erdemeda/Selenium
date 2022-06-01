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

public class TestCase18 {

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


       // 3. Verify that categories are visible on left side bar
        driver.findElement(By.xpath("//div[@class='left-sidebar']")).isDisplayed();


       // 4. Click on 'Women' category
        driver.findElement(By.xpath("//a[@data-toggle='collapse']")).click();

       // 5. Click on any category link under 'Women' category, for example: Dress
        driver.findElement(By.xpath("//a[@href='/category_products/2']")).click();

       // 6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();

        WebElement titleText=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String expectedText="WOMEN - TOPS PRODUCTS";
        String actualText=titleText.getText();
        Assert.assertEquals(expectedText,actualText);


       // 7. On left side bar, click on any sub-category link of 'Men' category
        driver.findElement(By.xpath("//a[@href='#Men']")).click();
        driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();


       // 8. Verify that user is navigated to that category page
        driver.findElement(By.xpath("//div[@class='breadcrumbs']")).isDisplayed();








}
}
