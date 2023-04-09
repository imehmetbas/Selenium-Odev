package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class RandomProductTest extends BaseTest {
    Methods methods =new Methods();
    public void randomTest() {
        //Random ürün seçimi
        methods.randomElement(By.xpath("/html/body/div[5]/div/div[3]/div/div[1]/div/div[2]/ul/li"));
        methods.waitBySeconds(2);

        //Sepete ekleme işlemi
        methods.click(By.xpath("//span[.='Sepete Ekle']"));
        methods.waitBySeconds(2);
    }
}
