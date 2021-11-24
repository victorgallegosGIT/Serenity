package motoresdebusqueda.SistemaAcuerdos.steps.Bajas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.*;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajas.ConfiguracionBajaPerfil;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionBajas.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaPerfil {
    @Steps
    SistemaDeAcuerdosLogin paginaPrincipal;
    @Steps
    VisualizacionesAltas visualizacionesAltas;
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    ConfiguracionPantallaPrincipal botonBaja;
    @Steps
    ConfiguracionBajaPerfil bajaPerfil;


    @Then("observamos la seccion: {string}")
    public void observamosLaSeccion(String mensajeBaja) {
        visualizacionesBajas.visualizarMensajeBajaDePerfiles(mensajeBaja);
    }

    @And("hacemos clic en habilitar")
    public void hacemosClicEnHabilitar() {
        bajaPerfil.clicHabilitarBajaPerfil();
    }

    @Then("debemos ver un alerta que diga: {string}")
    public void debemosVerUnAlertaQueDiga(String mensajeHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDePerfilesHabilitado(mensajeHabilitado);
    }
    @And("hacemos clic en deshabilitar")
    public void hacemosClicEnDeshabilitar() {
        bajaPerfil.clicDeshabilitarBajaPerfil();
    }

    @Then("debemos ver nuevamente un alerta que diga: {string}")
    public void debemosVerNuevamenteUnAlertaQueDiga(String mensajeDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDePerfilesDeshabilitado(mensajeDeshabilitado);
        bajaPerfil.clicButtonCerrarBajaPerfil();

    }

}
