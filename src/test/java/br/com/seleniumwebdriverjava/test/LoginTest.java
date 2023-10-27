package br.com.seleniumwebdriverjava.test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.seleniumwebdriverjava.pages.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest{
    private static LoginPO loginpage;
        
        @BeforeClass
        public static void prepararTestes(){
            loginpage = new LoginPO(driver);
        }
    
    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios(){

        loginpage.executarAcaoDeLogar("", "");
        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }
    
    @Test
    public void TC002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazia(){

        loginpage.executarAcaoDeLogar("teste", "");

        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }
    
    @Test
    public void TC003_naoDeveLogarNoSistemaComEmailVazioESenhaIncorreta(){

        loginpage.executarAcaoDeLogar("", "teste");

        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC004_naoDeveLogarNoSistemaComEmailIncorretoESenhaIncorreta(){

        loginpage.executarAcaoDeLogar("teste", "teste");

        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC005_naoDeveLogarNoSistemaComEmailCorretoESenhaIncorreta(){

        loginpage.executarAcaoDeLogar("admin@admin.com", "teste");

        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC006_naoDeveLogarNoSistemaComEmailIncorretoESenhacorreta(){

        loginpage.executarAcaoDeLogar("Aadmin@admin.com", "admin@123");

        String mensagem = loginpage.obterMensagem();

        assertEquals(mensagem, "E-mail ou senha inválidos");
    }

    @Test
    public void TC007_deveLogarNoSistemaComEmailESenhacorretos(){

        loginpage.executarAcaoDeLogar("admin@admin.com", "admin@123");

        assertEquals(loginpage.obterTituloDaPagina(), "Controle de Produtos");
    }
}
