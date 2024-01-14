package pages;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextWritingException;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    private String emailLoginText = "//input[@id='email']";
    private String passwordLoginText = "//input[@id='password']";
    private String ingresarButton = "//button[normalize-space()='Ingresar']";


    public void enterLoginCriteria(String emailLogin, String passwordLogin){
        try {
            write(emailLoginText, emailLogin);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Email al iniciar sesion");
            e.printStackTrace();
        }
        try {
            write(passwordLoginText, passwordLogin);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Password al iniciar sesion");
            e.printStackTrace();
        }
    }

    public void clickOnIngresar(){
        try {
            clickElement(ingresarButton);
        } catch (NoSuchElementException e) {
            System.out.println("No se encontró el Boton INGRESAR");
            e.printStackTrace();
        }
    }
}
