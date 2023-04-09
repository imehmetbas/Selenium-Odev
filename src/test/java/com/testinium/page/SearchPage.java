package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import com.testinium.test.FavoriteTest;
import com.testinium.test.ScrollTest;
import com.testinium.test.SearchTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import java.util.ArrayList;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SearchPage extends BaseTest {
    private static final Logger logger = LogManager.getLogger(SearchPage.class);
    Methods methods=new Methods();
    @Test
    public void ApreLogin(){
        LoginPage prelogin = new LoginPage();
        prelogin.ALoginPage();
    }
    @Test
    public void Bsearch(){
        SearchTest searchTest =new SearchTest();
        searchTest.search();
        logger.info("Search alanı üzerinden arama yapma");
    }
    @Test
    public void Cscroll(){
        ScrollTest scrollTest =new ScrollTest();
        scrollTest.scroll();
        logger.info("Sayfada ki 7.ürüne scroll");
    }

    @Test
    public void Dfav(){
        FavoriteTest favoriteTest= new FavoriteTest();
        favoriteTest.favorite();
        methods.waitBySeconds(1);
        logger.info("Sayfada ki 4 ürünü favorileme");
    }
    public ArrayList<String> Efav(){
        FavoriteTest favoriteTest= new FavoriteTest();
        ArrayList<String> liste =favoriteTest.favlist();
        methods.waitBySeconds(1);
        logger.info("Favorilenen 4 ürünün attribute değerini alma");
        return liste;
    }
}
