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

public class TestCase6 {

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

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//i[@class='fa fa-envelope']")).click();

        // 5. Verify 'GET IN TOUCH' is visible
        driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]")).isDisplayed();

        // 6. Enter name, email, subject and message
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("eda");
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("eda.erdm86@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("Subject");
        driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("Message");
        // 7. Upload file
        driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\Users\\Administrator\\ders2");

        // 8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        // 9. Click OK button
        driver.switchTo().alert().accept();

        // 10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement successMessage=driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(successMessage.isDisplayed());
        System.out.println(successMessage.getText());//bunu ben ekledim

        // 11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");


    }
}
