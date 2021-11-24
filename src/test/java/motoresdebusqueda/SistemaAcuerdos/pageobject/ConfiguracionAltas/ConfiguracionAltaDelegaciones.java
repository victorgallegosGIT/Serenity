package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguracionAltaDelegaciones extends PageObject {

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_txtCodigo")
    WebElementFacade inputCodigoDelegacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_txtDelegacion")
    WebElementFacade inputNombreDlegaciones;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_btnGuardarDelegacion")
    WebElementFacade btnGuardarDelegacion;



    public void ingresarCodigoDelegacion(String CodigoDelegacion){
        inputCodigoDelegacion.type(CodigoDelegacion);
    }
    public void ingresarNombreDelegacion(String NombreDelegacion){
        inputNombreDlegaciones.type(NombreDelegacion);
    }
    public void botonGuardarDelegacion(){
        btnGuardarDelegacion.click();
    }

}
