package tests.bireyselCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q2 {


    @Test
    public void test01() throws InterruptedException {
        //1. "https://demoqa.com/" adresine gidiniz.
        DemoqaPage demoqaPage=new DemoqaPage();
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));

        //2. Alerts, Frame & windows elementini tiklayiniz.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        demoqaPage.alertsFrameWindowsButonu.click();
        Thread.sleep(2000);
        //3. Alerts, Frame & windows secenegini tiklayiniz.
        WebElement aFwElementi=Driver.getDriver().findElement(By.xpath("(//div[@class='icon'])[3]"));
        aFwElementi.click();

        Thread.sleep(2000);
        // 4. Sirasiyla 'Browser window' ve 'New tab' butonlarini secerek
        WebElement browserWindowElementi=Driver.getDriver().findElement(By.xpath("(//span[@class='text'])[11]"));
        browserWindowElementi.click();
        Thread.sleep(2000);
        WebElement newTabElementi=Driver.getDriver().findElement(By.xpath("//button[@id='tabButton']"));
        newTabElementi.click();
        Thread.sleep(2000);
        // 'This is a sample page'yazisinin ciktigini dogrulayiniz.
        WebElement samplePageYaziElementi=Driver.getDriver().findElement(By.xpath
                ("//*[text()='This is a sample page']"));
        Assert.assertTrue(samplePageYaziElementi.isDisplayed());
        System.out.println("samplePageYazisi = " + samplePageYaziElementi.getText());


        // 5.'New window' u secerek acilan sayfayi tam ekran yapiniz.
        //6. 'New window message' u seçerek acilan sayfadaki yaziyi silip 'Başardım!' yaziniz.



    }

}
