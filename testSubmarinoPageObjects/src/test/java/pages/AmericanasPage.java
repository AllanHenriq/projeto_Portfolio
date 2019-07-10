package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmericanasPage {
    private WebDriver navegador;

    public AmericanasPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public AmericanasPage typeCodeBook(){
        navegador.findElement(By.cssSelector("#h_search-input")).sendKeys("132730056");

        return this;
    }

    public AmericanasPage clickSearchPage(){
        navegador.findElement(By.id("h_search-btn")).click();

        return this;
    }

    public AmericanasPage clickOnBookAmericanas(){
        navegador.findElement(By.cssSelector("#content-middle > div:nth-child(5) > div > div > div > div.row.product-grid.no-gutters.main-grid > div > div > div.RippleContainer-sc-1e1nj6p-0.fqCWyR > a > section > div.Info-sc-1m3ayw0-4.iosIhR.ViewUI-oocyw8-6.kvewNe > div.TitleWrapper-c6mv26-7.cXTBDO.ViewUI-oocyw8-6.kvewNe > h1")).click();

        return this;
    }

    public AmericanasPage getNomeAutorBookAmericanas(){
        WebElement primeiroNomeAutorAmericanas = navegador.findElement(By.cssSelector("#info-section > div:nth-child(2) > section > div > div.col__ColUI-sc-1ey7nd2-0.cZgwvo.view__ViewUI-oocyw8-6.kvpAuX > table > tbody > tr:nth-child(13) > td:nth-child(2) > span"));
        String nomeAutorAmericanas = primeiroNomeAutorAmericanas.getText();
        System.out.println(nomeAutorAmericanas);

        return this;
    }

   }
