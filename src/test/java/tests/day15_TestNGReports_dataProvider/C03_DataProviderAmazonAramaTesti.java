package tests.day15_TestNGReports_dataProvider;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderAmazonAramaTesti {

    @DataProvider
    public static Object[][] AranacakUrunListesi() {
        String[][] urunlist={
                {"Nutella"}, {"Java"}, {"Selenium"}, {"Apple"}, {"Samsung"}
        };

        return urunlist;
    }

    @Test(dataProvider = "AranacakUrunListesi")
    public void cokluAramatest(String aranacakUrun) {
        // amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // verilen her bir ürün için ayrı ayrı arama yap, sonuçların o ürünü içerdiğini test edin.
        // Nutella, Cokokrem, Java, Selenium, Apple, Samsung

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(aranacakUrun+ Keys.ENTER);

        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains(aranacakUrun));

        Driver.closeDriver();


    }
}
