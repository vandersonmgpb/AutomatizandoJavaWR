package br.com.seleniumwebdriverjava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Base para criação das novas PagesObjects.
 * Todas as pages devem ser herdadas destas classe
 */
    
public abstract class BasePO {

    /**
     * Driver que será usado pelas pages.
     */

    protected WebDriver driver;


    /**
     * Construtor base para criação da fábrica de elementos(PageFactory)
     * @param driver Driver da página atual
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

