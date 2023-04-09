package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class DeleteFavoriteTest extends BaseTest {
    Methods methods=new Methods();
    public void deleteFavorite(){
        //Favorilerim sayfası açılış
        methods.click(By.xpath(" //a[.='Listelerim']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath(" //div[@class='menu top my-list']//a[.='Favorilerim']"));
        methods.waitBySeconds(2);

        // 3.favori silme
        methods.click(By.xpath("//div[@class='product-list']/div[3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(2);
    }
}
