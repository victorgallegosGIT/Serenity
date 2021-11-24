package motoresdebusqueda.SistemaAcuerdos.steps.Modificaciones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones.ConfiguracionModificacionesPerfil;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones.VisualizacionesModificaciones;
import net.thucydides.core.annotations.Steps;

public class ModificacionPerfiles {
    @Steps
    ConfiguracionModificacionesPerfil ModificacionPerfil;
    @Steps
    VisualizacionesModificaciones VisualizacionesModificaciones;



    @Then("deberíamos dirigirnos ah la seccion: {string}")
    public void DeberiamosDirigirnosAhLaSeccion(String mensajeModificacion) {
        VisualizacionesModificaciones.visualizarmodificacionDePerfiles(mensajeModificacion);
    }

    @Then("hacemos clic en editar")
    public void hacemos_clic_en_editar() {
        ModificacionPerfil.clickEditarPerfil();
    }
    @And("Modificamos el formulario con los siguientes datos: {string} {string} {string}")
    public void modificamos_el_formulario_con_los_siguientes_datos(String IngresarCodigoPerfil, String IngresarNombrePerfil, String Delegaciones) {
        ModificacionPerfil.ingresarCodigoPerfilModificacion(IngresarCodigoPerfil);
        ModificacionPerfil.IngresarNombreDePerfilModificacion(IngresarNombrePerfil);
        ModificacionPerfil.ingresarDelegacionesModificacion(Delegaciones);
        ModificacionPerfil.checkBoxAdministradorModificaciones();
        ModificacionPerfil.checkboxPermisosCrear();
        ModificacionPerfil.checkboxPermisosCosultar();
        ModificacionPerfil.checkboxPermisosModificar();
    }
    @And("le damos guadar cambios")
    public void le_damos_guadar_cambios() {
        ModificacionPerfil.buttonGuardarPerfil();
    }
    @Then("debemos visualizar un alert exitoso que diga: {string}")
    public void debemos_visualizar_un_alert_exitoso_que_diga(String mensajeCambiosRealizados) {

        VisualizacionesModificaciones.visualizarMensajeBajaDePerfilesModificado(mensajeCambiosRealizados);

    }
}
