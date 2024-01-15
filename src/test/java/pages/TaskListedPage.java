package pages;

public class TaskListedPage extends BasePage{
    public TaskListedPage(){
        super(driver);
    }

    private String clickHomeMenu = "//a[@href='/home']";
    private String homeValidation = "//div[text()='Home']";
    private String noTasks = "//div[contains(text(),'No existen')]";
    private String tableTasks = "//tbody/a";

    public String validateHome() {
        clickElement(clickHomeMenu);
        return textFromElement(homeValidation);
    }

    public boolean noTasks(){
        return elementIsDisplayed(noTasks);
    }

    public boolean trueTasks(){
        return elementIsDisplayed(tableTasks);
    }
}