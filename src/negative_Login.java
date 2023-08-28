import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BaseDriver;
import util.MyFunc;

public class negative_Login extends BaseDriver {
    @Test

    public void Test1 () {
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);
        WebElement logina = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        logina.click();
        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        login.click();
        MyFunc.Bekle(1);
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'No customer')]"));
        // System.out.println("text = " + text.getText());
        Assert.assertTrue("giris yapilamaz", text.getText().equals("No customer account found"));
        MyFunc.Bekle(1);
    }
    @Test
    public void Test2(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);
        WebElement loginb= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        loginb.click();
        MyFunc.Bekle(1);
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("Ali06@gmail.com");
        MyFunc.Bekle(1);
        WebElement loginc = driver.findElement(By.xpath("//*[@type='submit'][@value='Log in']"));
        loginc.click();
        MyFunc.Bekle(1);
        WebElement hata= driver.findElement(By.xpath("//*[contains(text(),'The credentials')]"));
        Assert.assertTrue("passw gerekli",hata.isDisplayed());
        MyFunc.Bekle(2);

    }
    @Test
    public void Test3(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);
        WebElement loginb= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        loginb.click();
        MyFunc.Bekle(1);
        WebElement pasw= driver.findElement(By.name("Password"));
        pasw.sendKeys("ali06@gmail.com");
        MyFunc.Bekle(1);
        WebElement loginc = driver.findElement(By.xpath("//*[@type='submit'][@value='Log in']"));
        loginc.click();
        MyFunc.Bekle(1);
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'No customer')]"));
        // System.out.println("text = " + text.getText());
        Assert.assertTrue("giris yapilamaz", text.getText().equals("No customer account found"));
        MyFunc.Bekle(2);
}
@Test
    public void Test4(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        MyFunc.Bekle(1);
        WebElement logina= driver.findElement(By.xpath("//*[@href='/login']"));
        logina.click();
        MyFunc.Bekle(1);
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("Aderfli93@gmail.com");
        MyFunc.Bekle(1);
        WebElement pass= driver.findElement(By.id("Password"));
        pass.sendKeys("Kim/ko.9z1");
        MyFunc.Bekle(1);
        WebElement login= driver.findElement(By.xpath("//*[@type='submit'][@value='Log in']"));
        login.click();
        MyFunc.Bekle(1);
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'No customer')]"));
        // System.out.println("text = " + text.getText());
        Assert.assertTrue("giris yapilamaz", text.getText().equals("No customer account found"));
    BekleVeKapat();
    }


}
