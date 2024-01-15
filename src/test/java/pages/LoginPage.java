package pages;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    private String emailLoginText = "//input[@id='email']";
    private String passwordLoginText = "//input[@id='password']";
    private String ingresarButton = "//button[normalize-space()='Ingresar']";
    private String loginVerification = "//span[text()='Salir']";


    public void enterLoginCriteria(String emailLogin, String passwordLogin){
        write(emailLoginText, emailLogin);
        write(passwordLoginText, passwordLogin);
    }

    public void clickOnIngresar(){
        clickElement(ingresarButton);
    }

    public String loginVerification(){
        return textFromElement(loginVerification);
    }
}
