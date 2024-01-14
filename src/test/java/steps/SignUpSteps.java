package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;
import pages.PaginaPrincipal;

public class SignUpSteps {
    
    PaginaPrincipal chrome = new PaginaPrincipal();
    SignupPage login = new SignupPage();


    @Given("Navego hasta el sitio de Sentra Tasks")
    public void iNavigateToST() {
        chrome.navigateToSentraTasks();
    }

    @When("Voy a crear un nuevo usuario")
    public void clickNewUser() {
        login.clickCreateNewUser();
    }

    @Then("Se levanta la ventana para Registrar Usuario")
    public void windowIsUp( ){
        login.firstResult();
    }

    @Given("Ingreso el nombre {string}, apellido {string}, correo {string} y password {string}")
    public void writeUserInformation(String username, String lastname, String correo, String password) {
        login.enterUsernameCriteria(username, lastname, correo, password);
    }
    
    @When("Selecciono el boton Registrar Usuario")
    public void clickCreateButton(){
        login.createButton();
    }

    @Then("El usuario es registrado exitosamente")
    public void checkUserCreation(){
        org.testng.Assert.assertEquals(login.validateCreation(), "Usuario creado correctamente");
    }

}
