Feature: Us001_Amazonda_Urun_Aratma
  Scenario: TC01_Amazonda_Urun_Aratma
    Given kullanici_amazon_sayfasina_gider
    And kullanici_verilen_urunleri_aratir
      |Urunler |
      |samsung |
      |Nokia   |
      |iphone  |
      |Motorola|
    And sayfayi_kapatir

    #DataTable: scenario'lardaki satir ve sütün icin bir veri toplasu temsil eder.
    #Bunun icin kullanilmak istenen her  stepten sonra yukaridaki örnekteki gibi bir tablo yapisi olustururuz.
    #Ve bu stepin methodunu stepDefinition'da olusturdugumuz zaman buradaki verileri alabilmemiz icin
    #olusturulan methoda DataTable parametresi eklenir. Bu parametre ismi ile bir list olusturulabilir.
    #Yada direk asList() methodu ile raw'lara ulasabiliriz.
    #Bu parametre import io.cucumber.datatable.DataTable; dan olmalı
    #opt+7=||
