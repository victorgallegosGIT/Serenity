package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionModificacionesPerfil extends PageObject {

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_gridPerfiles_btnModificar_9")
    WebElementFacade clicEditarPerfil;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_txtCodigoPerfilModificar")
    WebElementFacade codigoModificacionperfil;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_txtDescripcionPerfilModificar")
    WebElementFacade nombreModificacionDePerfil;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_ddlDelegacionModificar")
    WebElementFacade IngresarDelegacionModificacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkAdminModificar")
    WebElementFacade ClicCheckBoxAdministradorModificacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkInsertModificar")
    WebElementFacade ClicCheckBoxCrearModificacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkUpdateModificar")
    WebElementFacade ClickCheckBoxModificarModificacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkReadModificar")
    WebElementFacade ClicCheckBoxConsultarModificacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_btnModificarPerfil")
    WebElementFacade buttonGuardarModificacion;



    public void ingresarCodigoPerfilModificacion(String IngresarCodigoPerfil) {
        codigoModificacionperfil.type(IngresarCodigoPerfil);
    }
    public void IngresarNombreDePerfilModificacion(String IngresarNombrePerfil) {
        nombreModificacionDePerfil.type(IngresarNombrePerfil);
    }
    public void ingresarDelegacionesModificacion(String Delegaciones) {
        IngresarDelegacionModificacion.click();
        IngresarDelegacionModificacion.selectByVisibleText("LA RIOJA");


    }

    public void checkBoxAdministradorModificaciones() {
        ClicCheckBoxAdministradorModificacion.click();

    }
    public void clickEditarPerfil() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicEditarPerfil.click();

    }

    public void checkboxPermisosCrear(){

        ClicCheckBoxCrearModificacion.click();

    }

    public void checkboxPermisosModificar(){
        ClickCheckBoxModificarModificacion.click();
    }
    public void checkboxPermisosCosultar(){
        ClicCheckBoxConsultarModificacion.click();
    }

    public void buttonGuardarPerfil() {

        buttonGuardarModificacion.click();

    }

}
