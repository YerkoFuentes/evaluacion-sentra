package pages;

public class NewTaskPage extends BasePage{

    public NewTaskPage(){
        super(driver);
    }

    private String clickHome = "//a[@href='/home']";
    private String homeValidate = "//div[text()='Home']";
    private String newTaskButton = "//button[text()='Nueva Tarea']";
    private String titleTextField = "//input[@id='title']";
    private String captionTextField = "//textarea[@id='title']";
    private String dateVencTextField = "//input[@type='datetime-local']";
    private String prioTextField = "//input[@type='number']";
    private String createTaskButton = "//button[text()='Crear Tarea']";
    private String newTaskCreatedValidation = "//div[contains(@class,'MuiAlert-message')]";


    public String validationHome() {
        clickElement(clickHome);
        return textFromElement(homeValidate);
    }

    public void clickOnNewTask(){
        clickElement(newTaskButton);
    }

    public void credentialsCriteria(String title, String caption, String dateVenc, String prio){
        write(titleTextField, title);
        write(captionTextField, caption);
        write(dateVencTextField, dateVenc);
        write(prioTextField, prio);
    }

    public void clickOnCreateTask(){
        clickElement(createTaskButton);
    }

    public String validateTaskCreated(){
        return textFromElement(newTaskCreatedValidation);
    }
}
