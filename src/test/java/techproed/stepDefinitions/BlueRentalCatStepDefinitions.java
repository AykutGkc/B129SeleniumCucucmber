package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentalCatStepDefinitions {
    BlueRentalPage blueRentalPage;
    @Then("Verilen_Kullanici_ile_login_olunur")
    public void verilen_kullanici_ile_login_olunur(DataTable data) {
        blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();
        ReusableMethods.waitWithThreadSleep(2);
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1), Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Sam Walker");
        Driver.getDriver().navigate().back(); //Logout islemi yerine navigateback ile cözdük
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB,data.row(2).get(1), Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        Assert.assertEquals(blueRentalPage.userDropDown.getText(),"Kate Brown");

    }

    @Then("Verilen_Kullanicilar_ile_login_olunur")
    public void verilen_kullanicilar_ile_login_olunur(DataTable data) {
        blueRentalPage=new BlueRentalPage();
        System.out.println(data.asMaps());//[{email=sam.walker@bluerentalcars.com, password=c!fas_art}, {email=kate.brown@bluerentalcars.com, password=tad1$Fas}]
                                          //Map'lerden olusanbir list olusturur.
                                          //Feature file daki olusturmus oldugumuz tobloyu map olarak listeler.
                                          //Basligi key olarak alir altindakileri verileri value olarak alir.
        for (Map<String,String> w : data.asMaps() ) {
            blueRentalPage.loginButton.click();
            blueRentalPage.emailBox.sendKeys(w.get("emailAdress"),Keys.TAB,w.get("password"), Keys.ENTER);
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.logOut.click();
            ReusableMethods.waitWithThreadSleep(2);
            blueRentalPage.OK.click();

        }
    }
}
