Feature: US001_BlueRantalCar_Login_islemi_Map
  Scenario: TC01_BlueRentalCar_positive_test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_Kullanicilar_ile_login_olunur
      |emailAdress                  |password |
      |sam.walker@bluerentalcars.com|c!fas_art|
      |kate.brown@bluerentalcars.com|tad1$Fas |
    And sayfayi_kapatir