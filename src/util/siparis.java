package util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class siparis extends BaseDriver {

        @Test
        public void Test() {

            login();

            WebElement book = driver.findElement(By.xpath("//a[@href='/books']"));
            book.click();

            WebElement healthBook = driver.findElement(By.xpath("//*[@title='Show details for Health Book']"));
            healthBook.click();

            WebElement addToCard = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
            addToCard.click();

            WebElement shoppingCard = driver.findElement(By.xpath("//span[@class='cart-label']"));
            shoppingCard.click();

            WebElement selectCountry = driver.findElement(By.xpath("//select[@id='CountryId']"));
            selectCountry.click();

            WebElement state = driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
            state.click();

            WebElement agree = driver.findElement(By.xpath("//input[@id='termsofservice']"));
            agree.click();

            WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
            checkout.click();

            WebElement adress = driver.findElement(By.xpath("//select[@name='billing_address_id']"));
            adress.click();


        }
    }

