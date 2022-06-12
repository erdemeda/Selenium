Feature:US1011 web tablosundaki istenen sutunu yazdirma


  @guru @pr2
Scenario: TC_16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And kullanici 3 sn bekler
    And "Company", sutunundaki tum degerleri yazdirir
    And sayfayi kapatir

