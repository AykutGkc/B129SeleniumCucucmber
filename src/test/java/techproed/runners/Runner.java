package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner clasini testNG deki .xml file'larda belirttigimiz classlari,packagelari veya methodlari nasil calistiriyorsak,
Cucumber frameworkundede Runner class'indaki tags parametresi ile belirttigimiz senaryoyu calistirabiliriz.
 */


//Cucumber ile Junit'in entegre olmasini saglayan test calistirici notasyonudur.
@RunWith(Cucumber.class)
//Senaryolarin nerede ve nasil calisacagi, hangi raporu kullanacagi ile alakali secenekleri ayarlar.

@CucumberOptions(   plugin={"pretty","html:src/test/resources/features/htmlReport/cucumberHooks.html",
                                     "json:src/test/resources/features/htmlReport/cucumber.json",
                                    "junit:src/test/resources/features/htmlReport/cucumber.xml"}, //plugin parametresi ile pretty ifadesi kullanilirsa konsolda scenario'lar ile bilgi gösterir.
                    features ="src/test/resources/features",
                    glue= {"techproed/stepDefinitions"}, //bu parametre ile kodllarimizi yazdigimiz step definition
                                                        //class'inin package'ini belirleriz
                    tags = "@hooks",
                    dryRun = false, //dryRun=false TEst adimlarini kontrol eder ve browser'i calistirir.
                                    //dryRun=True  Test adimlarini sadecei kontrol eder
                                    //default olarak false'dur.
                    monochrome=false // pretty ifadesinden sonra monochrome=true kullanirsak senaryo adimlarini tek renk siyah olarak gösterir
                                    //monochrome=false kullanirsak renkli gösterir
                                    //default false gelir.
)
 /*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */


public class Runner {
}
