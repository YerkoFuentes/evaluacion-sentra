package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;
import pages.TaskListedPage;

public class TaskListedSteps {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    TaskListedPage tasksListed = new TaskListedPage();

    @Given("Como usuario con logeado")
    public void iNavigateToSentraT() {
        
    }

    @When("Me encuentro en la pestana Home")
    public void validateHome() {
        tasksListed.validateHome();
    }

    @Then("No se muestran en pantalla las tareas")
    public void noTasks() {
        org.testng.Assert.assertTrue(tasksListed.noTasks(), "No existen tareas asignadas.");
    }

    @Then("Se muestran en pantalla las tareas")
    public void trueTasks() {
        org.testng.Assert.assertTrue(tasksListed.trueTasks(), "No existen tareas asignadas.");
    }

}
