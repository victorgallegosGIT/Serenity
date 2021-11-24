package motoresdebusqueda.SistemaAcuerdos.steps.Modificaciones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones.ConfiguracionModificacionDelegaciones;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones.VisualizacionesModificaciones;
import net.thucydides.core.annotations.Steps;

public class ModificacionDelegaciones {
    @Steps
    ConfiguracionModificacionDelegaciones delegacionesModificacion;
    @Steps
    VisualizacionesModificaciones  VisualizacionesModificaciones;



    @Then("deberiamos dirigirnos hasta la seccion: {string}")
    public void deberiamos_dirigirnos_hasta_la_seccion(String mensajeModificaciondelegacion) {
        VisualizacionesModificaciones.visualizarMensajeModificacionDelegacion(mensajeModificaciondelegacion);
    }
    @And("hacemos click en editar delegacion")
    public void hacemos_click_en_editar_delegacion() {
        delegacionesModificacion.ClickModificacionDelegacion();
    }
    @And("modificamos el formulario de delegacion con los siguientes datos: {string} {string}")
    public void modificamos_el_formulario_de_delegacion_con_los_siguientes_datos(String IngresarcodigoDelegacion, String delegacion) {
        delegacionesModificacion.IngresarcodigoDelegacion(IngresarcodigoDelegacion);
        delegacionesModificacion.IngresarDelegacion(delegacion);
    }
    @And("le damos guardar cambios delegacion")
    public void le_damos_guardar_cambios_delegacion() {
        delegacionesModificacion.ClickGuardarModificacionDelegacion();
    }
    @Then("visualizaremos un alert que diga: {string}")
    public void visualizaremos_un_alert_que_diga(String mensajedelegacionGuardada) {
        VisualizacionesModificaciones.visualizarMensajeCambiosGuardadosDelegacion(mensajedelegacionGuardada);
    }

}
