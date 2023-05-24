Feature: US001_Amazon_Sayfasinda_Ürün_Aratma
  #Classlarimizda kullandigimiz @Before gibi her senaryodan önce Background yapisi calisir.
  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider
  #Feature file da birden fazla ürün aratmak icin her ürün icin yeni bir method olusturmak gerekir.
  #Dolayisiyla stepDefinition clasinda cok fazla method olusturmus oluruz.
  #Tek bir parametreli method olusturup bunun üstesinden gelebiliriz.
  #Bunun icin featue file da aratmak istedigim metni tirnak("") icinde yazarsak stepDefinition clasinda bize parametreli method olusturur.
  #Böylece bu methodu kullanarak istedigimiz kadar metin aratabiliriz.
  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
    Then arama_kutusunda_"Selenium"_aratir
    And kullanici 3 saniye bekler

  Scenario: TC02_Amazon_Sayfasinda_Github_Aratma
    Then arama_kutusunda_"Github"_aratir
    Then kullanici 2 saniye bekler

  Scenario: TC03_Amazon_Sayfasinda_Samsung_Aratma
    Then arama_kutusunda_"Samsung"_aratir
    Then kullanici 2 saniye bekler

  Scenario: TC04_Amazon_Sayfasinda_Nokia_Aratma
    Then arama_kutusunda_"Nokia"_aratir
    And kullanici 2 saniye bekler
    And sayfayi_kapatir
