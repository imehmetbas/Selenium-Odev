package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeTest  extends BaseTest {

    public void homeTest(){
        //Anasayfa yükleme ve logo kontrolü
        Methods methods=new Methods();
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));
    }
}
