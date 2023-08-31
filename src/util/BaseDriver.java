package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    static{  //bunun sarti extends olmasi ve basta yer almasi mi

        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public static void login () {
        MyFunc.Bekle(1);
        MyFunc.Bekle(1);
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        WebElement logina= driver.findElement(By.xpath("//*[@href='/login']"));
        logina.click();
        MyFunc.Bekle(1);
        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("Ali06@gmail.com");
        MyFunc.Bekle(1);
        WebElement pass= driver.findElement(By.id("Password"));
        pass.sendKeys("Benim.45");
        MyFunc.Bekle(1);
        WebElement login= driver.findElement(By.xpath("//*[@type='submit'][@value='Log in']"));
        login.click();

    }
    public static void logout(){
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
       
        WebElement logout= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        logout.click();}

    public static void BekleVeKapat(){
        MyFunc.Bekle(2);
        driver.quit();
    }}


//  Java hızlı - Web sitesi yavaş
// java elemanı bulmaya çalışıyor, ama web sitesi hala yuklenıyor. site yüklenmeden java bulamadım dıyor bıtırıyor,
// Web elementı bulmaya calıstıgında (FindElement/s)
//  çözüm 1 : biraz süre vereceğiz (20s)

//  Thread.sleep(); -> javayı direkt verilen süre kadar durdurur. kac sanıye verırsen o kadar durdurur programı. Osebeple bu işimize yaramıyor. Bize buldugu zaman cıksın yanı mesela 20 sn verdık 10. sanıyede java buldun cık, 20 sn beklemesın ısterız
//         bıde bu Thread.sleep ıyı kod degıldır mulakatta bundan bahsetme mesela.
//  bunun yerıne driver.manage yapıp bunu MyFunc a atıcam oradan cagırıyorum her seferınde yazmayayım dıye