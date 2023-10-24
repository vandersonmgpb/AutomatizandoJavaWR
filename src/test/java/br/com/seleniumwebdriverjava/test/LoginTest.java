package br.com.seleniumwebdriverjava.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.seleniumwebdriverjava.pages.LoginPO;

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
}
