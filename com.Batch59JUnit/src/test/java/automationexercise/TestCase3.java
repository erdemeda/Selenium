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

public class TestCase3 {

//1. Launch browser

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

//3. Verify that home page is visible successfully
        driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

//4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

//5. Verify 'Login to your account' is visible
        WebElement LoginYourAccount=driver.findElement(By.xpath("//*[text()='Login to your account']"));
        Assert.assertTrue(LoginYourAccount.isDisplayed());

//6. Enter incorrect email address and password
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("eda@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

//7. Click 'login' button
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();

//8. Verify error 'Your email or password is incorrect!' is visible
        WebElement EmailPasswordIncorrect=driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        Assert.assertTrue(EmailPasswordIncorrect.isDisplayed());

        Thread.sleep(3000);


    }

}
