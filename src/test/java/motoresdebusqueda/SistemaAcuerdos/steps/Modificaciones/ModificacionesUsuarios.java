package motoresdebusqueda.SistemaAcuerdos.steps.Modificaciones;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionModificaciones.ConfiguracionModificacionUsuarios;
import net.thucydides.core.annotations.Steps;

public class ModificacionesUsuarios {
    @Steps
    ConfiguracionModificacionUsuarios Modificacionusuarios;
    @Steps
    motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones.VisualizacionesModificaciones VisualizacionesModificaciones;







    @Then("debemos dirigirnos ah la seccion: {string}")
    public void DeberiamosDirigirnosAhLaSeccion(String msjmodificacionDeUsuarios) {
        VisualizacionesModificaciones.visualizarMensajeModificacionDeUsuarios(msjmodificacionDeUsuarios);
    }

    @Then("hacemos clic en editar usuario")
    public void hacemos_clic_en_editar_usuario() {
        Modificacionusuarios.ClickModificacionUsuario();
    }
    @And("Modificamos el formulario de usuario con los siguientes datos: {string} {string} {string} {string} {string} {string} {string} {string}")
    public void modificamos_el_formulario_de_usuario_con_los_siguientes_datos(String IngresarNombreUsuario, String nombreusuario, String apellidousuario, String dniusuario, String telefonousuario, String direccionusuario, String perfiles, String contraseña) {
        Modificacionusuarios.IngresarNombredeusuario(IngresarNombreUsuario);
        Modificacionusuarios.IngresarNombreUsuario(nombreusuario);
        Modificacionusuarios.IngresarApellidoUsuario(apellidousuario);
        Modificacionusuarios.IngresarDniUsuario(dniusuario);
        Modificacionusuarios.IngresarTelefonoUsuario(telefonousuario);
        Modificacionusuarios.IngresarDireccionUsuario(direccionusuario);
        Modificacionusuarios.SeleccionarPerfildeUsuario(perfiles);
        Modificacionusuarios.checkboxCambiarContraseña();
        Modificacionusuarios.IngresarContraseña(contraseña);

    }
    @And("click guadar cambios")
    public void click_guadar_cambios() {
        Modificacionusuarios.buttonGuardarModificacionUsuario();
    }
    @Then("visualizamos alerta exitoso que diga: {string}")
    public void visualizamos_alerta_exitoso_que_diga(String mensajeUsuariomodificado) {

        VisualizacionesModificaciones.visualizarMensajeBajaDeUsuarios(mensajeUsuariomodificado);
        Modificacionusuarios.buttonCerrarModificacionUsuario();
     }
    }
