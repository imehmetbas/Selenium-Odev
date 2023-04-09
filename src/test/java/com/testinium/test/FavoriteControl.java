package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.page.SearchPage;
import org.openqa.selenium.By;
import java.util.ArrayList;
public class FavoriteControl extends BaseTest {

    public void FavControl(){

    Methods methods=new Methods();
    SearchPage searchPage =new SearchPage();
    ArrayList<String> liste =searchPage.Efav();
    methods.waitBySeconds(2);

    //Favorilerim sayfası açma
    methods.click(By.xpath(" //a[.='Listelerim']"));
    methods.waitBySeconds(1);

    methods.click(By.xpath(" //div[@class='menu top my-list']//a[.='Favorilerim']"));
    methods.waitBySeconds(1);

    //Favori attribute alma
    String favAttribute1 =methods.getAttribute(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[4]/div[1]/div[1]/div/a/img"),"alt");
    methods.waitBySeconds(1);

    String favAttribute2 =methods.getAttribute(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/a/img"),"alt");
    methods.waitBySeconds(1);

    String favAttribute3 =methods.getAttribute(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/a/img"),"alt");
    methods.waitBySeconds(1);

    String favAttribute4 =methods.getAttribute(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[4]/div[2]/div/div[1]/div[1]/div[1]/div/a/img"),"alt");
    methods.waitBySeconds(1);

    //Favori attribute listeye aktarma
    ArrayList<String> newList = new ArrayList<String>();
    newList.add(favAttribute1);
    newList.add(favAttribute2);
    newList.add(favAttribute3);
    newList.add(favAttribute4);

    //Favori attribute karşılaştırma
    assert newList.equals(liste);
    methods.waitBySeconds(2);
    }
}
