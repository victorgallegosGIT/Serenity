package motoresdebusqueda.SistemaAcuerdos.steps.Altas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas.ConfiguracionAltaDelegaciones;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionPantallaPrincipal;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaDelegaciones {
    @Steps
    VisualizacionesAltas SistemaHome;
    @Steps
    ConfiguracionPantallaPrincipal pantallaPrincipal;
    @Steps
    VisualizacionesAltas ver;
    @Steps
    ConfiguracionAltaDelegaciones dele;


    @Then("deberíamos dirigirnos hasta la seccion: {string}")
    public void DeberiamosDirigirnosHastaLaSeccion(String mensaje) {
        ver.visualizarAltaDeDelegaciones("Alta de Delegaciones");
    }

    @And("rellenamos el form con los siguientes datos: {string} {string}")
    public void rellenamosElFormConLosSiguientesDatos(String CodigoDelegacion, String NombreDelegacion) {
        dele.ingresarCodigoDelegacion(CodigoDelegacion);
        dele.ingresarNombreDelegacion(NombreDelegacion);
    }

    @And("le damos guardar delegacion")
    public void leDamosGuardarDelegacion() {
        dele.botonGuardarDelegacion();

    }

    @Then("deberíamos visualizar un alerta que diga: {string}")
    public void deberíamosVisualizarUnAlertaQueDiga(String string) {
        SistemaHome.visualizarAlertDelegacionCreada("Delegacion cargada correctamente");
    }
}
