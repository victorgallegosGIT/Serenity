package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class ConfiguracionAltaPerfil extends PageObject {


    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_txtCodigoPerfilAlta")
    WebElementFacade codigoUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_txtDescripcionPerfilAlta")
    WebElementFacade nombreDePerfil;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_ddlDelegacionAlta")
    WebElementFacade IngresarDelegacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkAdminAlta")
    WebElementFacade ClicCheckBoxAdministrador;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkInsertAlta")
    WebElementFacade ClicCheckBoxCrear;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkUpdateAlta")
    WebElementFacade ClickCheckBoxModificar;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_chkQueryAlta")
    WebElementFacade ClicCheckBoxConsultar;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_ddlDelegacionAlta")
    WebElementFacade AltaDePerfilesTitulo;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_btnGuardarPerfil")
    WebElementFacade buttonGuardar;



    public void ingresarCodigoPerfil(String IngresarCodigoPerfil) {
        codigoUsuario.type(IngresarCodigoPerfil);
    }
    public void IngresarNombreDePerfil(String IngresarNombrePerfil) {
        nombreDePerfil.type(IngresarNombrePerfil);
    }
    public void ingresarDelegaciones(String Delegaciones) {
        IngresarDelegacion.click();

       IngresarDelegacion.selectByVisibleText("LA RIOJA");
    }
    public void CardHeaderAltaDePerfil(){
        AltaDePerfilesTitulo.selectByVisibleText("Alta de Perfiles");

    }
    public void checkBoxAdministrador() {
        ClicCheckBoxAdministrador.click();

    }

    public void checkboxPermisosCrear(){

        ClicCheckBoxCrear.click();

    }

    public void checkboxPermisosModificar(){
        ClickCheckBoxModificar.click();
    }
    public void checkboxPermisosCosultar(){
        ClicCheckBoxConsultar.click();
    }

    public void buttonGuardarPerfil() {
        buttonGuardar.click();

    }

}
