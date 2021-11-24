package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ConfiguracionModificacionEstadosDeExpedientes extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_gridEstadosExpedientes_btnModificar_0")
    WebElementFacade clicEdEstadoadeExpediente;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_txtCodigoModificar")
    WebElementFacade codigoEstadosDeExpedientes;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_txtEstadoExpedienteModificar")
    WebElementFacade EstadoModEstadosdeexpedientes;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_btnModificarEstadoExpediente")
    WebElementFacade clickGuardarCambioEstadosDeExpedientes;

    public void ClickModificacionEstadosDeExpedientes() {
        clicEdEstadoadeExpediente.click();
    }

    public void IngresarCodigoExtadosDeExpedientes(String IngresarcodigoDelegacion) {
        codigoEstadosDeExpedientes.type(IngresarcodigoDelegacion);
    }
    public void IngresarEstado(String delegacion) {
        EstadoModEstadosdeexpedientes.type(delegacion);
    }

    public void ClickGuardarModificacionEstadosDeExpedientes(){
        clickGuardarCambioEstadosDeExpedientes.click();

    }
}
