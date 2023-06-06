package techproed.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;


public class Hooks {
    /*
        Scenario'lar arasındaki bağlantıyı sağlayan glue parametresine koyduğumuz stepDefinition package'ı içerisinde
    @Before ve @After gibi bir notasyon varsa extend yapmamıza gerek kalmadan her scenariodan önce veya sonra bu
    methodlar çalışacaktır.
        Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu Hooks class'ına koyarız.
        İstersek yeni bir package oluşturup bunun içinede Hooks class'ını koyabiliriz. Eğer yeni bir package içerisine
    koyarsak Runner class'ındaki glue parametresine bu package'ı da eklememiz gerekir
        Kullandığımız @Before @After notasyonları Junit'ten değil Cucumberdan olmalıdır
     */

    @Before //import io.cucumber.java.Before
    public void setUp1()  {
        System.out.println("Testler calismaya basladi");
    }
    @Before("@gr1")
    public void setUp2()  {
        System.out.println("Amazonda sql aratildi");
    }
    @Before("@gr2")
    public void setUp3()  {
        System.out.println("Amazonda Java aratildi");
    }
    @Before("@gr3")
    public void setUp4()  {
        System.out.println("Amazonda Selenium aratildi");
    }

    @Before("@excel")
    public void setUp5() throws FileNotFoundException {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        ExcelUtils excelUtils=new ExcelUtils("src/test/resources/mysmoketestdata (1).xlsx","customer_info");
        for (int i = 1; i <=excelUtils.rowCount() ; i++) {
            String email= excelUtils.getCellData(i,0);
            String password=excelUtils.getCellData(i,1);
            blueRentalPage.loginButton.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.emailBox.sendKeys(email, Keys.TAB,password,Keys.ENTER);
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.profile.click();
            ReusableMethods.waitWithThreadSleep(2);
            Assert.assertEquals(blueRentalPage.verifyEmail.getText(),email);
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.logOut.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.OK.click();
            ReusableMethods.waitWithThreadSleep(2);
        }
    }

    @After   //import io.cucumber.java.Before
    public void tearDown(Scenario scenario) throws Exception { //bu methoda scenerio classindan bir parametre atamsi yapilir.
        //Bu method'ta fail olan senaryolarimizin resmini almak icin kullaniriz.
        if (scenario.isFailed()){
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","screenShot_"+scenario.getName());
        }
        Driver.closeDriver();
    }
}
