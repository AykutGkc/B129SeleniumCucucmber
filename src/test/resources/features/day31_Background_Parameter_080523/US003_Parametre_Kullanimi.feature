Feature: US003_TechproEducation_Testi

  Background: Kullanici TechproEducation Sayfasina Gider
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