package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.DeleteFavoriteTest;
import com.testinium.test.FavoriteControl;
import com.testinium.test.RandomProductTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandomPage extends BaseTest {
    private static final Logger logger = LogManager.getLogger(RandomPage.class);
    RandomProductTest randomProductTest=new RandomProductTest();
    RoutingPage routingPage=new RoutingPage();
    @Test
    public void ApreLogin(){
        LoginPage prelogin = new LoginPage();
        prelogin.ALoginPage();
    }
    @Test
    public void BpreSearch(){
        SearchPage presearch = new SearchPage();
        presearch.Bsearch();
        presearch.Cscroll();
        presearch.Dfav();
    }
    @Test
    public void CfavoriteControl(){
        FavoriteControl favcontrol = new FavoriteControl();
        favcontrol.FavControl();
    }
    @Test
    public void DpreRouting(){
        routingPage.DhomePage();
        routingPage.EpointsCatalog();
        routingPage.FturkishClassic();
        routingPage.GhighVoteSelect();
        routingPage.HallBooksSelect();
        routingPage.KhobbySelect();
    }
    @Test
    public void ErandomProduct(){
        randomProductTest.randomTest();
        logger.info("Random ürün bulma");
    }
    @Test
    public void FdeleteFavorite(){
        DeleteFavoriteTest deleteFavoriteTest=new DeleteFavoriteTest();
        deleteFavoriteTest.deleteFavorite();
        logger.info("Favoriler sayfasında 3.ürünü silme");
    }
}
