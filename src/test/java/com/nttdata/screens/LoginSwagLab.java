package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginSwagLab extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    public WebElement userInput;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Contraseña\"]")
    public WebElement passInput;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    public WebElement btnLogin;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Zona de caída del carrito de compras\"]/android.view.ViewGroup/android.widget.TextView")
    public WebElement textHeader;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Articulo\"])[1]/android.view.ViewGroup")
    public WebElement article;

}
