package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogoutTest extends BaseTest {
    Methods methods=new Methods();
    public void logout(){
        //Anasayfa açılış
        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(2);

        //Çıkış yap butonu tıklama
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).build().perform();
        methods.waitBySeconds(2);

        WebElement option = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        option.click();
        methods.waitBySeconds(2);




    }
}

