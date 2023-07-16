package tests.day13_testNGFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test {
    @org.testng.annotations.Test
    public void Test01 () throws InterruptedException {
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        // 2. Sign in butonuna basin
        ZeroPage zeroPage = new ZeroPage();
        zeroPage.signIn.click();

        // 3. Login kutusuna “username” yazin
        zeroPage.loginKutusu.sendKeys("username");

        // 4. Password kutusuna “password” yazin
        zeroPage.password.sendKeys("password");

        // 5. Sign in tusuna basin
        zeroPage.signIn2.click();
Thread.sleep(3000);

        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroPage.onlineBanking.click();
        zeroPage.payBills.click();

        // 7. “Purchase Foreign Currency” tusuna basin
        zeroPage.Purchase.click();

        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zeroPage.dropDownMenu);
        select.selectByVisibleText("Eurozone");

        // 9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();


        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        // (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        // (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        // (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
    }
}