Feature: BlueRentalCar_Excel_Login
  Scenario: TC01_Positive_Login_testi
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    And kullanici_Exceldeki_"customer_info"_sayfasindaki_kullanici_bilgileri_ile_login_olur

   Scenario: RC02_Positive_Login_test
     Given kullanici_"blueRentACarUrl"_sayfasina_gider
     And kullanici_Exceldeki_"admin_info"_sayfasindaki_kullanici_bilgileri_ile_login_olur