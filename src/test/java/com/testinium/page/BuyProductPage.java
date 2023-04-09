package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.BuyProductTest;
import com.testinium.test.FavoriteControl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;


@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BuyProductPage extends BaseTest {

    private static final Logger logger = LogManager.getLogger(BuyProductPage.class);
    RoutingPage routingPage=new RoutingPage();
    RandomPage randomPage=new RandomPage();
    BuyProductTest buyProductTest =new BuyProductTest();

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
    }
    @Test
    public void Ebasket() {
        buyProductTest.basket();
        logger.info("Sepete gitme");
    }
    @Test
    public void Fincrease(){
        buyProductTest.increase();
        logger.info("Sepetteki ürün adedini arttırma");
    }
    @Test
    public void Gbuy(){
       buyProductTest.buy();
        logger.info("Satın al butonuna tıklama");
    }
    @Test
    public void Hadress(){
        buyProductTest.adress();
        logger.info("Adres bilgileri girişi");
    }
    @Test
    public void KcardInfo(){
        buyProductTest.cardInfo();
        logger.info("Geçersiz kart bilgileri girişi");
    }
    @Test
    public void LerrorMessage(){
        buyProductTest.errorMessage();
        logger.info("Hata mesajı kontrolü");
    }
}
