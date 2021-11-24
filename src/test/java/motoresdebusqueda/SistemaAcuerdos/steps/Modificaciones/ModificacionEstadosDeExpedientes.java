package motoresdebusqueda.SistemaAcuerdos.steps.Modificaciones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones.ConfiguracionModificacionEstadosDeExpedientes;
import net.thucydides.core.annotations.Steps;

public class ModificacionEstadosDeExpedientes {
    @Steps
    ConfiguracionModificacionEstadosDeExpedientes EstadosdeExpedientesModificacion;
    @Steps
    motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones.VisualizacionesModificaciones VisualizacionesModificaciones;





    @Then("deberiamos ir hasta la seccion: {string}")
    public void deberiamos_ir_hasta_la_seccion(String mensajeEstadosDeExpedientes) {
        VisualizacionesModificaciones.visualizarMensajeEstadosDeExpedientes(mensajeEstadosDeExpedientes);
    }
    @And("hacemos click en editar estados de expedientes")
    public void hacemos_click_en_editar_estados_de_expedientes() {
        EstadosdeExpedientesModificacion.ClickModificacionEstadosDeExpedientes();

    }
    @And("modificamos el formulario de estados de expedientes con los siguientes datos: {string} {string}")
    public void modificamos_el_formulario_de_estados_de_expedientes_con_los_siguientes_datos(String IngresarcodigoDelegacion, String delegacion) {
        EstadosdeExpedientesModificacion.IngresarCodigoExtadosDeExpedientes(IngresarcodigoDelegacion);
        EstadosdeExpedientesModificacion.IngresarEstado(delegacion);

    }
    @And("le damos guardar cambios estados de expedientes")
    public void le_damos_guardar_cambios_estados_de_expedientes() {
        EstadosdeExpedientesModificacion.ClickGuardarModificacionEstadosDeExpedientes();
    }
    @Then("visualizaremos una alerta que diga: {string}")
    public void visualizaremos_una_alerta_que_diga(String mensajeCambiosguardadosEstadosExpedientes) {
        VisualizacionesModificaciones.visualizarMensajeCambiosGuardadosEstadosDeExpedientes(mensajeCambiosguardadosEstadosExpedientes);
    }

}
