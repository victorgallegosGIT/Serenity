package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguacionAltaEstadosDeExpedientes extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_txtCodigo")
    WebElementFacade inputCodigoEstado;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_txtEstadoExpediente")
    WebElementFacade inputNombreEstado;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_btnGuardarEstadoExpediente")
    WebElementFacade btnGuardarEstado;



    public void ingresarCodigoEstado(String CodigoEstado){
        inputCodigoEstado.type(CodigoEstado);
    }
    public void ingresarNombreEstado(String NombreEstado){
        inputNombreEstado.type(NombreEstado);
    }
    public void botonGuardarEstado(){
        btnGuardarEstado.click();
    }

}
