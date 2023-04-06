package instagramBot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import java.time.Duration;
import org.junit.Test;
public class instagramBot {

    @Test
    public void test() throws Exception {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.instagram.com/");

        /* Kullanıcı giriş işlemini yapar */
        WebElement kullaniciAdi = driver.findElement(By.xpath("//input[@aria-label='Telefon numarası, kullanıcı adı veya e-posta']"));
        kullaniciAdi.sendKeys("XXX");

        WebElement sifre = driver.findElement(By.xpath("//input[@aria-label='Şifre']"));
        sifre.sendKeys("XXX");

        WebElement girisYap = driver.findElement(By.xpath("(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]"));
        girisYap.click();
        /* ------------------------------- */

        WebElement simdiDegil = driver.findElement(By.xpath("//div[@class='x1i10hfl xjqpnuy xa49m3k xqeqjp1 x2hbi6w xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x1lku1pv x1a2a7pz x6s0dn4 xjyslct x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 x1ypdohk x1i0vuye xwhw2v2 xl56j7k x17ydfre x1f6kntn x2b8uid xlyipyv x87ps6o x14atkfc x1d5wrs8 x972fbf xcfux6l x1qhh985 xm0m39n xm3z3ea x1x8b98j x131883w x16mih1h xt0psk2 xt7dq6l xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 xjbqb8w x1n5bzlp x173jzuc x1yc6y37']"));
        simdiDegil.click();

        WebElement simdiDegil2 = driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']"));
        simdiDegil2.click();

        /* Arama butonuna tıklar, arama çubuğuna tıklayıp "natgeo" yazar */
        Thread.sleep(2000);
        WebElement ara = driver.findElement(By.xpath("(//div[@class='x1n2onr6'])[3]"));
        ara.click();

        Thread.sleep(2000);
        WebElement aramaCubugu = driver.findElement(By.xpath("//input[@aria-label='Arama Girdisi']"));
        aramaCubugu.click();

        aramaCubugu.sendKeys("natgeo");
        WebElement ilkKullanici = driver.findElement(By.xpath("(//div[@role='none'])[1]"));
        ilkKullanici.click();
        /* ------------------------------- */

        String TakipEt = "Takip Et";
        String takipEtGetText = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).getText();

        //kullanıcıyı takip eder ve önerilen kişiler bölümünü kapatır
        if(takipEtGetText.equals(TakipEt)) {

            WebElement takipEt = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
            takipEt.click();
            WebElement onerilenler = driver.findElement(By.xpath("(//button[@class='_acan _acap _acat _aj1-'])[2]"));
            onerilenler.click();

        }
        /* ilk gönderiye girer */
        Thread.sleep(2000);
        WebElement ilkPaylasim = driver.findElement(By.xpath("(//div[@class='_aabd _aa8k  _al3l'])[1]"));
        ilkPaylasim.click();

        /* ilk gönderiyi beğenir */
        Thread.sleep(2000);
        WebElement begen = driver.findElement(By.xpath("(//button[@class='_abl-'])[4]"));
        begen.click();

        /* ilk gönderiye emoji ile yorum yapar */
        Thread.sleep(2000);
        WebElement emoji = driver.findElement(By.xpath("//div[@class='x1y1aw1k x1pi30zi xwib8y2 x1swvt13']"));
        emoji.click();
        WebElement dunyaEmojisi = driver.findElement(By.xpath("(//div[@class='_adkq'])[1289]"));
        dunyaEmojisi.click();
        WebElement yorumuPaylas = driver.findElement(By.xpath("//div[@class='x1i10hfl xjqpnuy xa49m3k xqeqjp1 x2hbi6w xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x1lku1pv x1a2a7pz x6s0dn4 xjyslct x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 x1ypdohk x1i0vuye xwhw2v2 xl56j7k x17ydfre x1f6kntn x2b8uid xlyipyv x87ps6o x14atkfc x1d5wrs8 x972fbf xcfux6l x1qhh985 xm0m39n xm3z3ea x1x8b98j x131883w x16mih1h xt0psk2 xt7dq6l xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 xjbqb8w x1n5bzlp x173jzuc x1yc6y37']"));
        yorumuPaylas.click();

        /* Gonderiyi kaydeder ve kapatır */
        Thread.sleep(3000);
        WebElement kaydet = driver.findElement(By.xpath("(//button[@class='_abl-'])[7]"));
        kaydet.click();

        Thread.sleep(2000);
        WebElement gonderiyiKapat = driver.findElement(By.xpath("//div[@class='x10l6tqk x160vmok x1eu8d0j x1vjfegm']"));
        gonderiyiKapat.click();
        /* ----------------------------- */

        /* Profile girer ve çıkış yapar */
        Thread.sleep(2000);
        WebElement profil = driver.findElement(By.xpath("(//div[@class='x1n2onr6'])[10]"));
        profil.click();

        Thread.sleep(2000);
        WebElement secenekler = driver.findElement(By.xpath("//button[@class='_abl-']"));
        secenekler.click();

        Thread.sleep(2000);
        WebElement cikisYap = driver.findElement(By.xpath("(//button[@class='_a9-- _a9_1'])[9]"));
        cikisYap.click();
        /* ----------------------------- */
        }
    }
