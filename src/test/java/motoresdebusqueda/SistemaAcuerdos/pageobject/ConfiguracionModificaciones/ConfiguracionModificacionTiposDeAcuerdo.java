package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguracionModificacionTiposDeAcuerdo  extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_gridTiposAcuerdos_btnModificar_0")
    WebElementFacade clicEditarTipodeAcuerdo;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_txtCodigoTipoAcuerdoModificar")
    WebElementFacade codigoModificaciontipodeAcuerdo;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_txtDescripcionTipoAcuerdoModificar")
    WebElementFacade descripcionModificacionTipodeAcuerdo;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_btnModificarTipoAcuerdo")
    WebElementFacade clickGuardarCambiosTipodeacuerdo;

    public void ClickModificacionTipoDeAcuerdo() {
        clicEditarTipodeAcuerdo.click();
    }

        public void IngresarcodigoTipodeAcuerdo(String IngresarcodigoTipodeacuerdo) {
            codigoModificaciontipodeAcuerdo.type(IngresarcodigoTipodeacuerdo);
    }
    public void IngresarDescripcionTipodeAcuerdo(String IngresarDescripcionTipodeacuerdo) {
        descripcionModificacionTipodeAcuerdo.type(IngresarDescripcionTipodeacuerdo);
    }

    public void ClickGuardarModificacionTipoDeAcuerdo(){
        clickGuardarCambiosTipodeacuerdo.click();

    }

}
