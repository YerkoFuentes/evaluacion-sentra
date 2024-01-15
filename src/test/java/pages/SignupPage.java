package pages;


public class SignupPage extends BasePage{

    public SignupPage(){
        super(driver);
    }
    
    private String createNewUser = "//button[@type='button']";
    private String firstResult = "//button[text()='Registrar Usuario']";
    private String usernameTextField = "//input[@id='firstname']";
    private String lastnameTextField = "//input[@id='lastname']";
    private String correoTextField = "(//input[@id='email'])[2]";
    private String passwordTextField = "(//input[@id='password'])[2]";
    private String repeatTextField = "//input[@id='repeat_password']";
    private String validateNewUser = "//div[text()='Usuario creado correctamente']";

    public void clickCreateNewUser(){
        clickElement(createNewUser);
    }

    public boolean firstResult(){
        return elementIsDisplayed(firstResult);
    }

    public void enterUsernameCriteria(String username, String lastname, String correo, String password){
        write(usernameTextField, username);
        write(lastnameTextField, lastname);
        write(correoTextField, correo);
        write(passwordTextField, password);
        write(repeatTextField, password);
    }

    public void createButton(){
        clickElement(firstResult);
    }

    public String validateCreation(){
        return textFromElement(validateNewUser);
    }

}
