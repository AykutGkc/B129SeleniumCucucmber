Feature: US001_ParalelTest
  @techpro1
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_"techproed_Url"_sayfasina_gider
    And kullanici 5 saniye bekler
    Then cikan_reklam_kapatilir
    When kullanici 5 saniye bekler
    And searchBoxda_"QA"_aratir


    @techpro2
    Scenario: TC02_TechProEducation_Sayfasi_Testi
      Given kullanici_"techproed_Url"_sayfasina_gider
      And kullanici 5 saniye bekler
      Then cikan_reklam_kapatilir
      When kullanici 5 saniye bekler
      And searchBoxda_"developer"_aratir

