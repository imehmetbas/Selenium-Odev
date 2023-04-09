package com.testinium.driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); //.exe olmalı for windows
            ChromeOptions chromeoptions = new ChromeOptions();
            chromeoptions.addArguments("disable translate");
            chromeoptions.addArguments("disable popup blocking");
            chromeoptions.addArguments("--disable notifications");

            driver = new ChromeDriver();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome 11");
            caps.setCapability("os", "Windows");
            chromeoptions.merge(caps);

            driver.manage().window().maximize();
            driver.get("https://www.kitapyurdu.com/");
        }

    @AfterClass
    public static void tearDown(){
        if (driver != null)
        {
            driver.close();
            driver.quit();
        }
    }
}