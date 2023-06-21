Feature: US001_ParalelTest
  @techpro3
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    And kullanici 5 saniye bekler
    Then cikan_reklam_kapatilir
    When kullanici 5 saniye bekler
    And searchBoxda_"python"_aratir
