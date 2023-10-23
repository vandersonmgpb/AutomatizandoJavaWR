package br.com.seleniumwebdriverjava.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.seleniumwebdriverjava.pages.GooglePO;

    public class GoogleTest extends BaseTest{
        
        private static GooglePO googlePage;
        @BeforeClass
        public static void prepararTestes(){
            googlePage = new GooglePO(driver);
        }
    
    @Test
    public void TC001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita(){

        googlePage.pesquisar("Batata frita");
        
        String resultado = googlePage.obterResutladoDaPesquisa();
        
        assertTrue(resultado, resultado.contains("Aproximadamente"));
        
    }
    
    @Test
    public void TC001_deveSerPossivelPesquisarNoGoogleOTextoNutella(){
        
        
        googlePage.pesquisar("Nutella ");
        
        String resultado = googlePage.obterResutladoDaPesquisa();
        
        assertTrue(resultado, resultado.contains("resultados"));

    }
}
