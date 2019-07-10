package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome() {
        //open de browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // going to the site page
        navegador.get("https://www.submarino.com.br/");

        return navegador;
    }

}