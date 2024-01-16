package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderByPage;
import pages.PaginaPrincipal;

public class OrderBySteps {

    OrderByPage orderBy = new OrderByPage();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();


    //ORDENAR SEGUN TITULO
    @When("Selecciono {string} en la grilla de tareas")
    public void clickTitle(String option){
        orderBy.clickOnGrid(option);
    }

    @Then("Las tareas se ordenan de manera ascendente")
    public void validateTitleAscOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "ascending");
    }

    @When("Realizo doble click en {string} dentro de la grilla de tareas")
    public void doubleClickTitle(String option){
        orderBy.doubleClickOnGrid(option);
    }

    @Then("Las tareas se ordenan de manera descendente")
    public void validateTitleDescOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }
/* 
    //ORDENAR SEGUN PRIORIDAD
    @When("Selecciono Prioridad en la grilla de tareas")
    public void clickPriority(){

    }
    
    @Then("Las tareas se ordenan de manera descendente segun su Prioridad")
    public void validatePriorityDescOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }
    
    @When("Realizo doble click en prioridad dentro de la grilla de tareas")
    public void doubleClickPriority(){

    }

    @Then("Las tareas se ordenan de manera ascendente segun su Prioridad")
    public void validatePriorityAscOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }

    //ORDENAR SEGUN FECHA DE TERMINO
    @When("Selecciono Fecha Vencimiento en la grilla de tareas")
    public void clickVencDate(){

    }
    
    @Then("Las tareas se ordenan de manera descendente segun su Fecha Vencimiento")
    public void validateVencDateDescOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }
    
    @When("Realizo doble click en Fecha Vencimiento dentro de la grilla de tareas")
    public void doubleVencDatePriority(){

    }

    @Then("Las tareas se ordenan de manera ascendente segun su Fecha Vencimiento")
    public void validateVencDateAscOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }

*/
}
