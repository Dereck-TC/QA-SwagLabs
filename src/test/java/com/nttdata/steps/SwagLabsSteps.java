package com.nttdata.steps;

import com.nttdata.screens.LoginSwagLab;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SwagLabsSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwagLabsSteps.class);

    private LoginSwagLab loginSwagLab;

    @Before
    public void init() {
        LOGGER.info("i init");
        RestAssured.useRelaxedHTTPSValidation();
        LOGGER.info("f init");
    }

    /**
     * Ingresar un valor
     * @param nameValue Nombre del Valor
     * @param value el Valor
     * @param screenElement Elemento a utilizar
     */
    @Step("Ingresando Valor a un Input")
    public void setValor(String nameValue, String value, WebElement screenElement){
        LOGGER.info("i Ingresando " + nameValue + ": " + value);
        screenElement.click();
        screenElement.sendKeys(value);
        LOGGER.info("f valor ingresado");
    }

    /**
     * Haciendo clic en un Button
     */
    @Step("clic en un button")
    public void clic(String nameElement, WebElement element){
        LOGGER.info("i clic en " + nameElement);
        element.click();
        LOGGER.info("f se hizo clic en " + nameElement);
    }

    /**
     * Verificando una acción con un texto
     * @param text Valor a verificar
     */
    @Step("Verificacion de texto")
    public void verificacion(String text){
        LOGGER.info("i Verificando Logueo");
        loginSwagLab.textHeader.getText().equalsIgnoreCase(text);
        LOGGER.info("f de verificion");
    }
    /**
     * Verificando que exista un item
     */
    @Step("Verificacion de item")
    public void item(){
        LOGGER.info("i Verificando item");
        loginSwagLab.article.isDisplayed();
        LOGGER.info("f de verificion");
    }

}
