package motoresdebusqueda.SistemaAcuerdos.steps.Altas;

import motoresdebusqueda.SistemaAcuerdos.pageobject.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas.ConfiguracionAltaUsuario;
import motoresdebusqueda.SistemaAcuerdos.pageobject.DB.ConexionSQL;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

import java.sql.SQLException;

public class AltaDeUsuario {
   @Steps
   VisualizacionesAltas SistemaHome;
   @Steps
   ConfiguracionAltaUsuario RcAltaUsuarios;
   @Steps
   VisualizacionesAltas ver;
   @Steps
    ConexionSQL deleteUser;


    @Then("deberíamos dirigirnos ha la seccion: {string}")
    public void deberiamosDirigirnosHaLaSeccion(String AltaDeUsuario ) {
        ver.visualizarAlerAltaDeUsuario("Alta de Usuarios");

    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string} {string} {string} {string} {string} {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String NameUser, String Name, String Apellido, String DNI, String Telefono, String Direccion, String Perfil, String Contraseña) {
        RcAltaUsuarios.ingresarNombreUsuario(NameUser);
        RcAltaUsuarios.ingresarNombre(Name);
        RcAltaUsuarios.ingresarApellido(Apellido);
        RcAltaUsuarios.ingresarDni(DNI);
        RcAltaUsuarios.ingresarTelefono(Telefono);
        RcAltaUsuarios.ingresarDireccion(Direccion);
        RcAltaUsuarios.ingresarPerfil(Perfil);
        RcAltaUsuarios.ingresarContrasenia(Contraseña);
    }

    @And("le damos guardar usuario")
    public void le_damos_guardar_usuario() {
        RcAltaUsuarios.botonGuardarUsuario();
    }

    @Then("deberíamos visualizar un alert exitoso que diga: {string}")
    public void deberíamos_visualizar_un_alert_exitoso_que_diga(String string) throws SQLException {
        SistemaHome.visualizarAlerExitosoUsuario("Usuario guardado correctamente");
        deleteUser.DeleteUser();
    }

}
