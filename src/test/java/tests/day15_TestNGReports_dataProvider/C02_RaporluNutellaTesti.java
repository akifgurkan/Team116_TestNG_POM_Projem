package tests.day15_TestNGReports_dataProvider;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluNutellaTesti extends TestBaseRapor {












    @Test
    public void raporluTtest() {
        // amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nuella için arama yap
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin Nutella icerdigini test edin
        String expectedUrunIcerik = "Nutella";
        String actualUrunIcerik = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualUrunIcerik.contains(expectedUrunIcerik));

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
