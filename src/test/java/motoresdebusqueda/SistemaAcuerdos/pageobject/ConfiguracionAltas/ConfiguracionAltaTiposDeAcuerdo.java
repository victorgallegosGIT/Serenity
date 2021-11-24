package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguracionAltaTiposDeAcuerdo extends PageObject {

    @FindBy(id = "ContentPlaceHolder1_ControlTiposAcuerdo_txtCodigo")
    WebElementFacade inputCodigo;

    @FindBy(id = "ContentPlaceHolder1_ControlTiposAcuerdo_txtAcuerdo")
    WebElementFacade inputTipoDeAcuerdo;

    @FindBy(id = "ContentPlaceHolder1_ControlTiposAcuerdo_btnGuardarTipoAcuerdo")
    WebElementFacade btnGuardarTipoDeAcuerdo;



    public void ingresarCodigoTiposDeAcuerdo(String Codigo){
        inputCodigo.type(Codigo);

    }

    public void ingresarTiposDeAcuerdo(String tipoDeAcuerdo){
        inputTipoDeAcuerdo.type(tipoDeAcuerdo);

    }
    public void botonGuardarTipoDeAcuerdo(){
        btnGuardarTipoDeAcuerdo.click();
    }






}

