package tests.bireyselCalisma;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.waitFor;

public class Tradylinn_RaporHazirlama extends TestBaseRapor {
    public TradylinnPage tradylinnPage;
    public JavascriptExecutor js ;
    public Actions actions;


    @Test
    public void us0013TestCase01() throws InterruptedException {
        tradylinnPage = new TradylinnPage();
        js = (JavascriptExecutor) Driver.getDriver();
        actions = new Actions(Driver.getDriver());
        extentTest=extentReports.createTest("US13","Kupon olusturabilmeli1");

        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.pass("tradylinn anasayfasina gidildi");

        // 2_ Kullanici vendor olarak siteye giris yapar
        tradylinnPage.girisYapButton.click();
        extentTest.pass("Giris yap butonuna tiklandi");

        tradylinnPage.usernameBox.sendKeys("team25ortak@gmail.com");
        extentTest.pass("Gecerli email yazildi");

        tradylinnPage.passwordBox.sendKeys("ortakKullan");
        extentTest.pass("Gecerli password yazildi");

        tradylinnPage.loginButton.click();
        extentTest.pass("login butonuna tiklandi");

        waitFor(5);

        // 3- Hesabim butonuna tiklar
        tradylinnPage.hesabimButton.click();
        extentTest.pass("Hesabim butonuna tiklandi");

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(tradylinnPage.hasabimSayfasi.isDisplayed());
        extentTest.pass("Hesabim sayfasi goruldu");


        // 5- Store Manager butonuna tiklar
        tradylinnPage.storeManagerButton.click();
        extentTest.pass("Store Manager butonuna tiklandi");

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(tradylinnPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        extentTest.pass("Welcome to the Tradylinn Dashboard yazisi goruldu");

        waitFor(3);

        // 7- Kuponlar butonuna tiklar
        js.executeScript("arguments[0].click();", tradylinnPage.kuponlarButonu);
        extentTest.pass("Kuponlar butonuna tiklandi");

        // 8- Yeni Ekle butonuna tiklar
        tradylinnPage.yeniEkleButonu.click();
        extentTest.pass("Yeni Ekle butonuna tiklandi");

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(tradylinnPage.addCouponYazisi.isDisplayed());
        extentTest.pass("Add Coupon yazisi goruldu");

        // 10- Code kutusuna kupon kodu yazar
        tradylinnPage.codeKutusu.sendKeys(tradylinnPage.codeNumarasi);
        extentTest.pass("Code kutusuna kupon kodu yazildi");

        // 11- Description kutusuna tanimlamalar yazar
        tradylinnPage.descriptionKutusu.sendKeys("belirli urunlerde %10 indirim");
        extentTest.pass("Description kutusuna tanimlamalar yazildi");

        // 12- Discount Type'dan indirim seklini secer
        Select select = new Select(tradylinnPage.discountTypeKutusu);
        select.selectByIndex(0);
        extentTest.pass("Discount Type'dan indirim seklini secildi");

        // 13- Coupon Amount kutusuna kupon miktari girer
        tradylinnPage.couponAmountKutusu.sendKeys("100");
        extentTest.pass("Coupon Amount kutusuna kupon miktari girildi");

        // 14- Urun kuponu son kullanim tarihi girer
        tradylinnPage.expiryDateKutusu.sendKeys("2022-08-01");
        extentTest.pass("Urun kuponu son kullanim tarihi girildi");

        // 15- Allow free shipping butonuna tiklar
        js.executeScript("arguments[0].click();", tradylinnPage.allowFreeShipping);
        extentTest.pass("Allow free shipping butonuna tiklandi");

        // 16- Show on store butonuna tiklar
        js.executeScript("arguments[0].click();", tradylinnPage.showOnStore);
        extentTest.pass("Show on store butonuna tiklandi");

        // 17- SUBMIT butonuna tiklar
        //  js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);


    }

    @Test(dependsOnMethods = "us0013TestCase01")
    public void us0014TestCase01() {

        tradylinnPage = new TradylinnPage();
        js = (JavascriptExecutor) Driver.getDriver();
        actions = new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("US14","Kupon olusturabilmeli2");
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();


        // 11- Minimum spend bolumune min harcama miktari girer
        tradylinnPage.minimumSpendKutusu.sendKeys("1000");
        extentTest.pass("Minimum spend bolumune min harcama miktari girildi");

        // 12- Maximum spend kismina max harcama miktarı girer
        tradylinnPage.maximumSpendKutusu.sendKeys("5000");
        extentTest.pass("Maximum spend kismina max harcama miktarı girildi");

        // 13- Individual use only butonuna tiklar
        js.executeScript("arguments[0].click();",tradylinnPage.individualUseOnly);
        extentTest.pass("Individual use only butonuna tiklandi");


        // 14- Exclude sale items butonuna tiklar
        js.executeScript("arguments[0].click();",tradylinnPage.excludeSaleItems);
        extentTest.pass("Exclude sale items butonuna tiklandi");


        // 15- Exclude categories bolumunden kategori secer
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        Select select = new Select(tradylinnPage.excludeCategories);
        select.selectByIndex(2);
        extentTest.pass("Exclude categories bolumunden kategori secildi");
        waitFor(5);


        // 16- SUBMIT butonuna tiklar

    }


    @Test(dependsOnMethods = "us0014TestCase01")
    public void us0015TestCase01() {
        tradylinnPage = new TradylinnPage();
        js = (JavascriptExecutor) Driver.getDriver();
        actions = new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("US15","Kupon olusturabilmeli3");
        // 11- Limit butonuna tiklar
        tradylinnPage.limitButonu.click();
        extentTest.pass("Limit butonuna tiklandi");

        //12- Limitlendirme bolumunun acildigini gorur
        Assert.assertTrue(tradylinnPage.limitlendirmeBolumu.isDisplayed());
        extentTest.pass("Limitlendirme bolumunun acildigi goruldu");

        //13- Usage limit per coupon bolumune kupon basina kullanim limiti yazar
        tradylinnPage.usageLimitPerCoupon.sendKeys("10");
        extentTest.pass("Usage limit per coupon bolumune kupon basina kullanim limiti yazildi");

        //14- Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazar
        tradylinnPage.limitUsageToXitems.sendKeys("10");
        extentTest.pass("Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazildi");

        //15- Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazar
        tradylinnPage.usageLimitPerUser.sendKeys("5");
        extentTest.pass("Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazildi");
        waitFor(3);

        //16- SUBMIT butonuna tiklar

        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);
        extentTest.pass("SUBMIT butonuna tiklandi");


    }
}
/*
public class US_13_14_15 {


    public KuponOlusturmaPage kuponOlusturmaPage = new KuponOlusturmaPage();
    public OrtakLocatorPage ortakLocatorPage = new OrtakLocatorPage();
    public JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    public Actions actions = new Actions(Driver.getDriver());

    @Test
    public void us0013TestCase01() throws InterruptedException {


        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2_ Kullanici vendor olarak siteye giris yapar
        ortakLocatorPage.girisYapButton.click();
        ortakLocatorPage.usernameBox.sendKeys("team25ortak@gmail.com");
        ortakLocatorPage.passwordBox.sendKeys("ortakKullan");
        ortakLocatorPage.loginButton.click();

        waitFor(5);

        // 3- Hesabim butonuna tiklar
        ortakLocatorPage.hesabimButton.click();

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(kuponOlusturmaPage.hasabimSayfasi.isDisplayed());


        // 5- Store Manager butonuna tiklar
        kuponOlusturmaPage.storeManagerButton.click();

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        waitFor(3);

        // 7- Kuponlar butonuna tiklar
        // tradylinnPage.kuponlarButonu.click();
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.kuponlarButonu);

        // 8- Yeni Ekle butonuna tiklar
        kuponOlusturmaPage.yeniEkleButonu.click();

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.addCouponYazisi.isDisplayed());

        // 10- Code kutusuna kupon kodu yazar
        kuponOlusturmaPage.codeKutusu.sendKeys(kuponOlusturmaPage.codeNumarasi);

        // 11- Description kutusuna tanimlamalar yazar
        kuponOlusturmaPage.descriptionKutusu.sendKeys("belirli urunlerde %10 indirim");

        // 12- Discount Type'dan indirim seklini secer
        Select select = new Select(kuponOlusturmaPage.discountTypeKutusu);
        select.selectByIndex(0);

        // 13- Coupon Amount kutusuna kupon miktari girer
        kuponOlusturmaPage.couponAmountKutusu.sendKeys("100");

        // 14- Urun kuponu son kullanim tarihi girer
        kuponOlusturmaPage.expiryDateKutusu.sendKeys("2022-08-01");

        // 15- Allow free shipping butonuna tiklar

        js.executeScript("arguments[0].click();", kuponOlusturmaPage.allowFreeShipping);

        // 16- Show on store butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.showOnStore);

        // 17- SUBMIT butonuna tiklar
        //  js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);


    }

    @Test(dependsOnMethods = "us0013TestCase01")
    public void us0014TestCase01() {

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();

        // 11- Minimum spend bolumune min harcama miktari girer
        kuponOlusturmaPage.minimumSpendKutusu.sendKeys("1000");

        // 12- Maximum spend kismina max harcama miktarı girer
        kuponOlusturmaPage.maximumSpendKutusu.sendKeys("5000");

        // 13- Individual use only butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.individualUseOnly);


        // 14- Exclude sale items butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.excludeSaleItems);


        // 15- Exclude categories bolumunden kategori secer
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        Select select = new Select(kuponOlusturmaPage.excludeCategories);
        select.selectByIndex(2);
        waitFor(5);

        // 16- SUBMIT butonuna tiklar

    }


    @Test(dependsOnMethods = "us0014TestCase01")
    public void us0015TestCase01() {

        // 11- Limit butonuna tiklar
        kuponOlusturmaPage.limitButonu.click();

        //12- Limitlendirme bolumunun acildigini gorur
        Assert.assertTrue(kuponOlusturmaPage.limitlendirmeBolumu.isDisplayed());

        //13- Usage limit per coupon bolumune kupon basina kullanim limiti yazar
        kuponOlusturmaPage.usageLimitPerCoupon.sendKeys("10");

        //14- Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazar
        kuponOlusturmaPage.limitUsageToXitems.sendKeys("10");

        //15- Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazar
        kuponOlusturmaPage.usageLimitPerUser.sendKeys("5");
        waitFor(3);

        //16- SUBMIT butonuna tiklar

        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.submitButonu);


    }

}

 */