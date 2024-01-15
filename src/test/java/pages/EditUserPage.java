package pages;

public class EditUserPage extends BasePage{

    public EditUserPage(){
        super(driver);
    }

    private String perfilButton = "//span[text()='Perfil']";
    private String editButton = "//button[text()='Editar Datos Usuario']";
    private String validateEdit ="//button[text()='Modificar Usuario']";
    private String passwordEdit = "//button[contains(text(),'Cambiar Contrase')]";
    private String nameTextField ="//input[@id='firstname']";
    private String lastnameTextField ="//input[@id='lastname']";
    private String emailTextField = "//input[@id='email']";
    private String validateUserEdit ="//div[contains(@class,'MuiAlert-message')]";
    private String passwordTextField = "//input[@id='password']";
    private String repeatPassTextField = "//input[@id='repeat_password']";
    private String passwordUserEdit = "(//button[contains(text(),'Cambiar Contrase')])[2]";

    public void clickProfile(){
        clickElement(perfilButton);
    }

    public void editUsserAndPass(String option){

        switch (option.toLowerCase()) {
            case "editar usuario":
                clickElement(editButton);
                break;
            
            case "editar password":
                clickElement(passwordEdit);
                break;
        }
    }

    public boolean validateWindows(String option){
        switch (option.toLowerCase()) {
            case "modificar usuario":
                return elementIsDisplayed(validateEdit);

            case "cambiar contrasena":
                return elementIsDisplayed(passwordEdit);
        }
        return false;
    }

    public String editVerification(){
        return textFromElement(validateEdit).toLowerCase();
    }

    public void writeNewCredentials(String nameEdit, String lastnameEdit, String emailEdit){
        write(nameTextField, nameEdit);
        write(lastnameTextField, lastnameEdit);
        write(emailTextField, emailEdit);
    }

    public void writeNewPassword(String password, String repeatPassword){
        write(passwordTextField, password);
        write(repeatPassTextField, repeatPassword);
    }

    public void clickModUser(String option){
        switch (option.toLowerCase()) {
            case "modificar usuario":
                clickElement(validateEdit);
                break;
            
            case "cambiar contrasena":
                clickElement(passwordUserEdit);
                break;
        }
    }
 
    public String validateEdit(){
        return textFromElement(validateUserEdit);
    }
}

