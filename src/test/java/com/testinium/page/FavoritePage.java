package com.testinium.page;

import com.testinium.driver.BaseTest;
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
public class FavoritePage extends BaseTest {
    private static final Logger logger = LogManager.getLogger(FavoritePage.class);
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
    public void favoriteControl(){
        FavoriteControl favcontrol = new FavoriteControl();
        favcontrol.FavControl();
        logger.info("Favorilere eklenme kontrolü");
    }
}

