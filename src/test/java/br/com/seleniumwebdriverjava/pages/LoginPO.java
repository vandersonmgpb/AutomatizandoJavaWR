package br.com.seleniumwebdriverjava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{
   
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;
    
    @FindBy(id = "btnbutton")
    public WebElement buttonEntrar;

    @FindBy(id = "form.form-login.alert>span")
    public WebElement spanMensagem;

    







    
    /**
     * Construtor padrão para ciração de uma instância da pagina de login
     * @param driver Driver da pagina de login
     */
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    
}
