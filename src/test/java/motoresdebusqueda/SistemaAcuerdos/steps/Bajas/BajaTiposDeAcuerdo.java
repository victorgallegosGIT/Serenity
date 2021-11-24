package motoresdebusqueda.SistemaAcuerdos.steps.Bajas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajas.ConfiguracionBajaTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionBajas.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaTiposDeAcuerdo {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    ConfiguracionBajaTiposDeAcuerdo bajaTipoDeAcuerdo;



    @Then("debemos visualizar la seccion: {string}")
    public void DebemosVisualizamosLaSeccion(String mensajeBajaTipodeacuerdo) {
        visualizacionesBajas.visualizarMensajeBajaDeTiposDeacuerdo(mensajeBajaTipodeacuerdo);
    }

    @And("hacemos clic en habilitar tipo de acuerdo")
    public void hacemosClicEnHabilitarTiposDeAcuerdo() {
        bajaTipoDeAcuerdo.clicHabilitarBajaTiposdeAcuerdo();
    }

    @Then("debemos ver una alerta que diga: {string}")
    public void debemosVerUnaAlertaQueDiga(String mensajeTipodeacuerdoHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeTipoDeAcuerdoHabilitado(mensajeTipodeacuerdoHabilitado);
    }
    @And("hacemos clic en deshabilitar tipo de acuerdo")
    public void hacemosClicEnDeshabilitarTiposDeacuerdos() {
        bajaTipoDeAcuerdo.clicDeshabilitarTipoDeAcuerdo();
    }

    @Then("debemos visualizar nuevamente una alerta que diga: {string}")
    public void debemosVisualizarNuevamenteUnAlertQueDiga(String mensajeTipodeacuerdoDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeTipoDeAcuerdoDeshabilitado(mensajeTipodeacuerdoDeshabilitado);
        bajaTipoDeAcuerdo.clicButtonCerrarBajaTipoDeAcuerdo();

    }

}
