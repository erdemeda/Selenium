package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev1 {

//1) Bir class oluşturun: BestBuy Assertions

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
    //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki
//testleri yapin

    @Test
    public void test01(){

       driver.get("https://www.bestbuy.com/");

        //○Sayfa URL’inin https://www.bestbuy.com/‘a esit oldugunu test edin
        String bulunanUrl=driver.getCurrentUrl();
        String beklenenUrl="https://www.bestbuy.com/";

        if (bulunanUrl.equals(beklenenUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("beklenen URL'den farkli, test FAİLED");
        }

        //○titleTest => Sayfa başlığının “ Rest” içermediğini(contains) test edin

         if (!driver.getTitle().contains("Rest")){
             System.out.println("Baslik testi PASSED");
        }else{
             System.out.println("Baslik testi FAILED");
         }

        //○logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoGoruntuleme=driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));

         if (logoGoruntuleme.isDisplayed()){
             System.out.println("logo goruntuleme testi PASSED");
         }else{
             System.out.println("logo goruntuleme testi FAILED");
         }

        //○Francais LinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement frLinkGoruntuleme=driver.findElement(By.xpath("//button[@lang='fr']"));
        if (frLinkGoruntuleme.isDisplayed()){
            System.out.println("FR.Link goruntuleme testi PASSED");
        }else{
            System.out.println("FR.Link goruntuleme testi FAILED");
        }

    }










}
