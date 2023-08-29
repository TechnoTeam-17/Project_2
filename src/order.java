import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.BaseDriver;

public class order extends BaseDriver {
    @Test
    public void Test(){

        login();

        WebElement book=driver.findElement(By.xpath("//a[@href='/books']"));
        book.click();

        WebElement healthBook=driver.findElement(By.xpath("//*[@title='Show details for Health Book']"));
        healthBook.click();

        WebElement addToCard=driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
        addToCard.click();

        WebElement shoppingCard=driver.findElement(By.xpath("//span[@class='cart-label']"));
        shoppingCard.click();

        WebElement selectCountry=driver.findElement(By.xpath("//select[@id='CountryId']"));
        selectCountry.click();

        WebElement state=driver.findElement(By.xpath("//select[@id='StateProvinceId']"));
        state.click();

        WebElement agree=driver.findElement(By.xpath("//input[@id='termsofservice']"));
        agree.click();

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        WebElement adress=driver.findElement(By.xpath("//select[@name='billing_address_id']"));
        adress.click();

        WebElement continio=driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button']"));
        continio.click();

        WebElement inStorePickup=driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        inStorePickup.click();

        WebElement continio2=driver.findElement(By.xpath("//input[@title='Continue']"));
        continio2.click();

        WebElement paymentMethod=driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        paymentMethod.click();

        WebElement continio3=driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        continio3.click();

        WebElement visa=driver.findElement(By.xpath("//select[@id='CreditCardType']")) ;
        visa.click();

        WebElement date=driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
        date.click();

        WebElement year=driver.findElement(By.xpath("//select[@id='ExpireYear']"));
        year.click();

        WebElement continio4=driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        continio4.click();











    }
}
