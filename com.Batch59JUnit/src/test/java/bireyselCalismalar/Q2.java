package bireyselCalismalar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Q2 {

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
    public void test01() throws InterruptedException, IOException {

        //n11 sitesine giris yapin
        driver.get("https://www.n11.com/");

        //Sayfada cikan cookies 'leri kapatin
        driver.findElement(By.xpath("(//span[@class='closeBtn'])[2]")).click();
        driver.findElement(By.xpath("(//button[@class='dn-slide-deny-btn'])[1]")).click();


        // Mağazalar yazısının üzerine gelin.
        Actions actions=new Actions(driver);
        WebElement magazalarYazisi= driver.findElement(By.xpath("//li[@class='hBotMenuItem hTMItem hasMenu']"));
        actions.moveToElement(magazalarYazisi).perform();


        //Açılan menü-de Mağazaları gör butonuna tiklayin.
        driver.findElement(By.xpath("//a[@href='https://www.n11.com/magazalar']")).click();
        Thread.sleep(2000);

        //Açılan sayfada Tüm Mağazalar tıklandı
        driver.findElement(By.xpath("//h3[text()='Tüm Mağazalar']")).click();

        //M harfi ile başlayan mağazalara tiklayin.
        driver.findElement(By.xpath("//span[@data-has-seller='M']")).click();

        //Cikan magazalari excel dosyasina atin
        List<WebElement> mIleBaslayanlarListe =driver.findElements(By.xpath("(//div[@class='sellerListHolder'])[4]//ul//li"));

        String dosyaYolu ="src/resources/Milebaslayanlar.xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);

        for(int i=0; i<mIleBaslayanlarListe.size(); i++){

            workbook.getSheet("Sayfa1").
                    createRow(i).
                    createCell(0).
                    setCellValue(mIleBaslayanlarListe.get(i).getText());
        }


        //Satir sayisini yazdirin
        int sonSatir=workbook
                .getSheet("Sayfa1")
                .getLastRowNum();

        //excel dosyasini kaydedin
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);

        // n11 sayfasini kapatin
      //  driver.close();

    }
}
