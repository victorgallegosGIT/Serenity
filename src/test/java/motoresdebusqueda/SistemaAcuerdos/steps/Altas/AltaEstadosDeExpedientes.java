package motoresdebusqueda.SistemaAcuerdos.steps.Altas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas.ConfiguacionAltaEstadosDeExpedientes;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionPantallaPrincipal;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaEstadosDeExpedientes {
    @Steps
    VisualizacionesAltas SistemaHome;
    @Steps
    ConfiguracionPantallaPrincipal botonesMenu;
    @Steps
    VisualizacionesAltas ver;
    @Steps
    ConfiguacionAltaEstadosDeExpedientes esta;



    @Then("tenemos que dirigirnos hasta la seccion: {string}")
    public void TenemosQueDirigirnosHastaLaSeccion(String mensaje) {
        ver.visualizarAltaEstadosDeExpedientes("Alta de Estados de Expedientes");
    }

    @And("rellenamos el formu con los siguientes datos: {string} {string}")
    public void rellenamosElFormuConLosSiguientesDatos(String CodigoEstado, String NombreEstado) {
        esta.ingresarCodigoEstado(CodigoEstado);
        esta.ingresarNombreEstado(NombreEstado);
    }

    @And("le damos guardar estados de expedientes")
    public void leDamosGuardarEstadosDeExpedientes() {
        esta.botonGuardarEstado();

    }

    @Then("debemos visualizar un alerta que diga: {string}")
    public void debemosVisualizarUnAlertaQueDiga(String string) {
        SistemaHome.visualizarAlertEstadoDeExpedienteCreado("Estado de expediente cargado correctamente");
    }
}
