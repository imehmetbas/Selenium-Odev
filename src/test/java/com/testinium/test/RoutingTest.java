package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class RoutingTest extends BaseTest {
    Methods methods=new Methods();

    public void homePage(){
        //Anasayfa açılış
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[2]/a/img"));
        methods.waitBySeconds(2);
    }
    public void pointsCatalog(){
        //Puan katalog açılış
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(2);
    }
    public void turkishClassic(){
        //Türk klasikleri sayfası açılış
        methods.click(By.xpath("/html/body/div[5]/div/div/div[2]/div/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
    }
    public void highVoteSelect(){
        //Yüksek oylama seçimi
        methods.selectByText(By.xpath("/html/body/div[5]/div/div[3]/div/div/div[1]/div/div[1]/select"), "Yüksek Oylama");
        methods.waitBySeconds(3);
    }
    public void allBooksSelect(){
        //Tüm kitaplar sekmesi seçimi
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(2);
    }
    public void hobbySelect(){
        //Açılan menüden hobi sekmesi seçimi
        methods.click(By.xpath(" //a[.='Hobi']"));
        methods.waitBySeconds(2);
    }
}
