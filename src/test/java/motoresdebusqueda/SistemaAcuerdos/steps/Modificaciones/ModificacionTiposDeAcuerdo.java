package motoresdebusqueda.SistemaAcuerdos.steps.Modificaciones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones.ConfiguracionModificacionTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones.VisualizacionesModificaciones;
import net.thucydides.core.annotations.Steps;

public class ModificacionTiposDeAcuerdo {
    @Steps
    ConfiguracionModificacionTiposDeAcuerdo TiposdeAcuerdoModificacion;
    @Steps
    VisualizacionesModificaciones VisualizacionesModificaciones;





    @Then("deberiamos dirigirnos hacia la seccion: {string}")
    public void deberiamos_dirigirnos_hacia_la_seccion(String tipoDeAcuerdo) {
        VisualizacionesModificaciones.visualizarMensajeModificacionTiposDeAcuerdo(tipoDeAcuerdo);
    }

    @Then("hacemos click en editar tipo de acuerdo")
    public void hacemos_clic_en_editar_tipo_de_acuerdo() {
        TiposdeAcuerdoModificacion.ClickModificacionTipoDeAcuerdo();
    }
    @And("modificamos el formulario con los siguientes datos: {string} {string}")
    public void modificamos_el_formulario_con_los_siguientes_datos(String IngresarcodigoTipodeacuerdo, String IngresarDescripcionTipodeacuerdo) {
        TiposdeAcuerdoModificacion.IngresarcodigoTipodeAcuerdo(IngresarcodigoTipodeacuerdo);
        TiposdeAcuerdoModificacion.IngresarDescripcionTipodeAcuerdo(IngresarDescripcionTipodeacuerdo);
    }
    @And("le damos guardar cambios tipo de acuerdo")
    public void le_damos_guardar_cambios_tipo_de_acuerdo() {
        TiposdeAcuerdoModificacion.ClickGuardarModificacionTipoDeAcuerdo();
    }
    @Then("debemos visualizar un alert que diga: {string}")
    public void debemos_visualizar_un_alert_que_diga(String tipodeAcuerdoModificado) {
        VisualizacionesModificaciones.visualizarMensajeCambiosGuardadosTiposDeAcuerdo(tipodeAcuerdoModificado);
    }

}
