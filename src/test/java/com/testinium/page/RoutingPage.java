package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.FavoriteControl;
import com.testinium.test.RoutingTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoutingPage extends BaseTest {
    private static final Logger logger = LogManager.getLogger(RandomPage.class);
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
    RoutingTest routingTest=new RoutingTest();
    @Test
    public void DhomePage(){
        routingTest.homePage();
        logger.info("Anasayfaya gitme");
    }
    @Test
    public void EpointsCatalog(){
        routingTest.pointsCatalog();
        logger.info("Puan kataloğuna gitme");
    }
    @Test
    public void FturkishClassic(){
        routingTest.turkishClassic();
        logger.info("Türk klasikleri sayfasına gitme");
    }
    @Test
    public void GhighVoteSelect(){
        routingTest.highVoteSelect();
        logger.info("Yüksek oylama seçimi");
    }
    @Test
    public void HallBooksSelect(){
        routingTest.allBooksSelect();
        logger.info("Tüm Kitaplar seçimi");
    }
    @Test
    public void KhobbySelect(){
        routingTest.hobbySelect();
        logger.info("Hobi kategorisine gitme");
    }
}
