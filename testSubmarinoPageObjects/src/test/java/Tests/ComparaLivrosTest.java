package Tests;

import Suporte.Web;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AmericanasPage;
import pages.SearchPage;
import pages.SubBookSelectedPage;
import pages.SubBooksPage;


public class ComparaLivrosTest {
    private WebDriver navegador;
    private SearchPage search;
    private SubBookSelectedPage subSelPage;
    private SubBooksPage subBooksPage;
    private AmericanasPage americanasPage;
    @Before
    public void setUp(){
    //call to method "open browser"
        navegador = Web.createChrome();
    }

    @Test
    public void testSearchBookAmericanas(){
        search = new SearchPage();
        subSelPage = new SubBookSelectedPage();
        americanasPage = new AmericanasPage();


        search.typeBook();
        search.clickSearchPage();
        subBooksPage.selectfirstBook();
        subSelPage.getCodeBook();
        String respotaSub = subSelPage.getNameAutor();
        navegador.get("https://www.americanas.com.br/");
        americanasPage.typeCodeBook();
        americanasPage.clickSearchPage();
        americanasPage.clickOnBookAmericanas();
        americanasPage.getNomeAutorBookAmericanas();

        Assert.assertEquals(respotaSub, "bla bla bla");

    }

/*    @After
    public void tearDown(){
       navegador.quit();
    }*/
}
