package motoresdebusqueda.SistemaAcuerdos.steps.Altas;

import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas.ConfiguracionAltaPerfil;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionPantallaPrincipal;
import motoresdebusqueda.SistemaAcuerdos.pageobject.DB.ConexionSQL;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.SistemaDeAcuerdosLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

public class AltaDePerfil {
    @Steps
    SistemaDeAcuerdosLogin paginaPrincipal;
   @Steps
   VisualizacionesAltas visualizacionesAltas;
   @Steps
    ConfiguracionPantallaPrincipal menuBotones;
   @Steps
   ConfiguracionAltaPerfil AltaPerfil;
    @Steps
    ConexionSQL deletePerfil;

    @Given("nos encontramos en la pagina principal de Sistema de Acuerdos")
    public void NosEncontramosEnlaPaginaPrincipalDeSistemaDeAcuerdos() {
        paginaPrincipal.setDefaultBaseUrl("http://10.1.1.132:9791/");
        paginaPrincipal.open();
    }

    @When("nos logueamos rellenando el modal con los siguientes datos: {string} {string}")
    public void ingresaUsuarioYPassword(String usuario, String password) {
        paginaPrincipal.ingresarUsuario(usuario);
        paginaPrincipal.ingresarPassword(password);
        paginaPrincipal.hacerClickEnElBotonLogIn();
    }

    @Then("deberíamos visualizar el mensaje de bienvenida: {string}")
      public void deberiaVisualizarElMensajeDeBienvenida(String mensaje) {
        visualizacionesAltas.visualizarMensajeDeBienvenida(mensaje);
      }
    //el usuario selecciona el boton "ALTAS" y el desplegable "USUARIOS"
    @When("el usuario selecciona el boton {string} y el desplegable {string}")
    public void cuandoElUsuarioSeleccionaElBoton(String botonMenu, String botonDesplegable) {
       menuBotones.selectMenu(botonMenu, botonDesplegable);
    }

    @Then("deberíamos dirigirnos hacia la seccion: {string}")
    public void deberiamosDirigirnosHaciaLaSeccion(String mensajealta) {
        visualizacionesAltas.visualizarMensajeAltaDePerfiles(mensajealta);
    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String CodigoPerfil, String NombreDePerfil, String Delegacion) {
        AltaPerfil.ingresarCodigoPerfil(CodigoPerfil);
        AltaPerfil.IngresarNombreDePerfil(NombreDePerfil);
        AltaPerfil.ingresarDelegaciones(Delegacion);
        AltaPerfil.checkBoxAdministrador();
        AltaPerfil.checkboxPermisosCrear();
        //AltaPerfil.checkboxPermisosCosultar();
        //AltaPerfil.checkboxPermisosModificar();
    }

    @And("le damos guadar perfil")
    public void le_damos_guadar_perfil() {
        AltaPerfil.buttonGuardarPerfil();
    }
    @Then("deberíamos visualizar una alerta que diga: {string}")
        public void debemos_visualizar_un_alert_que_diga(String mensaje){
            visualizacionesAltas.perfilCreado(mensaje);
            deletePerfil.DeletePerfil();
    }


}