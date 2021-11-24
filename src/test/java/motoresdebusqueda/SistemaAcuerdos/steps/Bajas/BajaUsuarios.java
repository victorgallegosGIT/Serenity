package motoresdebusqueda.SistemaAcuerdos.steps.Bajas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.*;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajas.ConfiguracionBajaUsuario;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionBajas.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaUsuarios {
    @Steps
    VisualizacionesBajas visualizacionesBajas;

    @Steps
    ConfiguracionBajaUsuario bajaUsuario;


    @Then("visualizamos la seccion: {string}")
    public void VisualizamosLaSeccion(String mensajeBaja) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarios(mensajeBaja);
    }

    @And("hacemos clic en habilitar usuario")
    public void hacemosClicEnHabilitarUsuario() {
        bajaUsuario.clicHabilitarUsuario();
    }

    @Then("debemos ver un alert que diga: {string}")
    public void debemosVerUnAlertQueDiga(String mensajeUsuarioHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarioHabilitado(mensajeUsuarioHabilitado);
    }
    @And("hacemos clic en deshabilitar usuario")
    public void hacemosClicEnDeshabilitarUsuario() {
        bajaUsuario.clicDeshabilitarUsuario();
    }

    @Then("debemos ver nuevamente un alert que diga: {string}")
    public void debemosVerNuevamenteUnAlertQueDiga(String mensajeUsuarioDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarioDeshabilitado(mensajeUsuarioDeshabilitado);
        bajaUsuario.clicButtonCerrarBajaUsuario();

    }
}
