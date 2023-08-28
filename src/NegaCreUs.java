import Utility.BaseDriver;
import Utility.Func;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegaCreUs extends BaseDriver {

    @Test

    public void test1(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Func.Stop(1);
        WebElement register= driver.findElement(By.xpath(" //*[@class='ico-register']"));
        register.click();
        WebElement gender= driver.findElement(By.id("gender-male"));
        gender.click();
        WebElement firstName= driver.findElement(By.xpath("//input[@class='text-box single-line'and@name='FirstName']"));
        firstName.sendKeys("Yavuz");
        WebElement lastName= driver.findElement(By.xpath("//input[@class='text-box single-line'and@name='LastName']"));
        lastName.sendKeys("Selim");
        WebElement email=driver.findElement(By.xpath("//*[@class='text-box single-line'and@name='Email']"));
        email.sendKeys("Ali06@gmail.com");
        WebElement password= driver.findElement(By.xpath("//*[@class='text-box single-line password'and@name='Password']"));
        password.sendKeys("Benim.46");
        WebElement password2= driver.findElement(By.xpath("//*[@class='text-box single-line password'and@name='ConfirmPassword']"));
        password2.sendKeys("Benim.46");
        WebElement regi= driver.findElement(By.xpath("//input[@type='submit'and@name='register-button']"));
        regi.click();
        //*[text()='The specified email already exists' ]//*[contains(text(),'The ')]
        WebElement emailError=driver.findElement(By.xpath("//*[contains(text(),'The ')]"));
        Assert.assertTrue("Kod doğru",emailError.getText().equals("The specified email already existsc"));
        Func.Stop(2);
       // if (emailError.getText().equals("The specified email already existsc"))
       // System.out.println("Test başarılı");
      //  else
        //    System.out.println("test başarısız");
    }
}
