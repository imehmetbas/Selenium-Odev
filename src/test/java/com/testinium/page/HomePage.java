package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.HomeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class HomePage extends BaseTest {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);
    @Test
    public void home(){
        HomeTest homePage =new HomeTest();
        homePage.homeTest();
        logger.info("Anasayfa açılış testi");
    }
}
