package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage;
    @Given("kullanici_Googleda {string} aratir")
    public void kullanici_googleda_aratir(String string) {
        googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(string, Keys.ENTER);

    }
    @Given("basligin {string} icerdigini dogrular")
    public void basligin_icerdigini_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("kullanici_Cookiesleri_Kabul_eder")
    public void kullanici_cookiesleri_kabul_eder() {
        googlePage=new GooglePage();
        googlePage.cookiesKabulEt.click();
    }
    @Then("kullanici_Googleda {string} aratacaktir")
    public void kullanici_googleda_aratacaktir(String string) {
        googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(string), Keys.ENTER);
    }
    @Then("basligin {string} icerdigini dogrulayacaktir")
    public void basligin_icerdigini_dogrulayacaktir(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(string)));

    }
}
