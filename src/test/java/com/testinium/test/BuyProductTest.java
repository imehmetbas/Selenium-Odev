package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuyProductTest extends BaseTest {
    Methods methods =new Methods();

    public void basket() {
        //Sepete ekleme
        methods.click(By.xpath("//div[@id='cart']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(2);
    }
    public void increase(){
        //Sepette ürün adedi arttırımı
        WebElement input = methods.findElement(By.xpath("//input[@name='quantity']"));
        input.clear();
        methods.waitBySeconds(1);
        input.sendKeys("2");
        methods.click(By.xpath(" //i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(2);
    }
    public void buy(){
        //Satın al butonuna tıklama
        methods.click(By.xpath("//div[@class='right']/a[contains(.,'Satın Al')]"));
        methods.waitBySeconds(2);

    }
    public void adress(){
        //Adres bilgileri giriş sayfası
        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBySeconds(2);

        //Ad girişi
        WebElement ad = methods.findElement(By.xpath(" //input[@id='address-firstname-companyname']"));
        ad.sendKeys("Mehmet");

        //Soyad girişi
        WebElement soyad = methods.findElement(By.xpath(" //input[@id='address-lastname-title']"));
        soyad.sendKeys("Baş");

        //Ülke seçim
        methods.selectByText(By.xpath("//select[@id='address-country-id']"), "Türkiye");
        methods.waitBySeconds(2);

        //Şehir seçim
        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(4);

        //İlçe seçim
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "SANCAKTEPE");
        methods.waitBySeconds(2);

        //Mahalle girişi
        WebElement mahalle= methods.findElement(By.xpath("//input[@id='district']"));
        mahalle.sendKeys("OSMANGAZİ MAH");

        //Açık adres girişi
        WebElement adres = methods.findElement(By.xpath("//textarea[@id='address-address-text']"));
        adres.sendKeys("Testinium sok. no:7");

        //Posta kodu girişi
        WebElement postakodu = methods.findElement(By.xpath("//input[@id='address-postcode']"));
        postakodu.sendKeys("00034");

        //Cep telefonu girişi
        WebElement ceptel = methods.findElement(By.xpath("//input[@id='address-mobile-telephone']"));
        ceptel.sendKeys("5432049550");

        //Sabit tel girişi
        WebElement sabittel = methods.findElement(By.xpath("//input[@id='address-telephone']"));
        sabittel.sendKeys("2122121209");

        //şirket checkbox seçim
        methods.click(By.xpath("//input[@value='2']"));
        methods.waitBySeconds(2);

        //vergi dairesi girişi
        WebElement vno = methods.findElement(By.xpath("//input[@name='company_id']"));
        vno.sendKeys("Sancaktepe");

        //Vergi no girişi
        WebElement tcno = methods.findElement(By.xpath("//input[@id='address-tax-id']"));
        tcno.sendKeys("6540395395");

        //Devam butonu tıklama
        methods.click(By.xpath("  //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);

        //Devam butonu tıklama
        methods.click(By.xpath("  //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
    }
    public void cardInfo(){
        //Kart bilgileri giriş sayfası
        methods.waitBySeconds(2);

        //Kart sahibi adı girişi
        WebElement kartsahibi = methods.findElement(By.xpath("//input[@id='credit-card-owner']"));
        kartsahibi.sendKeys("Mehmet Baş");
        methods.waitBySeconds(2);

        //Kart no giriş
        WebElement bosluk1 = methods.findElement(By.xpath("//table[@class='form']//tr[5]//input[1]"));
        bosluk1.sendKeys("1111");
        methods.waitBySeconds(2);

        //Kart no giriş
        WebElement bosluk2 = methods.findElement(By.xpath("//input[2]"));
        bosluk2.sendKeys("1111");
        methods.waitBySeconds(2);

        //Kart no giriş
        WebElement bosluk3 = methods.findElement(By.xpath("//input[3]"));
        bosluk3.sendKeys("1111");
        methods.waitBySeconds(2);

        //Kart no giriş
        WebElement bosluk4 = methods.findElement(By.xpath("//input[4]"));
        bosluk4.sendKeys("1111");
        methods.waitBySeconds(2);

        //Ay seçimi
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "05");
        methods.waitBySeconds(2);

        //Yıl seçimi
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2023");
        methods.waitBySeconds(2);

        //Güvenlik kodu girişi
        WebElement cvvkod = methods.findElement(By.xpath("//input[@id='credit-card-security-code']"));
        cvvkod.sendKeys("789");

        //Devam butonu tıklama
        methods.click(By.xpath(" //button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);

    }
    public void errorMessage() {
        //Kart numara geçersiz kontrolü
        WebElement gecersiz = methods.findElement(By.xpath(" //span[@class='error']"));
        assert gecersiz.getText().equals("Kart numarası geçersiz. Kontrol ediniz!");
    }
}
