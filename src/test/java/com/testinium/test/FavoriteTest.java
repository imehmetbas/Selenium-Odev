package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import java.util.ArrayList;

public class FavoriteTest extends BaseTest {
    Methods methods =new Methods();

    public void favorite() {

        //Sayfadan 4 ürün favorilere ekleme işlemi
        methods.click(By.xpath("//div[@id='product-table']/div[3]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@id='product-table']/div[4]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@id='product-table']/div[5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(3);
    }

    public ArrayList<String> favlist() {

        //Favori attribute alma
        String attribute1 = methods.getAttribute(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[3]/div[1]/div[1]/div/a/img"), "alt");
        methods.waitBySeconds(1);

        String attribute2 = methods.getAttribute(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[4]/div[1]/div[1]/div/a/img"), "alt");
        methods.waitBySeconds(1);

        String attribute3 = methods.getAttribute(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[5]/div[1]/div[1]/div/a/img"), "alt");
        methods.waitBySeconds(1);

        String attribute4 = methods.getAttribute(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[6]/div[1]/div[1]/div/a/img"), "alt");
        methods.waitBySeconds(1);

        //Favori attribute listeye aktarma
        ArrayList<String> list = new ArrayList<String>();
        list.add(attribute1);
        list.add(attribute2);
        list.add(attribute3);
        list.add(attribute4);
        return list;

    }
}