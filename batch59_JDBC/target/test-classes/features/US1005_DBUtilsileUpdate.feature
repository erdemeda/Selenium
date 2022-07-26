Feature: US1005 Kullanici database update yapar


  Scenario:TC05 Kullanici update yapabilmeli

    Given kullanici DBUtil ile HMC veri tabanina baglanir
    Then tHOTEL tablosunda IDHotel degeri 1017 olan kaydin Email bilgisini "bendenBuKadar@gmail.com" yapar
    # UPDATE tHOTEL SET Email = 'sizOldunuz@gmail.com' WHERE IDHotel=1016;