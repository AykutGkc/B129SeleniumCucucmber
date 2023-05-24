Feature: US001_Google_Search
  Background: kullanici_Google_AnaSayfasina_gider
    Given kullanici_"https://www.google.de/"_sayfasina_gider
    Then kullanici_Cookiesleri_Kabul_eder

  Scenario Outline: Google_Aramalari
    * kullanici_Googleda "<aranacakKelime>" aratir
    * basligin "<aranacakKelime>" icerdigini dogrular
    * sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | Volvo          |
      | BMW            |
      | Mercedes       |
      | Audi           |
      | Ford           |