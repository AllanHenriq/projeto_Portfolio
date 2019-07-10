package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver navegador;

    public SearchPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public SearchPage typeBook(){
        navegador.findElement(By.cssSelector("#h_search-input")).sendKeys("livro");

        return this;
    }
    public SubBooksPage clickSearchPage(){
        navegador.findElement(By.id("h_search-btn")).click();

        return new SubBooksPage(navegador);
    }
}
