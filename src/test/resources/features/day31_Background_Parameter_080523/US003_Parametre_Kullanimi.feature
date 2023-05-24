Feature: US003_TechproEducation_Testi

  Background: Kullanici TechproEducation Sayfasina Gider
    #https://www.techproeducation.com/ yerine .properties dosyasindaki key de kullanilabilir
    #eger .properties dosyasindaki key'i kullanmak istersek,stepDefinotion class'imizda parametre
    #istenen yere ConfigReader.getProperty(Key) methodu ile giris yapmaliyiz.
    Given kullanici_"https://www.techproeducation.com/"_sayfasina_gider

  Scenario: TC01_TechProEducation_Sayfasi_Teszi
    Then cikan_reklam_kapatilir
    When kullanici 2 saniye bekler
    And kullanici_tum_sayfanin_resmini_alir
    And arama_kutusunda_QA_aratir
    Then kullanici 2 saniye bekler
    And sayfa_basliginin_QA_icerdigini_Test_Eder
    And kullanici_tum_sayfanin_resmini_alir
    And sayfayi_kapatir

    Scenario: TC02_TecproEducation_testi
      Then cikan_reklam_kapatilir
      And kullanici 2 saniye bekler
      And searchBoxda_"developer"_aratir
      And sayfa_basliginin_"developer"_icerdigini_Test_Eder
      When kullanici_tum_sayfanin_resmini_alir
      And sayfayi_kapatir
