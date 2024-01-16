package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewTaskPage;
import pages.PaginaPrincipal;

public class NewTaskSteps {

    NewTaskPage newTask = new NewTaskPage();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("Me encuentro en el home de Sentra Tasks")
    public void homeValidation(){
        newTask.validationHome();
    } 

    @When("Selecciono Nueva Tarea")
    public void clickNewTask(){
        newTask.clickOnNewTask();
    }

    @And("Ingreso el titulo {string}, descripcion {string}, fecha de vencimiento {string} y prioridad {string}") 
    public void writeTaskCredentials(String title, String caption, String dateVenc, String prio){
        newTask.credentialsCriteria(title, caption, dateVenc, prio);
    }

    @And("Selecciono Crear Tarea")
    public void clickCreateTask(){
        newTask.clickOnCreateTask();
    }

    @Then("Se crea la tarea exitosamente")
    public void validateTaskCreated(){
        newTask.validateTaskCreated();
    }

}
