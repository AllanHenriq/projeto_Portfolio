package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubBooksPage {
    private WebDriver navegador;

    public SubBooksPage (WebDriver navegador){
        this.navegador = navegador;
    }

    public void selectfirstBook (){
        navegador.findElement(By.cssSelector("#content-middle > div:nth-child(5) > div > div > div > div.row.product-grid.no-gutters.main-grid > div:nth-child(1) > div > div.RippleContainer-sc-1e1nj6p-0.fqCWyR > a > section > div.Info-sc-1m3ayw0-5.hqMWLy.ViewUI-oocyw8-6.kvewNe > div.TitleWrapper-c6mv26-7.cXTBDO.ViewUI-oocyw8-6.kvewNe > h3")).click();

//        return new SubBookSelectedPage(navegador);
    }

}

