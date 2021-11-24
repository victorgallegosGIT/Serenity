package motoresdebusqueda.SistemaAcuerdos.steps.Altas;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas.ConfiguracionAltaTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionPantallaPrincipal;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaTiposDeAcuerdo {
    @Steps
    VisualizacionesAltas SistemaHome;
    @Steps
    ConfiguracionAltaTiposDeAcuerdo tipo;
    @Steps
    VisualizacionesAltas ver;
    @Steps
    ConfiguracionPantallaPrincipal pantallaPrincipal;




    @Then("debemos dirigirnos hacia la seccion: {string}")
    public void debemosDirigirnosHaciaLaSeccion(String mensaje) {
        ver.visualizarAltaTiposDeAcuerdo("Alta Tipos de Acuerdo");
    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String Codigo, String TipoDeAcuerdo) {
        tipo.ingresarCodigoTiposDeAcuerdo(Codigo);
        tipo.ingresarTiposDeAcuerdo(TipoDeAcuerdo);
    }

    @And("le damos guardar tipo de acuerdo")
    public void leDamosGuardarTipoDeAcuerdo() {
        tipo.botonGuardarTipoDeAcuerdo();

    }

    @Then("deberíamos visualizar un alert que diga: {string}")
    public void deberíamosVisualizarUnAlertQueDiga(String string) {
        SistemaHome.visualizarAltaTiposDeAcuerdoRegistrado("Tipo Acuerdo registrado correctamente");
    }

}
