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

public class TestCase2 {

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//            3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button



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
        driver.navigate().to("http://automationexercise.com");

//3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html[@lang='en']"));
        Assert.assertTrue(homePage.isDisplayed());

//4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

//5. Verify 'Login to your account' is visible
        WebElement LoginYourAccount=driver.findElement(By.xpath("//*[text()='Login to your account']"));
        Assert.assertTrue(LoginYourAccount.isDisplayed());

//6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("eda.erdm86@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");


//7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

//8. Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a")).isDisplayed();

//9. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();
//10. Verify that 'ACCOUNT DELETED!' is visible

    }
}
