import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;
import static org.junit.Assert.assertTrue;



public class demowebshop extends BaseDriver {


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
    public void Test1() //_Register

    {
        WebElement register=driver.findElement(By.cssSelector(".ico-register"));
        register.click();
        MyFunc.Bekle(2);
        WebElement genderm= driver.findElement(By.id("gender-male"));
        genderm.click();
        WebElement firstName= driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Ali");
        WebElement lastName= driver.findElement(By.id("LastName"));
        lastName.sendKeys("Veli");
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");
        WebElement pasw= driver.findElement(By.name("Password"));
        pasw.sendKeys("Benim.45");
        WebElement paswd= driver.findElement(By.name("ConfirmPassword"));
        paswd.sendKeys("Benim.45");
        WebElement regButton=driver.findElement(By.id("register-button"));
        regButton.click();

        System.out.println("1.inci test başarıyla sonuçlandı.");

    }


  
    @Test

    public void Test2 () // Negatif register oluşturma

    {
        WebElement register = driver.findElement(By.cssSelector(".ico-register"));
        register.click();

        MyFunc.Bekle(1);

        WebElement genderMale = driver.findElement(By.id("gender-male"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Ali");

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Veli");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Benim.45");

        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
        confirmPassword.sendKeys("Benim.45");

        WebElement regButton = driver.findElement(By.id("register-button"));
        regButton.click();

        WebElement errorText = driver.findElement(By.xpath("//li[contains(text(), 'The specified email already exists')]"));

        Assert.assertEquals("The specified email already exists", errorText.getText());

        System.out.println(errorText.getText());
        System.out.println("2. test başarıyla sonuçlandı.");
    }


    @Test
    public void Test3 () //_Login

    {

        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");
        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("Benim.45");
        MyFunc.Bekle(1);

        WebElement loginButton=driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        System.out.println("3.üncü test başarıyla sonuçlandı.");

    }

  
        @Test
        public void Test4 () //_giftcards
        {

            Actions actions = new Actions(driver);

            Duration duration = Duration.ofSeconds(30);
            WebDriverWait wait = new WebDriverWait(driver, duration);

            WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
            actions.moveToElement(login).click().build().perform();
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
            alicinmaili .sendKeys("ali06@gmail.com");
            MyFunc.Bekle(1);

            WebElement SenderName = driver.findElement(By.xpath("//*[@id='giftcard_1_SenderName']"));
            SenderName .sendKeys("Ali");
            MyFunc.Bekle(1);

            WebElement SenderEmail = driver.findElement(By.xpath("//*[@id='giftcard_1_SenderEmail']"));
            SenderEmail .sendKeys("ali06@gmail.com");
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

            MyFunc.Bekle(1);

            WebElement chxbox = driver.findElement(By.xpath("//*[@id='termsofservice']"));
            actions.moveToElement(chxbox).click().build().perform();

            WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
            actions.moveToElement(checkout).click().build().perform();


            WebElement email=driver.findElement(By.id("Email"));
            email.sendKeys("ali06@gmail.com");
            WebElement Password=driver.findElement(By.id("Password"));
            Password.sendKeys("Benim.45");
            MyFunc.Bekle(1);

            WebElement loginButton=driver.findElement(By.cssSelector("input.login-button"));
            loginButton.click();

            // Billing Address

            WebElement agree = driver.findElement(By.id("termsofservice"));
            Action action = actions.moveToElement(agree).click().build();
            action.perform();

            WebElement checkoutButton = driver.findElement(By.id("checkout"));
            action = actions.moveToElement(checkoutButton).click().build();
            action.perform();


            WebElement newAddressMenu = driver.findElement(By.id("billing-address-select"));
            Select newAdresSelectMenu = new Select(newAddressMenu);
            newAdresSelectMenu.selectByVisibleText("New Address");

            WebElement countryMenu = driver.findElement(By.name("BillingNewAddress.CountryId"));
            Select countrySelectMenu = new Select(countryMenu);
            countrySelectMenu.selectByValue("77");

            MyFunc.Bekle(1);

            WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
            action = actions.moveToElement(city).click().sendKeys("Izmir").build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
            action = actions.moveToElement(address1).click().sendKeys("Izmir").build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement zipCode = driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
            action = actions.moveToElement(zipCode).click().sendKeys("10001").build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
            action = actions.moveToElement(phoneNumber).click().sendKeys("1234567890").build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement continueButtonBillingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title='Continue'])[1]")));
            action = actions.moveToElement(continueButtonBillingAddress).click().build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement continueButtonShippingAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
            action = actions.moveToElement(continueButtonShippingAddress).click().build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement continueButtonShippingMethod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ShippingMethod.save()']")));
            action = actions.moveToElement(continueButtonShippingMethod).click().build();
            action.perform();

