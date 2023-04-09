package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.FavoriteControl;
import com.testinium.test.LogoutTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LogoutPage extends BaseTest {

    private static final Logger logger = LogManager.getLogger(LogoutPage.class);
    RoutingPage routingPage=new RoutingPage();
    RandomPage randomPage=new RandomPage();
    BuyProductPage buyProductPage=new BuyProductPage();

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

        randomPage.ErandomProduct();
        randomPage.FdeleteFavorite();
        buyProductPage.Ebasket();
        buyProductPage.Fincrease();
        buyProductPage.Gbuy();
        buyProductPage.Hadress();
        buyProductPage.KcardInfo();
        buyProductPage.LerrorMessage();

    }
    @Test
    public void logout(){
        LogoutTest logoutTest=new LogoutTest();
        logoutTest.logout();
        logger.info("Logout olma");
    }
}
