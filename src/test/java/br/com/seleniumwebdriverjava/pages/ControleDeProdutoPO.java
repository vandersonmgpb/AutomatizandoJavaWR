package br.com.seleniumwebdriverjava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeProdutoPO extends BasePO{

    @FindBy (id = "btn-adicionar")
    public WebElement buttonAdicionar;
    
    @FindBy (css = "//*[@id=\"collapsibleNavbar\"]/ul/li/a")
    public WebElement linkVoltar;

    @FindBy (css = "div.modal-header>h4")
    public WebElement tituloModal;

    public ControleDeProdutoPO(WebDriver driver) {
        super(driver);
    }

    
}
