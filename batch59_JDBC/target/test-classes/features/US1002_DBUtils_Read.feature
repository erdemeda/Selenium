Feature: US1002 Kullanici DB Utils ile database baglantisi yapabilir


  @DBUtils
  Scenario: TC02 Kullanici DB Utils ile database'deki bilgileri okur

    Given kullanici DBUtils ile HMC veri tabanina baglanir
    And kullanici DBUtils ile "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici DBUtils ile "Price" sutunundaki verileri okur