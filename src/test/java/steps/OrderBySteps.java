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

    @When("Realizo doble click en {string} dentro de la grilla de tareas")
    public void doubleClickTitle(String option){
        orderBy.doubleClickOnGrid(option);
    }

    @Then("Las tareas se ordenan de manera descendente")
    public void validateTitleDescOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "descending");
    }

    @Then("Las tareas se ordenan de manera ascendente")
    public void validateTitleAscOrder(){
        org.testng.Assert.assertEquals(orderBy.validateOrder(), "ascending");
    }
}
