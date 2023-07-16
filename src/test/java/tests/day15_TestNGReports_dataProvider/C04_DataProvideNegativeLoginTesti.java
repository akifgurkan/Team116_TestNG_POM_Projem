package tests.day15_TestNGReports_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C04_DataProvideNegativeLoginTesti extends TestBaseRapor {

    @DataProvider
    public static Object[][] kullanicilistesi() {

        String[][] kullaniciIsimSifreleri   = {
                {"Sevda", "1234"}, {"Murat", "2345"}, {"Ilknur ", "4567"}

        };
        return kullaniciIsimSifreleri;
    }

    @Test(dataProvider = "kullanicilistesi")
    public void cokluNegativeLoginTesti(String kullaniciAdi, String password) {
        extentTest=extentReports.createTest("Data Provider","cokluNegativeLoginTesti");

        // Qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

// liste olarak verilen kullanici adi ve sifreleri ile

// giris yapilamadigini test edin


        // ilk login linkine basin

        //
// sayfayi kapatin// Qualitydemy anasayfaya gidin
//Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


// liste olarak verilen kullanici adi ve sifreleri ile
// giris yapilamadigini test edin

// ilk login linkine tiklayin

//// kullanici adi ve sifresini yazip giris yapmayi deneyin
//
//// giris yapilamadigini test edin
//
//// sayfayi kapatin
    }
}
