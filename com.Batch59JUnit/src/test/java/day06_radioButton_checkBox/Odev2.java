package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {
//1) Bir class oluşturun: Youtube Assertions

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test1(){
        //2) https://www.youtube.com adresine gidin
        driver.get("https://www.youtube.com");

        //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin

        //○ titleTest => Sayfa başlığının "YouTube" oldugunu test edin
        Assert.assertEquals(driver.getTitle(), "YouTube");

        //○ titleTest => Sayfa başlığının "YouTube" oldugunu test edin
        Assert.assertEquals(driver.getTitle(), "YouTube");

        //○ imageTest => YouTube resminin görüntülendiğini isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]")).isDisplayed());

        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isEnabled());

        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertFalse(driver.getTitle().equals("youtube"));


    }

}
