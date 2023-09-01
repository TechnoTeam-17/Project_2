import org.junit.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.BaseDriver;
import util.MyFunc;

import static org.junit.Assert.assertTrue;

public class survResponse extends BaseDriver {

        @Test
        public void test1(){
            driver.get("https://demowebshop.tricentis.com/");

            login();
           //WebElement sec= driver.findElement(By.id("pollanswers-1"));
           //sec.click();
           //WebElement tik= driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
           //tik.click();
            MyFunc.Bekle(1);

            WebElement sonuc= driver.findElement(By.xpath("//*[@id='poll-block-1']/span"));

          org.testng.Assert.assertTrue(sonuc.isDisplayed(),"oylama yapildi");
            System.out.println("sonuc.getText() = " + sonuc.getText());





    }
}
