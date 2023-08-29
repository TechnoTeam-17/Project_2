package util;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.BaseDriver;
import util.MyFunc;

import static org.junit.Assert.assertTrue;


public class GiftCard extends BaseDriver {


        @Before
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com");
            driver.manage().window().maximize();
        }

        @After
        public void teardown() {
            BekleVeKapat();
        }
    @Test
    public void Test2() //_Login

    {

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("Ali06@gmail.com");
        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("Benim.45");
        MyFunc.Bekle(1);

        WebElement loginButton=driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        System.out.println("2.inci test başarıyla sonuçlandı.");

        MyFunc.Bekle(1);

    }
    @Test
    public void Test3() //_giftcards

    {

        WebElement Computer = driver.findElement(By.xpath("//a[@href='/computers']"));
        Computer.click();
        MyFunc.Bekle(1);

        WebElement Desktops = driver.findElement(By.cssSelector("li.active a[href='/desktops']"));
        Desktops.click();
        MyFunc.Bekle(1);

        WebElement cheapComputer = driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"));
        cheapComputer.click();
        MyFunc.Bekle(1);

        WebElement sepeteEkle = driver.findElement(By.xpath("//input[@value='Add to cart']"));
        sepeteEkle.click();
        MyFunc.Bekle(1);

        WebElement giftCardSec = driver.findElement(By.xpath("//a[@href='/gift-cards']"));
        giftCardSec.click();
        MyFunc.Bekle(1);

        WebElement addtoCardButton1 = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
        addtoCardButton1.click();
        MyFunc.Bekle(1);

        WebElement alicinIsmi = driver.findElement(By.xpath("//*[@id='giftcard_1_RecipientName']"));
        alicinIsmi .sendKeys("Ali");
        MyFunc.Bekle(1);

        WebElement alicinmaili = driver.findElement(By.xpath("//*[@id='giftcard_1_RecipientEmail']"));
        alicinmaili .sendKeys("Ali06@gmail.com");
        MyFunc.Bekle(1);

        WebElement SenderName = driver.findElement(By.xpath("//*[@id='giftcard_1_SenderName']"));
        SenderName .sendKeys("Ali");
        MyFunc.Bekle(1);

        WebElement SenderEmail = driver.findElement(By.xpath("//*[@id='giftcard_1_SenderEmail']"));
        SenderEmail .sendKeys("Ali06@gmail.com");
        MyFunc.Bekle(1);

        WebElement addtoCardButton2 = driver.findElement(By.xpath("//*[@id='add-to-cart-button-1']"));
        addtoCardButton2 .click();
        MyFunc.Bekle(1);

        WebElement notificationn = driver.findElement(By.xpath("//*[@id='bar-notification']/p"));
        String actualMessage = notificationn.getText();
        String expectedMessage = "The product has been added to your";
        assertTrue("Aranılan mesaj bulunamadı", actualMessage.contains(expectedMessage));
        System.out.println("Çıkan mesajı " + actualMessage + " istenilen gibidir");


        WebElement addtoCardButton = driver.findElement(By.xpath("//*[@id='add-to-cart-button-1']"));
        addtoCardButton .click();
        MyFunc.Bekle(1);

        WebElement cartlink = driver.findElement(By.xpath("//*[@id='topcartlink']/a/span[1]"));
        cartlink .click();
        MyFunc.Bekle(1);

        WebElement ApplyCoupon = driver.findElement(By.xpath("//input[@name='applydiscountcouponcode']"));
        ApplyCoupon .click();
        MyFunc.Bekle(1);

        WebElement notification1 = driver.findElement(By.cssSelector(".message"));
        MyFunc.Bekle(1);
        String actualMessage1 = notification1.getText();
        String expectedMessage1 = "The coupon code you entered couldn't be applied to your order";
        assertTrue("Aranılan mesaj bulunamadı", actualMessage1.contains(expectedMessage1));

        System.out.println("Çıkan mesajı " + actualMessage1 + " istenilen gibidir");

        WebElement GiftCardBt = driver.findElement(By.xpath("//input[@class='button-2 apply-gift-card-coupon-code-button']"));
        GiftCardBt .click();
        MyFunc.Bekle(1);

        WebElement notification2 = driver.findElement(By.cssSelector(".message"));
        MyFunc.Bekle(1);

        String actualMessage2 = notification2.getText();
        String expectedMessage2 = "The coupon code you entered couldn't be applied to your order";
        assertTrue("Aranılan mesaj bulunamadı", actualMessage2.contains(expectedMessage2));

        System.out.println("Çıkan mesajı " + actualMessage2 + " istenilen gibidir");

        System.out.println("3.üncü test başarıyla sonuçlandı.");


    }



}
