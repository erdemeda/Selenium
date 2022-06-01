package tests.bireyselCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q1 {


    @Test
    public void test01() throws InterruptedException {
// 1-Amazon sayfasina gidin
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

// 2-sag ust taraftaki all secenegine tiklayiniz
        amazonPage.allButtonElementi.click();

// 3-Digital Content & Devices yazisinin gorunur oldugundan emin olunuz
        Assert.assertTrue(amazonPage.digitalContentElementi.isDisplayed());

// 4-Kindle E-readers & Books secenegine tiklayiniz
        amazonPage.kindleEreadersButtonElementi.click();
        Thread.sleep(2000);

// 5-Kindle Kids secegini tiklayiniz
        amazonPage.kindleKidssButtonElementi.click();

// 6-sol taraftaki 3. resmin gorunurlugunu dogrulayiniz
        WebElement ucuncuResimElementi=Driver.getDriver().findElement(By.xpath("(//span[@class='a-button-text'])[6]"));
               Assert.assertTrue(ucuncuResimElementi.isDisplayed());

// 7-Registry uzerine gelip iki kere tiklayiniz
        amazonPage.registryButtonElementi.click();

// 8-Registrant name kismina telephone yaziniz
        WebElement registrantNameElementi=Driver.getDriver().findElement(By.xpath("//input[@class='gr-text gr-text--sm gr-text--tertiary gr-find-stripe__name']"));
        registrantNameElementi.sendKeys("telephone");

// 9-Select a registry or gift list type Birthday Gift List'i seciniz
        WebElement registryOrGiftElementi=Driver.getDriver().findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
        Select select =new Select(registryOrGiftElementi);
        select.selectByVisibleText("Birthday Gift List");


//10- "Sorry, no Gift Lists match your search." yazsinin ciktigini dogrulayiniz
//11-amazonu kapatin


    }
}