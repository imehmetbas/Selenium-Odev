package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginControl extends BaseTest {
    public void ValueTest(){
        Methods methods=new Methods();
        //Giriş yapıldı kontrolü
        WebElement result = methods.findElement(By.xpath("//h1[@class='section']"));
        assert result.getText().equals("Hesabım");
        methods.waitBySeconds(3);
    }
}
