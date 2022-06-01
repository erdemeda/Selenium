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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TestCase1 {


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

        // 5. Verify 'New User Signup!' is visible
        driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed();

        // 6. Enter name and email address (her seferde yeni adres girilmesi gerekiyor)
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("eda");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("eda.erdm81@gmail.com");

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

       // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccount = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(enterAccount.isDisplayed());

       // 9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();//Title
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");//Password

        WebElement dayDropDown=driver.findElement(By.xpath("//select[@name='days']"));//day
        Select select1=new Select(dayDropDown);
        select1.selectByIndex(10);

        WebElement monthDropDown=driver.findElement(By.xpath("//select[@name='months']"));//month
        Select select2=new Select(monthDropDown);
        select2.selectByIndex(10);

        WebElement yearDropDown=driver.findElement(By.xpath("//select[@name='years']"));//year
        Select select3=new Select(yearDropDown);
        select3.selectByVisibleText("1999");

       // 10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

       // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();

       // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("eda");//first name
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("erdem");//last name
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("stars");//company
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("address");//address
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("address2");//address2

        WebElement countryDropDown=driver.findElement(By.xpath("//select[@id='country']"));//country
        Select select4=new Select(countryDropDown);
        select4.selectByVisibleText("Canada");

        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("State");//state
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("City");//city
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("654321");//Zipcode
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("6543211234");//Mobile number

       // 13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

       // 14. Verify that 'ACCOUNT CREATED!' is visible
        driver.findElement(By.xpath("//*[text()='Account Created!']")).isDisplayed();

       // 15. Click 'Continue' button
        driver.findElement(By.xpath("//*[text()='Continue']")).click();

       // 16. Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed();

       // 17. Click 'Delete Account' button
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        driver.findElement(By.xpath("//a[text()='Delete Account']")).click();

       // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

Thread.sleep(3000);


    }
}
