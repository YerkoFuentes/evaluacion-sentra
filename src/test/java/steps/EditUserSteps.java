package steps;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditUserPage;
import pages.PaginaPrincipal;

public class EditUserSteps {

    EditUserPage edit = new EditUserPage();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("Como usuario con la sesion iniciada")
    public void iNavigateToSTDashboard() {
        paginaPrincipal.navigateToSentraTasks();
    }

    @When("Voy a mi perfil")
    public void clickProfile() {
        edit.clickProfile();
    }

    @And("Selecciono la opcion {string}")
    public void editUserPass(String option){
        edit.editUsserAndPass(option);
    }

    @Then("Se levanta la ventana {string}")
    public void editWindowIsUp(String option){
        Assert.assertTrue(edit.validateWindows(option), option.toLowerCase());
    }

    @And("Ingreso mi nombre {string}, apellido {string} y correo {string}")
    public void writeNewCredentials(String nameEdit, String lastnameEdit, String emailEdit){
        edit.writeNewCredentials(nameEdit, lastnameEdit, emailEdit);
    }

    @And("Ingreso mi nueva contrasena {string} y la repito {string}")
    public void writeNewCredentials(String password, String repeatPassword){
        edit.writeNewPassword(password, repeatPassword);
    }

    @And("Selecciono {string}")
    public void editUser(String option){
        edit.clickModUser(option);
    }

    @Then("Se modifica mi informacion correctamente")
    public void editVerification(){
        edit.validateEdit();
    }

}
