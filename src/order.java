import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import util.BaseDriver;
import util.MyFunc;

import java.util.List;

public class order<Select> extends BaseDriver {
    @Test
    public void Test(){

        login();


        WebElement book=driver.findElement(By.xpath("//a[@href='/books']"));
        book.click();
        MyFunc.Bekle(1);
        WebElement healthBook=driver.findElement(By.xpath("//*[@title='Show details for Health Book']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, 500);");
        healthBook.click();
        MyFunc.Bekle(1);

        WebElement addToCard2=driver.findElement(By.xpath("//*[@id='add-to-cart-button-22']"));
        addToCard2.click();
        MyFunc.Bekle(1);
        WebElement shoppingCard=driver.findElement(By.xpath("//span[@class='cart-label']"));
        shoppingCard.click();
        MyFunc.Bekle(1);
        WebElement selectCountry=driver.findElement(By.xpath("//select[@id='CountryId']"));
        selectCountry.click();
        MyFunc.Bekle(1);
        WebElement state=driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
        state.click();
        MyFunc.Bekle(1);
        WebElement agree=driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agree.click();
        MyFunc.Bekle(1);
        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Bekle(1);
        WebElement adress=driver.findElement(By.xpath("//select[@name='billing_address_id']"));
        adress.click();
        MyFunc.Bekle(1);
        WebElement continio=driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']"));
        continio.click();
        MyFunc.Bekle(3);
        WebElement inStorePickup=driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        inStorePickup.click();
        MyFunc.Bekle(2);
        WebElement continio2=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        continio2.click();
        MyFunc.Bekle(1);
        WebElement paymentMethod=driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        paymentMethod.click();
        MyFunc.Bekle(1);
        WebElement continio3=driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        continio3.click();

        WebElement purchaseOrderPOBox = driver.findElement(By.xpath("//input[@id='PurchaseOrderNumber']"));
        purchaseOrderPOBox.sendKeys("1502463");

        WebElement purchaseOrderInfoContinueButton02 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        purchaseOrderInfoContinueButton02.click();

        List<WebElement> prices = driver.findElements(By.xpath("//[@class='product-subtotal']"));

        double totalPrice = 0;
        for (WebElement p : prices) {
            System.out.println(p.getText());
            totalPrice = totalPrice + Double.parseDouble(p.getText().replaceAll("[^0-9,.]", ""));
        }

        WebElement itemTotalelement = driver.findElement(By.xpath("//[@class='product-price']"));
        Double itemTotal = Double.parseDouble(itemTotalelement.getText().replaceAll("[^0-9,.]", ""));

        Assert.assertTrue(itemTotal == totalPrice);
    }

       // WebElement cardType=driver.findElement(By.id("CreditCardType"));
       // cardType.isSelected();

      //  WebElement cardHolderName=driver.findElement(By.id("CardholderName"));
       // WebElement cardNumber=driver.findElement(By.id("CardNumber"));
       //// WebElement Month=driver.findElement(By.id("ExpireMonth"));
       // WebElement Year=driver.findElement(By.id("ExpireYear"));
       // WebElement CardCode =driver.findElement(By.id("CardCode"));




       // month.selectByValue("5");
      //  year.selectByVisibleText("2023");










        //WebElement visa=driver.findElement(By.xpath("//select[@id='CreditCardType']")) ;
       // visa.click();
        //WebElement date=driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        //date.click();
       // WebElement year=driver.findElement(By.xpath("//select[@id='ExpireYear']"));
      //  year.click();
       // WebElement continio4=driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
       // continio4.click();










    }

