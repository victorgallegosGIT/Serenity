package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


@DefaultUrl("http://10.1.1.132:9791/")
public class SistemaDeAcuerdosLogin extends PageObject {


    @FindBy(css = "#txtUsuario")
    WebElementFacade inputUsuario;

    @FindBy(css = "#txtContraseña")
    WebElementFacade inputPassword;

    @FindBy(id = "btnLogin")
    WebElementFacade botonIngresar;


    @FindBy(css = "#ContentPlaceHolder1_btnConfiguracion")
    WebElementFacade botonLogInAbreModal;



    public void ingresarUsuario(String NombrePerfil) {
        inputUsuario.type(NombrePerfil);
    }

    public void ingresarPassword(String password) {
        inputPassword.type(password);
        botonIngresar.click();
    }


    public void hacerClickEnElBotonLogIn(){
        botonLogInAbreModal.click();
    }
}
