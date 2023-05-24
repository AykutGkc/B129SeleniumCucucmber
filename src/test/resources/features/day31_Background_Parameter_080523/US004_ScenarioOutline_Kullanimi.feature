Feature: Google_Search
  Background: kullanici_Google_AnaSayfasina_gider
    Given kullanici_"googleUrl"_sayfasina_gider
    Then kullanici_Cookiesleri_Kabul_eder
    #ScenarioOutlline TestNG deki DataProvider mantigi ile calisit.Scenario:
    # Birden fazla veriyi tek seferde feature filedan kullanmamiza yardimci olur.
   Scenario Outline: Google_Aramalari
     * kullanici_Googleda "<aranacakKelime>" aratacaktir
     * basligin "<aranacakKelime>" icerdigini dogrulayacaktir
     * sayfayi_kapatir
     Examples:
       | aranacakKelime |
       | arac1          |
       | arac2          |
       | arac3          |
       | arac4          |
       | arac5          |