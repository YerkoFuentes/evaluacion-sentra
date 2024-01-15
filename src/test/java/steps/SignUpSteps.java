package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;
import pages.PaginaPrincipal;

public class SignUpSteps {
    
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    SignupPage signup = new SignupPage();


    @Given("Navego hasta el sitio de Sentra Tasks")
    public void iNavigateToST() {
        paginaPrincipal.navigateToSentraTasks();
    }

    @When("Voy a crear un nuevo usuario")
    public void clickNewUser() {
        signup.clickCreateNewUser();
    }

    @Then("Se levanta la ventana para Registrar Usuario")
    public void windowIsUp( ){
        org.testng.Assert.assertFalse(signup.firstResult(), "No se levanto ventana Registrar Usuario");
    }

    @Given("Ingreso el nombre {string}, apellido {string}, correo {string} y password {string}")
    public void writeUserInformation(String username, String lastname, String correo, String password) {
        signup.enterUsernameCriteria(username, lastname, correo, password);
    }
    
    @When("Selecciono el boton Registrar Usuario")
    public void clickCreateButton(){
        signup.createButton();
    }

    @Then("El usuario es registrado exitosamente")
    public void checkUserCreation(){
        org.testng.Assert.assertEquals(signup.validateCreation(), "Usuario creado correctamente");
    }

}
