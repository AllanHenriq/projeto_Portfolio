package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubBookSelectedPage {
    private WebDriver navegador;

    public SubBookSelectedPage(WebDriver navegador){
        this.navegador = navegador;
    }
    public SubBookSelectedPage getCodeBook(){
        WebElement codigo = navegador.findElement(By.cssSelector("#content > div > div > section > div > div.GridUI-sc-1f6kp3y-0.dKDpMf.ViewUI-oocyw8-6.kvewNe > div.ColUI-sc-1ey7nd2-0.bwIMKy.ViewUI-oocyw8-6.kvewNe > section > div.GridUI-sc-1f6kp3y-0.jjTgLm.ViewUI-oocyw8-6.kvewNe > div > div > span"));
        String textoCodigo = codigo.getText();

        return this;
    }
    public SubBookSelectedPage getNameAutor(){
        WebElement primeiroNomeAutor = navegador.findElement(By.cssSelector("#content > div > div > section > div > div.GridUI-sc-1f6kp3y-0.dKDpMf.ViewUI-oocyw8-6.kvewNe > div.ColUI-sc-1ey7nd2-0.bwIMKy.ViewUI-oocyw8-6.kvewNe > section > div.book-details__BookDetailsContainer-qiq6yd-0.bDcfpu.ViewUI-oocyw8-6.kvewNe > div:nth-child(1) > div > div > a > span"));
        String nomeAutor = primeiroNomeAutor.getText();
        System.out.println(nomeAutor);

        return this;
    }

    public AmericanasPage openAmericanasPage(){
        navegador.get("https://www.americanas.com.br/");

        return new AmericanasPage(navegador);
    }
}
