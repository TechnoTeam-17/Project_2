import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.BaseDriver;
import util.MyFunc;

public class survResponse extends BaseDriver {

        @Test
        public void test1(){
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().window().maximize();
            login();
           //WebElement sec= driver.findElement(By.id("pollanswers-1"));
           //sec.click();
           //WebElement tik= driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
           //tik.click();
            MyFunc.Bekle(1);

            WebElement sonuc= driver.findElement(By.xpath("//*[@id='poll-block-1']/span"));
            Assert.assertTrue("oylama basarili",sonuc.isDisplayed());
            BekleVeKapat();




    }
}
