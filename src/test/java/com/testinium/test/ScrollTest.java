package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;


public class ScrollTest extends BaseTest {
    Methods methods =new Methods();
    public void scroll() {
        //Sayfada 7.ürüne gitme
        methods.scrollWithAction(By.xpath("//div[@id='product-table']/div[7]//div[@class='product-details']"));
        methods.waitBySeconds(2);
    }
}