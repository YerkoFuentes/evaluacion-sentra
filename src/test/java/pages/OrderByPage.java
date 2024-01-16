package pages;

public class OrderByPage extends BasePage{

    public OrderByPage(){
        super(driver);
    }

    private String titleOnGrid = "//th/span[contains(text(),'T')]";
    private String dateVencOnGrid = "//th/span[contains(text(),'Fecha Venc')]";
    private String priorityOnGrid = "//th/span[contains(text(),'Prio')]";
    private String validateOrder = "//th[@aria-sort]";
    


    public void clickOnGrid(String option){
        switch (option.toLowerCase()) {
            case "titulo":
                clickElement(titleOnGrid);
                break;
            
            case "prioridad":
                clickElement(priorityOnGrid);
                clickElement(priorityOnGrid);
                break;

            case "fecha vencimiento":
                clickElement(dateVencOnGrid);
                clickElement(dateVencOnGrid);
                break;
        }
    }

    public void doubleClickOnGrid(String option){
        switch (option.toLowerCase()) {
            case "titulo":
                clickElement(titleOnGrid);
                clickElement(titleOnGrid);
                break;
            
            case "prioridad":
                clickElement(priorityOnGrid);
                break;

            case "fecha vencimiento":
                clickElement(dateVencOnGrid);
                break;
        }
    }

    public String validateOrder(){
        String order = attributeAriaSortFromElement(validateOrder);
        return order;
    }
    
}
