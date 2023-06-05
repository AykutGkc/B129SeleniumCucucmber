package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

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
}
