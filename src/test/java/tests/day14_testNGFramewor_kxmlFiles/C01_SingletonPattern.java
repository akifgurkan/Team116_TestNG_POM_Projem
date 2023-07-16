package tests.day14_testNGFramewor_kxmlFiles;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_SingletonPattern {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");


    }
}