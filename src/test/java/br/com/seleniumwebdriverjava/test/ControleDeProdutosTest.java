package br.com.seleniumwebdriverjava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.seleniumwebdriverjava.pages.ControleDeProdutoPO;
import br.com.seleniumwebdriverjava.pages.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControleDeProdutosTest extends BaseTest{

    private static LoginPO loginpage;
    private static ControleDeProdutoPO controlleProdutoPage;

    
    @BeforeClass
    public static void prepararTestes(){
        loginpage = new LoginPO(driver);
        loginpage.executarAcaoDeLogar("admin@admin.com", "admin@123");
        
        controlleProdutoPage = new ControleDeProdutoPO(driver);

        assertEquals(controlleProdutoPage.obterTituloDaPagina(), "Controle de Produtos");
    }
    
    @Test
    public void TC001_deveAbrirModalParaCadastroAoClicarNoBotaoCriar(){
        controlleProdutoPage.buttonAdicionar.click();
        // TODO: remover esse clique assim que o sistema for corrigido
        controlleProdutoPage.buttonAdicionar.click();
        
        String titulo = controlleProdutoPage.tituloModal.getText();

        assertEquals("Produto", titulo);
    }
}
