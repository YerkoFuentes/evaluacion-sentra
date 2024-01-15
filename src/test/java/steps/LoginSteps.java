package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.PaginaPrincipal;

public class LoginSteps {

    LoginPage login = new LoginPage();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("Me encuentro en Sentra Tasks")
    public void iNavigateToSentraTasks() {
        paginaPrincipal.navigateToSentraTasks();
    }

    @When("Ingreso mis credenciales {string} {string}")
    public void writeCredentials(String emailLogin, String passwordLogin){
        login.enterLoginCriteria(emailLogin, passwordLogin);
    }

    @And("Selecciono ingresar")
    public void clickIngresar(){
        login.clickOnIngresar();
    }

    @Then("Inicio sesion con mi usuario")
    public void loginUser(){
        org.testng.Assert.assertEquals(login.loginVerification(), "Salir");
    }
}
