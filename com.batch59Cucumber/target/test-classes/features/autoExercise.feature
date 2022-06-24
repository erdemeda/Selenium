


Feature: kullanici automationexercise sayfasinda islemler yapar


 Background: ortak adimlar
   Given kullanici "autoExerciseUrl" anasayfasinda
   And anasayfanin gorunur oldugu dogrulanir

  Scenario: TestCase01 kullanici kaydedilir
    And Signup Login butonuna tiklar
    And New User Signup yazisinin gorunur oldugunu test eder
    And gecerli name ve email address girer
    And Signup butonuna tiklar
    And ENTER ACCOUNT INFORMATION yazisinin gorunur oldugunu test eder
    And ilk kisim ayrintilari doldurur
    And Sign up for our newsletter onay butonunu tiklar
    And Receive special offers from our partners onay butonunu tiklar
    And ikinci kisim ayrintilari doldurur
    And Create Account butonunu tiklar
    And ACCOUNT CREATED yazisinin gorunur oldugunu test eder
    And Continiue butonunu tiklar
    And Logged in as username yazisinin gorunur oldugunu test eder
    Then Delete Account butonunu tiklar


    Scenario: TestCase02 kullanici dogru email ve sifre ile giris yapar
      And Signup Login butonuna tiklar
      And Login to your account yazisinin gorunur oldugunu test eder
      And dogru email ve password girer
      And login butonuna tiklar
      And Logged in as username yazisinin gorunur oldugunu test eder
      And Delete Account butonunu tiklar


    Scenario: TestCase03 kullanici yanlis email ve sifre ile giris yapar
      And Signup Login butonuna tiklar
      And Login to your account yazisinin gorunur oldugunu test eder
      And yanlis email ve yanlis password girer
      And login butonuna tiklar
      And Your email or password is incorrect yazisinin gorunur oldugunu test eder


      Scenario: TestCase04 kullanici cikis yapar
        And Signup Login butonuna tiklar
        And Login to your account yazisinin gorunur oldugunu test eder
        And dogru email ve password girer
        And login butonuna tiklar
        And Logged in as username yazisinin gorunur oldugunu test eder
        And Logout butonuna tiklar
        And kullanicinin login sayfasina yonlendirildigini test eder


        Scenario: TestCase05 kullanici mevcut email ile kaydedilir
          And Signup Login butonuna tiklar
          Then New User Signup yazisinin gorunur oldugunu test eder
          And gecerli name ve email address girer
          And Signup butonuna tiklar
          And Email Address already exist yazisinin gorunur oldugunu test eder


        Scenario: TestCase06 kullanici Contact Us formunu doldurur
          And Contact Us butonuna tiklar
          And GET IN TOUCH yazisinin gorunur oldugunu test eder
          Then name email subject ve message bilgileri girer
          And dosya yuklemesi yapar
          And Submit butonuna tiklar
          And OK butonuna tiklar
          And Success! Your details have been submitted successfully yazisinin gorunur oldugunu test eder
          And Home butonuna tiklar ve basarili bir sekilde gecis yapildigini test eder


        Scenario: TestCase07 kullanici Test Case sayfasinin gorunur oldugunu kontrol eder
          And Test Case butonuna tiklar
          Then Test Case sayfasina basarili bir sekilde gecis yapildigini test eder


        Scenario: TestCase08 kullanici tum urunlerde ve urun detay sayfasinda dogrulama yapar
          And Products butonuna tiklar
          And ALL PRODUCTS sayfasina basarili bir sekilde gecis yapildigini test eder
          And urun listesinin gorunur oldugunu test eder
          And ilk urunun View Product butonuna tiklar
          Then urun detey sayfasina yonlendirildigini test eder
          And product name category price availability condition brand ayrintilarinin gorunur oldugunu test eder


        Scenario: TestCase09 kullanici urun aramasi yapar
          And Products butonuna tiklar
          And ALL PRODUCTS sayfasina basarili bir sekilde gecis yapildigini test eder
          And search product kutusunun icine product name yazar ve search butonuna tiklar
          Then SEARCHED PRODUCTS yazisinin gorunur oldugunu test eder
          And aramayla ilgili tum urunlerin gorunur oldugunu test eder


          Scenario: TestCase10 kullanici anasaydaki aboneligi dogrular
            And alt bilgi icin asagi kaydirir.
            And SUBSCRIPTION yazisinin gorunur oldugunu test eder
            Then your email adderss kutucuguna email adresini yazar ve ok isaterine tiklar
            And You have been successfully subscribed yazisinin gorunur oldugunu test eder

          Scenario: TestCase11 kullanici sepet sayfasinda aboneligi dogrular
            And Cart butonuna tiklar
            And alt bilgi icin asagi kaydirir.
            And SUBSCRIPTION yazisinin gorunur oldugunu test eder
            And your email adderss kutucuguna email adresini yazar ve ok isaterine tiklar
            And You have been successfully subscribed yazisinin gorunur oldugunu test eder


          Scenario: TestCase12 kullanici sepete urun ekleme yapar
            And Products butonuna tiklar
            And ilk urunun uzerine gelir ve Add to cart a tiklar
            And Continue Shopping butonuna tiklar
            And fareyi ikinci urunun uzerine getirir ve Add to cart a tiklar
            And View Cart butonuna tiklar
            And iki urunun de sepete eklendigini test eder
            And fiyatlarini miktarlarini ve toplam fiyatin dogrulugunu test eder



          Scenario: TestCase13 kullanici sepetteki urun miktarini dogrular
            And ana sayfadaki herhangi bir ürün için View Product i tıklar
            And urun detaylarinin acildigini test eder
            And miktari dort e cikarir
            Then Add to cart butonuna tiklar
            And View Cart butonuna tiklar
            And urunun sepet sayfasinda tam miktari ile goruntulendigini test eder

  @autex
         Scenario: TestCase14 kullanici siparis verip odeme yaparken kaydolur
           And sepete urun ekler
           Then Cart butonuna tiklar
           And sepet sayfasinin goruntulendigini test eder
           And Proceed To Checkout tiklar
           And Register login tiklar
           And kayit bolumundeki ayrintilari doldurur ve hesap olusturur
           Then ACCOUNT CREATED yazisinin gorunur oldugunu test eder ve Continue butonuna tiklar
           And en ustteki Logged in as username yazisinin gorunur oldugunu test eder
           And Cart butonuna tiklar
           And Proceed To Checkout butonuna tiklar
           And adres ayrintilarinin ve siparisin dogrulugunu test eder
           Then yorum metni alanına açıklama girer ve Place Order i tıklar
           And Name on Card Card Number CVC Expiration date gibi odeme ayrintilarini girer
           And Pay and Confirm Order butonunu tiklar
           And Your order has been placed successfully yazisinin gorunur oldugunu test eder
         #  And Delete Account butonunu tiklar

















