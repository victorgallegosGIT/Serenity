package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguracionModificacionDelegaciones extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_gridDelegaciones_btnModificar_0")
    WebElementFacade clicEditarDelegacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_txtCodigoDelegacionModificar")
    WebElementFacade codigoModificacionDelegacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_txtNombreDelegacionModificar")
    WebElementFacade delegacionCampoDelegacion;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_btnModificarDelegacion")
    WebElementFacade clickGuardarCambioDelegacion;

    public void ClickModificacionDelegacion() {
        clicEditarDelegacion.click();
    }

    public void IngresarcodigoDelegacion(String IngresarcodigoDelegacion) {
        codigoModificacionDelegacion.type(IngresarcodigoDelegacion);
    }
    public void IngresarDelegacion(String delegacion) {
        delegacionCampoDelegacion.type(delegacion);
    }

    public void ClickGuardarModificacionDelegacion(){
        clickGuardarCambioDelegacion.click();

    }
}
