import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.*;

    public class Register extends BaseDriver {


    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        login();//login test calisma
        WebElement register = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        register.click();
        Func.Stop(2);
        WebElement genderm = driver.findElement(By.id("gender-male"));
        genderm.click();
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Ali");
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Veli");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("ali06@gmail.com");
        WebElement pasw = driver.findElement(By.name("Password"));
        pasw.sendKeys("ali06@gmail.com");
        WebElement paswd = driver.findElement(By.name("ConfirmPassword"));
        paswd.sendKeys("ali06@gmail.com");
        WebElement regButton = driver.findElement(By.id("register-button"));
        // regButton.click(); register edildi
         //login test calisma
        Func.Stop(4);





    }
}
