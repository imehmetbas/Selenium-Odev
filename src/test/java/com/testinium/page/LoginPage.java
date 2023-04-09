package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.test.LoginControl;
import com.testinium.test.LoginTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;


@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginPage extends BaseTest{
    private static final Logger logger = LogManager.getLogger(LoginPage.class);
    @Test
    public void ALoginPage() {
       String username = "imehmetbas@hotmail.com";
       String password = "12345678";
       LoginTest loginTest = new LoginTest();
       loginTest.LoginTest(username, password);
       logger.info("Login test sayfasına username ve password göndererek login olma");
}
    @Test
    public void BLoginControl(){
        LoginControl loginControl=new LoginControl();
        loginControl.ValueTest();
        logger.info("Login kontrol");
    }

}

