package java.techproed.tests.US001;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.techproed.pages.Page;
import java.techproed.utilities.ConfigReader;
import java.techproed.utilities.Driver;

public class TC01_AramaKutusuTesti {

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
         //Amazon sayafasına gidildi

    }
}
