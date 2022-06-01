package bireyselCalismalar;

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
import java.util.List;

public class Q1 {

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

        //driver.close();
    }

    @Test
    public void test01() throws InterruptedException {

        // 1.  https://demoqa.com/  adresine gidin
        driver.get("https://demoqa.com/");

        // 2.  'Elements' i tiklayin
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Elements']")).click();

        // 3.  Sol tarafta 'Elements' cubugunun goruntulendigini dogrulayin
        WebElement elementsCubugu= driver.findElement(By.xpath("(//div[@class='element-group'])[1]"));
        Assert.assertTrue(elementsCubugu.isDisplayed());

        // 4.  'Web Tables' kısmını tiklayin
        driver.findElement(By.xpath("//span[text()='Web Tables']")).click();

        // 5.  Web Tables sayfasinin acildigini ve table body'sinin gorunur oldugunu dogrulayin
        driver.findElement(By.xpath("//div[@class='container playgound-body']")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='rt-table']")).isDisplayed();

        // 6.  Table'da kac data (cell) oldugunu konsolda yazdırın.
        System.out.println("*************** 6. TEST SONUCU *************");
        List<WebElement> dataSayiElementi=driver.findElements(By.xpath("//div[@class='rt-td']"));

        int dataSayisi=0;
        for (WebElement each:dataSayiElementi
             ) {
            dataSayisi++;
        }
        System.out.println("Data (cell) sayisi = "+ dataSayisi);


        // 7.  Table’daki başlıkları konsolda yazdırın.
        System.out.println("************** 7. TEST SONUCU *************");
        WebElement baslikElementi=driver.findElement(By.xpath("//div[@class='rt-thead -header']"));
        String basliklar=baslikElementi.getText();
        System.out.println("Basliklar = " + basliklar);

        // 8.  Table'da bulunan satirlari konsolda yazdırın. (8. ve 9. testler yer degistirildi)
        System.out.println("************** 8. TEST SONUCU *************");
        List<WebElement> satirSayisiElementi=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

        int satirSayisi=0;
        for (WebElement each:satirSayisiElementi
        ) {
            System.out.println((satirSayisi+1)+". satir = " + each.getText());
            satirSayisi++;
        }


        // 9.  Table'da kac satir oldugunu  konsolda yazdırın.
        System.out.println("************** 9. TEST SONUCU *************");
        System.out.println("Tablo'daki satir sayisi = " + satirSayisi);

        // 10. Table'da kac sutun oldugunu  konsolda yazdırın.
        System.out.println("************** 10. TEST SONUCU *************");

        List<WebElement> sutunSayisiElementi=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));

        System.out.println("Sutun sayisi = "+sutunSayisiElementi.size());


        // 11. Ikinci sutundaki tum elementleri konsolda yazdırın.
        System.out.println("************** 11. TEST SONUCU *************");
        List<WebElement> ikinciSutunElementi=driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][2]"));
        for (WebElement each:ikinciSutunElementi
             ) {
            System.out.println(each.getText());
        }

        // 12. Department basligindaki tum elementleri(sutun) konsolda yazdırın.
        System.out.println("************** 12. TEST SONUCU *************");

        List<WebElement> basliklarListesi=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        int departmentSutunNo=0;

        for (int i = 0; i < basliklarListesi.size() ; i++) {
            if (basliklarListesi.get(i).getText().equals("Department")) {
                departmentSutunNo = i;
            }
        }
            List<WebElement> departmentSutunElementi= driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td']["+(departmentSutunNo+1)+"]"));

            for (WebElement each: departmentSutunElementi) {
                System.out.println(each.getText());
            }


        // 13. Tabloda "Age" i 45 olan kisinin First Name'ini yazdirin
        System.out.println("************** 13. TEST SONUCU *************");

            List<WebElement> ageList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][3]"));
            List<WebElement> firstNameList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][1]"));

            for (int i = 0; i < ageList.size(); i++) {
                if (ageList.get(i).getText().equals("45")){
                    System.out.println(firstNameList.get(i).getText());
                }
            }


    }
}