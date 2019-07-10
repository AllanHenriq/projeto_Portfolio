package Tests;

import Suporte.Web;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AmericanasPage;
import pages.SearchPage;


public class ComparaLivrosTest {
    private WebDriver navegador;


    @Before
    public void setUp(){
    //call to method "open browser"
        navegador = Web.createChrome();
    }

    @Test
    public void testSearchBookAmericanas(){
        new SearchPage(navegador)
          //AmericanasPage nomeAutorAmericanas = new SearchPage(navegador)
                .typeBook()
                .clickSearchPage()
                .selectfirstBook()
                .getCodeBook()
                .getNameAutor()
                .openAmericanasPage()
                .typeCodeBook()
                .clickSearchPage()
                .clickOnBookAmericanas()
                .getNomeAutorBookAmericanas();

        Assert.assertEquals("Mark Manson", nomeAutorAmericanas);

    }

/*    @After
    public void tearDown(){
       navegador.quit();
    }*/
}
