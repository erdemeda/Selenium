package tests.bireyselCalisma;

import org.apache.http.util.Asserts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Tradylinn {


    public TradylinnPage tradylinnPage = new TradylinnPage();
    public ReusableMethods reusableMethods= new ReusableMethods();
    public JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    public  Actions actions = new Actions(Driver.getDriver());

    @Test
    public void us0013TestCase01() throws InterruptedException {


        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        // 2_ Kullanici vendor olarak siteye giris yapar
        tradylinnPage.girisYapButton.click();
        tradylinnPage.usernameBox.sendKeys("team25ortak@gmail.com");
        tradylinnPage.passwordBox.sendKeys("ortakKullan");
        tradylinnPage.loginButton.click();

        reusableMethods.waitFor(5);

        // 3- Hesabim butonuna tiklar
        tradylinnPage.hesabimButton.click();

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(tradylinnPage.hasabimSayfasi.isDisplayed());


        // 5- Store Manager butonuna tiklar
        tradylinnPage.storeManagerButton.click();

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(tradylinnPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        reusableMethods.waitFor(3);
        Thread.sleep(2000);
        // 7- Kuponlar butonuna tiklar
        // tradylinnPage.kuponlarButonu.click();
        js.executeScript("arguments[0].click();", tradylinnPage.kuponlarButonu);

        // 8- Yeni Ekle butonuna tiklar
        tradylinnPage.yeniEkleButonu.click();

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(tradylinnPage.addCouponYazisi.isDisplayed());

        // 10- Code kutusuna kupon kodu yazar
        tradylinnPage.codeKutusu.sendKeys(tradylinnPage.codeNumarasi);

        // 11- Description kutusuna tanimlamalar yazar
        tradylinnPage.descriptionKutusu.sendKeys("belirli urunlerde %10 indirim");

        // 12- Discount Type'dan indirim seklini secer
        Select select = new Select(tradylinnPage.discountTypeKutusu);
        select.selectByIndex(0);

        // 13- Coupon Amount kutusuna kupon miktari girer
        tradylinnPage.couponAmountKutusu.sendKeys("100");

        // 14- Urun kuponu son kullanim tarihi girer
        tradylinnPage.expiryDateKutusu.sendKeys("2022-08-01");

        // 15- Allow free shipping butonuna tiklar

        js.executeScript("arguments[0].click();", tradylinnPage.allowFreeShipping);

        // 16- Show on store butonuna tiklar
        js.executeScript("arguments[0].click();", tradylinnPage.showOnStore);

        // 17- SUBMIT butonuna tiklar
        //  js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);


    }

    @Test(dependsOnMethods = "us0013TestCase01")
    public void us0014TestCase01() {

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();

        // 11- Minimum spend bolumune min harcama miktari girer
        tradylinnPage.minimumSpendKutusu.sendKeys("1000");

        // 12- Maximum spend kismina max harcama miktarı girer
        tradylinnPage.maximumSpendKutusu.sendKeys("5000");

        // 13- Individual use only butonuna tiklar
        js.executeScript("arguments[0].click();",tradylinnPage.individualUseOnly);


        // 14- Exclude sale items butonuna tiklar
        js.executeScript("arguments[0].click();",tradylinnPage.excludeSaleItems);


        // 15- Exclude categories bolumunden kategori secer
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        Select select = new Select(tradylinnPage.excludeCategories);
        select.selectByIndex(2);
        reusableMethods.waitFor(5);

        // 16- SUBMIT butonuna tiklar

    }


    @Test(dependsOnMethods = "us0014TestCase01")
    public void us0015TestCase01() {

        // 11- Limit butonuna tiklar
        tradylinnPage.limitButonu.click();

        //12- Limitlendirme bolumunun acildigini gorur
        Assert.assertTrue(tradylinnPage.limitlendirmeBolumu.isDisplayed());

        //13- Usage limit per coupon bolumune kupon basina kullanim limiti yazar
        tradylinnPage.usageLimitPerCoupon.sendKeys("10");

        //14- Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazar
        tradylinnPage.limitUsageToXitems.sendKeys("10");

        //15- Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazar
        tradylinnPage.usageLimitPerUser.sendKeys("5");
        reusableMethods.waitFor(3);

        //16- SUBMIT butonuna tiklar

        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);


    }

}