Feature: US002_BlueRantalCar_Login_islemi
  Scenario: TC01_BlueRentalCar_positive_test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_Kullanici_ile_login_olunur
    |email                        |password |
    |sam.walker@bluerentalcars.com|c!fas_art|
    |kate.brown@bluerentalcars.com|tad1$Fas |
    And sayfayi_kapatir