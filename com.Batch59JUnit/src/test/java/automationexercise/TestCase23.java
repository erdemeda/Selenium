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

public class TestCase23 {

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

            //driver.close();
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
                WebElement isimKutusu = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
                Actions actions = new Actions(driver);
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

                Thread.sleep(3000);

                //  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
                WebElement accountCreated = driver.findElement(By.xpath("//*[text()='Account Created!']"));
                Assert.assertTrue(accountCreated.isDisplayed());
                Thread.sleep(2000);
                driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

                //  7. Verify ' Logged in as username' at top
                driver.findElement(By.xpath("//*[text()=' Logged in as ']")).isDisplayed();

                //  8. Add products to cart

                driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
                driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();

                //  9. Click 'Cart' button
                driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();

                //  10. Verify that cart page is displayed
                driver.findElement(By.xpath("//html[@lang='en']")).isDisplayed();

                //  11. Click Proceed To Checkout
                driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

               // 12. Verify that the delivery address is same address filled at the time registration of account
            //delivery addres ile billing adres karsilastirildi??????????????

            /*  WebElement deliveryNameElementi=driver.findElement(By.xpath("(//li[@class='address_firstname address_lastname'])[1]"));
              String deliveryName=deliveryNameElementi.getText();
              System.out.println("deliveryName = " + deliveryName);

              WebElement billingNameElementi=driver.findElement(By.xpath("(//li[@class='address_firstname address_lastname'])[2]"));
              String billingName=billingNameElementi.getText();
              System.out.println("billingName = " + billingName);
              Assert.assertEquals(deliveryName,billingName);

              System.out.println("**************");

              WebElement deliveryAddressElementi=driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[2]"));
              String deliveryAddress=deliveryNameElementi.getText();
              System.out.println("deliveryAddress = " + deliveryAddress);

              WebElement billingAddressElementi=driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[5]"));
              String billingAddress=billingNameElementi.getText();
              System.out.println("billingAddress = " + billingAddress);
              Assert.assertEquals(deliveryAddress,billingAddress);

              System.out.println("**************");

              WebElement deliveryAddressElementi2=driver.findElement(By.xpath("(//li[@class='address_city address_state_name address_postcode'])[1]"));
              String deliveryAddress2=deliveryAddressElementi2.getText();
              System.out.println("deliveryAddress2 = " + deliveryAddress2);

              WebElement billingAddressElementi2=driver.findElement(By.xpath("(//li[@class='address_city address_state_name address_postcode'])[2]"));
              String billingAddress2=billingAddressElementi2.getText();
              System.out.println("billingAddress2 = " + billingAddress2);
              Assert.assertEquals(deliveryAddress2,billingAddress2);

              System.out.println("**************");

              WebElement deliveryCountryElementi=driver.findElement(By.xpath("(//li[@class='address_country_name'])[1]"));
              String deliveryCountry=deliveryCountryElementi.getText();
              System.out.println("deliveryCountry = " + deliveryCountry);

              WebElement billingCountryElementi=driver.findElement(By.xpath("(//li[@class='address_country_name'])[2]"));
              String billingCountry=billingCountryElementi.getText();
              System.out.println("billingCountry = " + billingCountry);
              Assert.assertEquals(deliveryCountry,billingCountry);


              System.out.println("**************");

              WebElement deliveryPhoneElementi=driver.findElement(By.xpath("(//li[@class='address_phone'])[1]"));
              String deliveryPhone=deliveryPhoneElementi.getText();
              System.out.println("deliveryPhone = " + deliveryPhone);

              WebElement billingPhoneElementi=driver.findElement(By.xpath("(//li[@class='address_phone'])[2]"));
              String billingPhone=billingPhoneElementi.getText();
              System.out.println("billingPhone = " + billingPhone);
              Assert.assertEquals(deliveryPhone,billingPhone);

             */


               // 13. Verify that the billing address is same address filled at the time registration of account


                // 14. Click 'Delete Account' button
            //   driver.findElement(By.xpath("//a[@href='/delete_account']")).click();

               // 15. Verify 'ACCOUNT DELETED!' and click 'Continue' button



        }
}