            MyFunc.Bekle(1);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            WebElement continueButtonPaymentMethod =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentMethod.save()']")));
            js.executeScript("arguments[0].click();", continueButtonPaymentMethod);

            MyFunc.Bekle(1);

            WebElement continueButtonPaymentInformation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']")));
            action = actions.moveToElement(continueButtonPaymentInformation).click().build();
            action.perform();

            MyFunc.Bekle(1);

            WebElement confirmOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']")));
            action = actions.moveToElement(confirmOrderButton).click().build();
            action.perform();

            MyFunc.Bekle(1);
            
            WebElement lastConfirmation = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));

            Assert.assertEquals("Your order has been successfully processed!", lastConfirmation.getText());

            System.out.println(lastConfirmation.getText());

            System.out.println("4.üncü test başarıyla sonuçlandı.");

    }

  
    @Test
    public void Test5() //_Aygül Hanımın kodu eklenecektir

    {

        System.out.println("5.inci test başarıyla sonuçlandı.");

    }

    @Test
    public void Test6 () //orderhistorytest

    {
        //login
        WebElement login= driver.findElement(By.xpath("//*[@href='/login']"));
        login.click();
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");
        WebElement pass= driver.findElement(By.id("Password"));
        pass.sendKeys("Benim.45");

        WebElement loginButton=driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        //profil sayfasi ve ardindan siparislere gecis
        WebElement profil=driver.findElement(By.xpath("//*[@href='/customer/info']"));
        profil.click();
        MyFunc.Bekle(1);
        WebElement orders=driver.findElement(By.xpath("//*[@href='/customer/orders']"));
        orders.click();
        MyFunc.Bekle(1);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, 500)"  );

        //siparis detayina giris ve fatura yukleme
        MyFunc.Bekle(1);
        WebElement firstOrderDetail=driver.findElement(By.cssSelector("input[value='Details']"));
        firstOrderDetail.click();

        MyFunc.Bekle(2);

        WebElement download=driver.findElement(By.linkText("PDF Invoice"));
        download.click();

        MyFunc.Bekle(1);

        // İndirilen PDF'nin dosya adı
        String pdfFileName = "order_1501629.pdf";

        // İndirilen PDF dosyasının tam yolu
       String downloadPath = "C:\\Users\\Admin\\Downloads";
        String pdfFilePath = downloadPath + "\\" + pdfFileName;

        // PDF dosyasının varlığını kontrol et

        File pdfFile = new File(pdfFilePath);
        if (pdfFile.exists()) {
            System.out.println("PDF dosyası başarıyla indirildi.");
        } else {
            System.out.println("PDF dosyası indirilemedi veya bulunamadı.");

        }
        Assert.assertTrue(pdfFile.exists());
        System.out.println("6.ıncı test başarıyla sonuçlandı.");
      
    }


    @Test

    public void Test7 () //_ COMMUNITY POLL

    {

        WebElement login= driver.findElement(By.xpath("//*[@href='/login']"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");

        WebElement pass= driver.findElement(By.id("Password"));
        pass.sendKeys("Benim.45");

        WebElement loginButton = driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        // Oylama adımları
        WebElement sec = wait.until(ExpectedConditions.elementToBeClickable(By.id("pollanswers-1")));
        sec.click();

        WebElement tik = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='vote-poll-1']")));
        tik.click();

        // Sonuç kontrolü
        WebElement sonuc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='poll-block-1']/span")));
        Assert.assertTrue("Oylama sonucu görüntülenmedi", sonuc.isDisplayed());

        WebElement logoutButton=driver.findElement(By.cssSelector(".ico-logout"));
        logoutButton.click();

        System.out.println("7.inci test başarıyla sonuçlandı.");

    }
  
    @Test

    public void Test8 () //_Logout

    {
        WebElement login=driver.findElement(By.cssSelector("[class='ico-login']"));
        login.click();
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");
        WebElement Password=driver.findElement(By.id("Password"));
        Password.sendKeys("Benim.45");
        MyFunc.Bekle(1);

        WebElement loginButton=driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        WebElement logoutButton=driver.findElement(By.cssSelector(".ico-logout"));
        logoutButton.click();

        System.out.println("8.inci test başarıyla sonuçlandı.");

    }

}
