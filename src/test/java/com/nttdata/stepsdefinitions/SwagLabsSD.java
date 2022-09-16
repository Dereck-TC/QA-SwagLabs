package com.nttdata.stepsdefinitions;

import com.nttdata.screens.LoginSwagLab;
import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SwagLabsSD {

    @Steps
    SwagLabsSteps swagLabsSteps;
    LoginSwagLab loginscreen;
    @Given("estoy en el login")
    public void estoyEnElLogin() {
        swagLabsSteps.init();
    }

    @And("tipeo el usuario {string}")
    public void tipeoElUsuario(String user) {
        swagLabsSteps.setValor("User", user, loginscreen.userInput);
    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String password) {
        swagLabsSteps.setValor("Password",password, loginscreen.passInput);
    }

    @When("clic en LOGIN")
    public void clicEnLOGIN() {
        swagLabsSteps.clic("Login",loginscreen.btnLogin);
    }

    @Then("valido que aparezca el texto {string}")
    public void validoQueAparezcaElTexto(String text) {
        swagLabsSteps.verificacion(text);
    }

    @And("que tenga mínimo un item")
    public void queTengaMínimoUnItem() {
        swagLabsSteps.item();
    }
}
