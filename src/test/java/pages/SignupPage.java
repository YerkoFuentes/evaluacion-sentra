package pages;

import java.util.NoSuchElementException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextWritingException;


public class SignupPage extends BasePage{

    public SignupPage(){
        super(driver);
    }
    
    private String createNewUser = "//button[@type='button']";
    private String firstResult = "//h2[@id=':r2:']";
    private String usernameTextField = "//input[@id='firstname']";
    private String lastnameTextField = "//input[@id='lastname']";
    private String correoTextField = "(//input[@id='email'])[2]";
    private String passwordTextField = "(//input[@id='password'])[2]";
    private String repeatTextField = "//input[@id='repeat_password']";
    private String createNewUserButton = "//button[normalize-space()='Registrar Usuario']";
    private String validateNewUser = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]";

    public void clickCreateNewUser(){
        try {
            clickElement(createNewUser);
        } catch (NoSuchElementException e) {
            System.out.println("No se encontró el WebElement Crear Nuevo Usuario");
            e.printStackTrace();
        }
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }

    public void enterUsernameCriteria(String username, String lastname, String correo, String password){
        try {
            write(usernameTextField, username);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Nombre");
            e.printStackTrace();
        }
        try {
            write(lastnameTextField, lastname);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Apellido");
            e.printStackTrace();
        }
        try {
            write(correoTextField, correo);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Correo");
            e.printStackTrace();
        }
        try {
            write(passwordTextField, password);
        } catch (TextWritingException e) {
            System.out.println("No se pudo ingresar el campo Password");
            e.printStackTrace();
        }

        write(repeatTextField, password);
    }

    public void createButton(){
        try {
            clickElement(createNewUserButton);
        } catch (NoSuchElementException e) {
            System.out.println("No se encontró el Boiton CREAR NUEVO USUARIO");
            e.printStackTrace();
        }
    }

    public String validateCreation(){
        return textFromElement(validateNewUser);
    }

}
