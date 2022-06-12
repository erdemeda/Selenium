Feature: US1004 Kullanici parametre ile configuration file'i kullanabilmeli


  @config @pr2
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 2 sn bekler
    And url'in "techproeducation" icerdigini test eder
    Then sayfayi kapatir

