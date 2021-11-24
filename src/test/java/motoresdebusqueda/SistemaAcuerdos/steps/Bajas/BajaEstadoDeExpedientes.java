package motoresdebusqueda.SistemaAcuerdos.steps.Bajas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajas.ConfiguracionBajaEstadoDeExpedientes;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionBajas.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaEstadoDeExpedientes {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    ConfiguracionBajaEstadoDeExpedientes bajaEstado;



    @Then("debemos visualizar a continuacion la seccion: {string}")
    public void DebemosVisualizarAContinuacionSeccion(String mensajeBajaEstado) {
        visualizacionesBajas.visualizarMensajeBajaEstadoDeExpedientes(mensajeBajaEstado);
    }

    @And("hacemos clic en habilitar estado de expedientes")
    public void hacemosClicEnHabilitarEstadoDeExpedientes() {
        bajaEstado.ClichabilitarEstadoDeExpedientes();
    }

    @Then("debemos ver la siguiente alerta que diga: {string}")
    public void debemosVerLaSiguienteAlertaQueDiga(String mensajeEstadoHabilitado) {
        visualizacionesBajas.visualizarMensajeEstadoDeExpedientesHabilitado(mensajeEstadoHabilitado);
    }
    @And("hacemos clic en deshabilitar estado de expedientes")
    public void hacemosClicEnDeshabilitarEstadoDeExpedientes() {
        bajaEstado.clicDeshabilitarEstadoDeExpedientes();
    }

    @Then("debemos visualizar la siguiente alerta que diga: {string}")
    public void debemosVisualizarLaSiguienteAlertQueDiga(String mensajeEstadoDeshabilitado) {
        visualizacionesBajas.visualizarMensajeEstadoDeExpedientesDeshabilitado(mensajeEstadoDeshabilitado);
        bajaEstado.clicButtonCerrarBajaEstadoDeExpedientes();

    }
}
