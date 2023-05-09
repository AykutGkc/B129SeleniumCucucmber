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

@CucumberOptions(features ="src/test/resources/features/day30_ilkFeature_070523",
                    glue= {"techproed/stepDefinitions"}, //bu parametre ile kodllarimizi yazdigimiz step definition
                                                        //class'inin package'ini belirleriz
                    tags = "@gr3 or @gr1")
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */


public class Runner {
}
