Feature: US001_Amazon_Sayfasinda_Ürün_Aratma
  #Classlarimizda kullandigimiz @Before gibi her senaryodan önce Background yapisi calisir.
  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
    Then arama_kutusunda_Selenium_aratir

  Scenario: TC02_Amazon_Sayfasinda_Java_Aratma
    Then arama_kutusunda_java_aratir

  Scenario: TC03_Amazon_Sayfasinda_Sql_Aratma
    And arama_kutusunda_sql_aratir
    And sayfayi_kapatir
