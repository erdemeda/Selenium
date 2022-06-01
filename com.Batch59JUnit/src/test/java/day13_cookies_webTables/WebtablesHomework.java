package day13_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class WebtablesHomework extends TestBase {

    @Test
    public void test01() {

       //  1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

       //  2. Headers da bulunan department isimlerini yazdirin
        WebElement headers=driver.findElement(By.xpath("//div[@class='rt-thead -header']"));
        System.out.println(headers.getText());

        //  3. sutunun basligini yazdirin
        WebElement ucuncuBaslik=driver.findElement(By.xpath("(//div[@class='rt-resizable-header-content'])[3]"));
        System.out.println("ucuncu sutun basligi : "+ucuncuBaslik.getText());

       //  4. Tablodaki tum datalari yazdirin
        List<WebElement> tumDatalarListesi=driver.findElements(By.xpath("//div[@class='rt-tbody']"));

        for (WebElement each:tumDatalarListesi
             ) {
            System.out.println(each.getText());
        }

       //  5. Tabloda kac cell (data) oldugunu yazdirin
        List<WebElement> cellSayiListesi=driver.findElements(By.xpath("//div[@class='rt-td']"));

        System.out.println("Tablodaki data(cell) sayisi : "+cellSayiListesi.size());

       //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirSayiListesi=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

        System.out.println("Tablodaki satir sayisi : "+satirSayiListesi.size());

       //  7. Tablodaki sutun sayisini yazdirin
        List<WebElement> sutunSayiListesi=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));

        System.out.println("Tablodaki sutun sayisi : "+sutunSayiListesi.size());

        //  8. Tablodaki 3.kolonu yazdirin

        int sutunNo=3;
        List<WebElement> ucuncuSutunListesi=driver.findElements(By.xpath("//div[@class='rt-table'](//div[@class='rt-th rt-resizable-header -cursor-pointer'])["+sutunNo+"]"));

        for (WebElement each: ucuncuSutunListesi) {
            System.out.println("Ucuncu sutun listesi : "+each.getText());
        }

        /*
        List<WebElement> emailSutunListesi=
                driver.findElements(By.xpath("//tbody//td["+(emailSutunNo+1)+"]"));

         */
       //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
       //  10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin







    }
}
