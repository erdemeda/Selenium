

@autex
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







