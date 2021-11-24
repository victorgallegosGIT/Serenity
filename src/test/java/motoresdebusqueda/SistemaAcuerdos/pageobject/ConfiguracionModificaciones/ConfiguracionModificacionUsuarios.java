package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionModificacionUsuarios  extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_gridUsuarios_btnModificar_0")
    WebElementFacade clicEditarUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtUsernameModificacion")
    WebElementFacade nombredeUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtNombreModificacion")
    WebElementFacade nombreUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtApellidoModificacion")
    WebElementFacade apellidoUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtDNIModificacion")
    WebElementFacade dniUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtTelefonoModificacion")
    WebElementFacade telefonoUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtDireccionModificacion")
    WebElementFacade direccionUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_ddlperfilesModificacion")
    WebElementFacade seleccionarPerfil;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_chkContraseñaNueva")
    WebElementFacade ClicCheckBoxCambiarContraseña;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_txtContraseñaModificacion")
    WebElementFacade modificarContraseña;

    //lick cerrar#ContentPlaceHolder1_ControlUsuarios_btnCerrarModificar

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_btnGuardarUsuarioModificacion")
    WebElementFacade buttonGuardarModificacionUsuario;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_btnCerrarModificar")
    WebElementFacade buttoncerrarmodificacionUsuario;

    public void ClickModificacionUsuario() {
        clicEditarUsuario.click();
    }
    public void IngresarNombredeusuario(String IngresarNombreUsuario) {
        nombredeUsuario.type(IngresarNombreUsuario);
    }
    public void SeleccionarPerfildeUsuario(String perfiles) {
        seleccionarPerfil.click();
        seleccionarPerfil.selectByVisibleText("ADMINISTRADOR");

    }

    public void IngresarNombreUsuario(String nombreusuario) {
        nombreUsuario.type(nombreusuario);
    }
    public void IngresarDniUsuario(String dniusuario) {
        dniUsuario.type(dniusuario);
    }

    public void IngresarTelefonoUsuario(String telefonousuario) {
        telefonoUsuario.type(telefonousuario);
    }

    public void IngresarDireccionUsuario(String direccionusuario) {
        direccionUsuario.type(direccionusuario);
    }

    public void IngresarApellidoUsuario(String apellidousuario) {
        apellidoUsuario.type(apellidousuario);
    }

    public void checkboxCambiarContraseña(){
        ClicCheckBoxCambiarContraseña.click();

    }
    public void IngresarContraseña(String contraseña) {
        modificarContraseña.type(contraseña);
    }

    public void buttonGuardarModificacionUsuario() {
        buttonGuardarModificacionUsuario.click();
    }

    public void buttonCerrarModificacionUsuario() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        buttoncerrarmodificacionUsuario.click();
    }
}
