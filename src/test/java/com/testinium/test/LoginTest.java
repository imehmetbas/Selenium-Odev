package com.testinium.test;
import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {
    Methods methods =new Methods();
    public void LoginTest(String username, String password){

        //Login olma işlemi
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);

        //LoginPage üzerinden geliyor username ve password
        methods.sendKeys(By.id("login-email"), username);
        methods.waitBySeconds(1);

        methods.sendKeys(By.id("login-password"), password );
        methods.waitBySeconds(1);

        //Giriş yap butonu tıklama
        methods.click(By.xpath("//button[@class='ky-btn ky-btn-orange w-100 ky-login-btn']"));
        methods.waitBySeconds(1);
    }
}
