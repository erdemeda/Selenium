package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev {

// 1 C01_TekrarTesti isimli bir class olusturun
WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }


@Test
public void test01(){
  // 2 https://www.google.com/ adresine gidin
    driver.get("https://www.google.com/");


    // 3 cookies uyarisini kabul ederek kapatin
    //cookies bulunamadi


    // 4 Sayfa basliginin “Google” ifadesi icerdigini test edin
    WebElement googleYazisi= driver.findElement(By.xpath("//img[@class='lnXdpd']"));

    if (driver.getTitle().contains("Google")){
        System.out.println("test PASSED");
    }else{
        System.out.println("test FAILED");
    }

// 5 Arama cubuguna “Nutella” yazip aratin

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Nutella"+ Keys.ENTER);

// 6 Bulunan sonuc sayisini yazdirin

//List<WebElement> sonucSayisi=driver.findElements(By.xpath("//div[@id='result-stats']"));
//WebElement sonucSayisiElementi=sonucSayisi.get(0);
// System.out.println(sonucSayisiElementi.getText());
    String[] sonucText = driver.findElement(By.xpath("//div[@id='result-stats']")).getText().split(" ");
    String sonucSayisi = sonucText[1];
    System.out.println("bulunan sonuc sayisi = " + sonucSayisi);


// 7 sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    sonucSayisi = sonucSayisi.replaceAll("\\D", "");
    int karsilastirilacakSayi = 10000000;

    if (Integer.parseInt(sonucSayisi)>karsilastirilacakSayi){
        System.out.println(sonucSayisi+", "+karsilastirilacakSayi+"'dan buyuktur. Test PASSED");
    }else{
        System.out.println(sonucSayisi+", "+karsilastirilacakSayi+"'dan buyuk degildir. Test FAILED");
    }

// 8 Sayfayi kapatin
   // driver.close();


    }

}
