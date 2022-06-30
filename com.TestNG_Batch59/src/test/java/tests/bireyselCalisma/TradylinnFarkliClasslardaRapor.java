package tests.bireyselCalisma;

public class TradylinnFarkliClasslardaRapor {

    /*

    public class US_13 extends TestBaseRapor {


    @Test
    public void us0013TestCase01() throws InterruptedException {

      KuponOlusturmaPage kuponOlusturmaPage = new KuponOlusturmaPage();
      OrtakLocatorPage ortakLocatorPage = new OrtakLocatorPage();
      JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


      extentTest=extentReports.createTest("US13","Kupon olusturabilmeli");

        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.pass("tradylinn anasayfasina gidildi");


        // 2_ Kullanici vendor olarak siteye giris yapar
        ortakLocatorPage.girisYapButton.click();
        ortakLocatorPage.usernameBox.sendKeys("team25ortak@gmail.com");
        ortakLocatorPage.passwordBox.sendKeys("ortakKullan");
        ortakLocatorPage.loginButton.click();
        extentTest.pass("vendor olarak siteye giris yapildi");

        waitFor(5);

        // 3- Hesabim butonuna tiklar
        ortakLocatorPage.hesabimButton.click();
        extentTest.pass("Hesabim butonuna tiklandi");

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(kuponOlusturmaPage.hasabimSayfasi.isDisplayed());
        extentTest.pass("Hesabim sayfasi goruldu");

        // 5- Store Manager butonuna tiklar
        kuponOlusturmaPage.storeManagerButton.click();
        extentTest.pass("Store Manager butonuna tiklandi");

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        extentTest.pass("Welcome to the Tradylinn Dashboard yazisi goruldu");

        waitFor(3);

        // 7- Kuponlar butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.kuponlarButonu);
       extentTest.pass("Kuponlar butonuna tiklandi");


        // 8- Yeni Ekle butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.yeniEkleButonu);
        extentTest.pass("Yeni Ekle butonuna tiklandi");

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.addCouponYazisi.isDisplayed());
        extentTest.pass("Add Coupon yazisi goruldu");

        // 10- Code kutusuna kupon kodu yazar
        kuponOlusturmaPage.codeKutusu.sendKeys(kuponOlusturmaPage.codeNumarasi);
        extentTest.pass("Code kutusuna kupon kodu yazildi");

        // 11- Description kutusuna tanimlamalar yazar
        kuponOlusturmaPage.descriptionKutusu.sendKeys("belirli urunlerde %10 indirim");
        extentTest.pass("Description kutusuna tanimlamalar yazildi");

        // 12- Discount Type'dan indirim seklini secer
        Select select = new Select(kuponOlusturmaPage.discountTypeKutusu);
        select.selectByIndex(0);
        extentTest.pass("Discount Type'dan indirim seklini secildi");

        // 13- Coupon Amount kutusuna kupon miktari girer
        kuponOlusturmaPage.couponAmountKutusu.sendKeys("100");
        extentTest.pass("Coupon Amount kutusuna kupon miktari girildi");

        // 14- Urun kuponu son kullanim tarihi girer
        kuponOlusturmaPage.expiryDateKutusu.sendKeys("2022-08-01");
        extentTest.pass("Urun kuponu son kullanim tarihi girildi");

        // 15- Allow free shipping butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.allowFreeShipping);
        extentTest.pass("Allow free shipping butonuna tiklandi");

        // 16- Show on store butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.showOnStore);
        extentTest.pass("Show on store butonuna tiklandi");

        // 17- SUBMIT butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.submitButonu);
        extentTest.pass("SUBMIT butonuna tiklandi");

    }
}

------------------------------------------------------------------
public class US_14 extends TestBaseRapor {



    @Test
    public void us0014TestCase01() throws InterruptedException {

        KuponOlusturmaPage kuponOlusturmaPage = new KuponOlusturmaPage();
        OrtakLocatorPage ortakLocatorPage = new OrtakLocatorPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("US14","Restrictions yapilabilmeli");

        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.pass("tradylinn anasayfasina gidildi");


        // 2_ Kullanici vendor olarak siteye giris yapar
        ortakLocatorPage.girisYapButton.click();
        ortakLocatorPage.usernameBox.sendKeys("team25ortak@gmail.com");
        ortakLocatorPage.passwordBox.sendKeys("ortakKullan");
        ortakLocatorPage.loginButton.click();
        extentTest.pass("vendor olarak siteye giris yapildi");

        waitFor(5);

        // 3- Hesabim butonuna tiklar
        ortakLocatorPage.hesabimButton.click();
        extentTest.pass("Hesabim butonuna tiklandi");

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(kuponOlusturmaPage.hasabimSayfasi.isDisplayed());
        extentTest.pass("Hesabim sayfasi goruldu");

        // 5- Store Manager butonuna tiklar
        kuponOlusturmaPage.storeManagerButton.click();
        extentTest.pass("Store Manager butonuna tiklandi");

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        extentTest.pass("Welcome to the Tradylinn Dashboard yazisi goruldu");

        waitFor(3);

        // 7- Kuponlar butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.kuponlarButonu);
        extentTest.pass("Kuponlar butonuna tiklandi");


        // 8- Yeni Ekle butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.yeniEkleButonu);
        extentTest.pass("Yeni Ekle butonuna tiklandi");

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.addCouponYazisi.isDisplayed());
        extentTest.pass("Add Coupon yazisi goruldu");

        // 10- Code kutusuna kupon kodu yazar
        kuponOlusturmaPage.codeKutusu.sendKeys(kuponOlusturmaPage.codeNumarasi);
        extentTest.pass("Code kutusuna kupon kodu yazildi");


        // 11- Minimum spend bolumune min harcama miktari girer
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();
        kuponOlusturmaPage.minimumSpendKutusu.sendKeys("1000");
        extentTest.pass("Minimum spend bolumune min harcama miktari girildi");

        // 12- Maximum spend kismina max harcama miktarı girer
        kuponOlusturmaPage.maximumSpendKutusu.sendKeys("5000");
        extentTest.pass("Maximum spend kismina max harcama miktarı girildi");

        // 13- Individual use only butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.individualUseOnly);
        extentTest.pass("Individual use only butonuna tiklandi");

        // 14- Exclude sale items butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.excludeSaleItems);
        extentTest.pass("Exclude sale items butonuna tiklandi");

        // 15- Exclude categories bolumunden kategori secer
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
        Select select = new Select(kuponOlusturmaPage.excludeCategories);
        select.selectByIndex(2);
        extentTest.pass("Exclude categories bolumunden kategori secildi");
        waitFor(5);

        // 16- SUBMIT butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.submitButonu);
        extentTest.pass("SUBMIT butonuna tiklandi");

    }
}


---------------------------------------------------------------------

public class US_15 extends TestBaseRapor {

    @Test
    public void us0015TestCase01() throws InterruptedException {

        KuponOlusturmaPage kuponOlusturmaPage = new KuponOlusturmaPage();
        OrtakLocatorPage ortakLocatorPage = new OrtakLocatorPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("US15","Limitlemeler yapilabilmeli");

        //1_Kullanici belirtilen Url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.pass("tradylinn anasayfasina gidildi");

        // 2_ Kullanici vendor olarak siteye giris yapar
        ortakLocatorPage.girisYapButton.click();
        ortakLocatorPage.usernameBox.sendKeys("team25ortak@gmail.com");
        ortakLocatorPage.passwordBox.sendKeys("ortakKullan");
        ortakLocatorPage.loginButton.click();
        extentTest.pass("vendor olarak siteye giris yapildi");
        waitFor(5);

        // 3- Hesabim butonuna tiklar
        //js.executeScript("arguments[0].click();", ortakLocatorPage.hesabimButton);
        ortakLocatorPage.hesabimButton.click();
        extentTest.pass("Hesabim butonuna tiklandi");

        // 4- ' Hesabim' sayfasina basarili bir sekilde girer
        Assert.assertTrue(kuponOlusturmaPage.hasabimSayfasi.isDisplayed());
        extentTest.pass("Hesabim sayfasi goruldu");

        // 5- Store Manager butonuna tiklar
        kuponOlusturmaPage.storeManagerButton.click();
        extentTest.pass("Store Manager butonuna tiklandi");

        // 6- Welcome to the Tradylinn Dashboard' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.welcomeTradylinnDashboardYazisi.isDisplayed());
        extentTest.pass("Welcome to the Tradylinn Dashboard yazisi goruldu");

        waitFor(3);

        // 7- Kuponlar butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.kuponlarButonu);
        extentTest.pass("Kuponlar butonuna tiklandi");


        // 8- Yeni Ekle butonuna tiklar
        js.executeScript("arguments[0].click();", kuponOlusturmaPage.yeniEkleButonu);
        extentTest.pass("Yeni Ekle butonuna tiklandi");

        // 9- 'Add Coupon' yazisini gorur
        Assert.assertTrue(kuponOlusturmaPage.addCouponYazisi.isDisplayed());
        extentTest.pass("Add Coupon yazisi goruldu");

        // 10- Code kutusuna kupon kodu yazar
        kuponOlusturmaPage.codeKutusu.sendKeys(kuponOlusturmaPage.codeNumarasi);
        extentTest.pass("Code kutusuna kupon kodu yazildi");

        // 11- Limit butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.limitButonu);
        extentTest.pass("Limit butonuna tiklandi");

        //12- Limitlendirme bolumunun acildigini gorur
        Assert.assertTrue(kuponOlusturmaPage.limitlendirmeBolumu.isDisplayed());
        extentTest.pass("Limitlendirme bolumunun acildigi goruldu");

        //13- Usage limit per coupon bolumune kupon basina kullanim limiti yazar
        kuponOlusturmaPage.usageLimitPerCoupon.sendKeys("10");
        extentTest.pass("Usage limit per coupon bolumune kupon basina kullanim limiti yazildi");

        //14- Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazar
        kuponOlusturmaPage.limitUsageToXitems.sendKeys("10");
        extentTest.pass("Limit usage to X items bolumune kupon kullanım limiti uygulanacak urunler yazildi");

        //15- Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazar
        kuponOlusturmaPage.usageLimitPerUser.sendKeys("5");
        extentTest.pass("Usage limit per user bolumune kullanici basina uygulanacak kullanim siniri yazildi");
        waitFor(3);


        // 16- SUBMIT butonuna tiklar
        js.executeScript("arguments[0].click();",kuponOlusturmaPage.submitButonu);
        extentTest.pass("SUBMIT butonuna tiklandi");

    }


}







     */


}
