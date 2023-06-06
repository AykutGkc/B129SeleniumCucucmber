Feature: TC02_TecproEducation_testi_Hooks
  @hooks
Scenario: TC01_TecproEducation_testi
  Given kullanici_"techproed_Url"_sayfasina_gider
  Then cikan_reklam_kapatilir
  And kullanici 2 saniye bekler
  And searchBoxda_"developer"_aratir
  And sayfa_basliginin_"QA"_icerdigini_Test_Eder
  When kullanici_tum_sayfanin_resmini_alir
  And sayfayi_kapatir