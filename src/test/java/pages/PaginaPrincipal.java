package pages;

public class PaginaPrincipal extends BasePage{

    public PaginaPrincipal(){
        super(driver);
    }
    
    public void navigateToSentraTasks(){
        navigateTo("http://192.168.80.43:10400/");
    }
}
