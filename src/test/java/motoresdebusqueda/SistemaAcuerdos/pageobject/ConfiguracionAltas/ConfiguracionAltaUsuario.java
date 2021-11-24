package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class ConfiguracionAltaUsuario extends PageObject {


    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtUsername")
    WebElementFacade inputNombreUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtUsername")
    WebElementFacade clicenNombreUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtNombre")
    WebElementFacade inputNombre;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtApellido")
    WebElementFacade inputApellido;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtDNI")
    WebElementFacade inputDni;
    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtTelefono")
    WebElementFacade inputTelefono;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtDireccion")
    WebElementFacade inputDireccion;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_ddlperfiles")
    WebElementFacade botonPerfil;
    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_ddlperfiles")
    WebElementFacade inputPerfil;

    //para clic ContentPlaceHolder1_ControlUsuarios_ddlperfiles

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_txtContraseña")
    WebElementFacade inputContrasenia;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_btnGuardarUsuario")
    WebElementFacade botonGuardar;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_ddlperfiles")
    WebElementFacade IngresarPerfil;
    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_btnGuardarUsuario")
    WebElementFacade botonGuardarUsuarios;


    public void ingresarNombreUsuario(String NameUser) {
        inputNombreUsuario.type(NameUser);

    }

    public void ingresarNombre(String nombre) {
        inputNombre.type(nombre);
    }

    public void ingresarApellido(String apellido) {
        inputApellido.type(apellido);
    }

    public void ingresarDni(String DNI) {
        inputDni.type(DNI);
    }

    public void ingresarTelefono(String telefono) {
        inputTelefono.type(telefono);
    }

    public void ingresarDireccion(String direccion) {
        inputDireccion.type(direccion);
    }

    public void ingresarPerfil(String Perfil) {
        botonPerfil.click();
        IngresarPerfil.selectByVisibleText("ADMINISTRADOR");

    }

    // public void botonPerfil() {
    //  botonPerfil.click();

    //}
    public void ingresarContrasenia(String usuario) {
        inputContrasenia.type(usuario);
        //botonGuardar.click();
    }
    public void botonGuardarUsuario() {
        botonGuardarUsuarios.click();
    }

    //public void visualizaAlertExitoso(String msg) {
      //  waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlUsuarios_lblMensajeModificar")));
       //  assertThat(visualizaAlertExitoso("Usuario guardado correctamente"));

}

















   /* @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElementFacade purchaseButton;

    @FindBy(css = "div.sweet-alert h2")
    WebElementFacade sweetAlertExitoso;

    public void addInformationToBuy(String ... datos){
       // waitFor(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ControlUsuarios_UpnlMessage")));
        List<String> elementsList = new ArrayList<String>();

        do{
            elementsList.add("ContentPlaceHolder1_ControlUsuarios_txtApellido");
            elementsList.add("ContentPlaceHolder1_ControlUsuarios_txtUsername']");
            elementsList.add("//input[@id='city']");
            elementsList.add("//input[@id='card']");
            elementsList.add("//input[@id='month']");
            elementsList.add("//input[@id='year']");
        }while(false);

        AtomicInteger datosIterator = new AtomicInteger();
        elementsList.forEach(element -> findBy(element).type(datos[datosIterator.getAndIncrement()]));

    }

    public void hacerClickEnPurchase(){
        findBy("//button[contains(text(),'Purchase')]").click();
    }



    public void validarMontoTotal(int totalPrice, int large){
        assertThat(totalPrice, Matchers.comparesEqualTo(getCurrentlyPrice(large)));
    }

    public int getCurrentlyPrice(int large){
        return Integer.parseInt(findBy("div.sweet-alert p.text-muted").getText().substring(20, 20+large));
    }

}
*/