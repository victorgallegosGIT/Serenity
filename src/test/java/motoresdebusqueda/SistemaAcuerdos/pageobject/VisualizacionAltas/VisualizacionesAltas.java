package motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionAltas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class VisualizacionesAltas extends PageObject {
    @FindBy(xpath = "//span[contains(text(),'SISTEMA ACUERDOS')]")
    WebElementFacade welcomeMessage;

    @FindBy(xpath = "//div[contains(text(),'Alta de Perfiles')]")
    WebElementFacade AltaDePerfiles;

    @FindBy(xpath = "//div[contains(text(),'Alta de Usuarios')]")
    WebElementFacade AltaDeUsuarios;

    @FindBy(xpath = "//div[contains(text(),'Alta Tipos de Acuerdo')]")
    WebElementFacade AltaTiposDeAcuerdo;

    @FindBy(xpath = "//div[contains(text(),'Alta de Delegaciones')]")
    WebElementFacade AltaDeDelegaciones;

    @FindBy(xpath = "//div[contains(text(),'Alta de Estados de Expedientes')]")
    WebElementFacade AltaDeEstadosDeExpedintes;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_lblMensajeModificar")
    WebElementFacade UsuarioCargadoCorrectamente;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_lblmessage")
    WebElementFacade TipoAcuerdoRegistradoCorrectamente;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblmessage")
    WebElementFacade AlertDelegacionesCreadaCorrectamente;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_lblmessage")
    WebElementFacade AlertEstadoDeExpedienteCreado;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_lblMensajeModificar")
    WebElementFacade PerfilCreado;



    public void visualizarMensajeDeBienvenida(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'SISTEMA ACUERDOS')]")));
        assertThat(mensaje, Matchers.comparesEqualTo(welcomeMessage.getText()));
    }

    public void visualizarMensajeAltaDePerfiles(String mensajealta) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Alta de Perfiles')]")));
        assertThat(mensajealta, Matchers.comparesEqualTo(AltaDePerfiles.getText()));
    }
    public void visualizarAlerAltaDeUsuario(String mensajeAltaUsuario) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Alta de Usuarios')]")));
        assertThat(mensajeAltaUsuario, Matchers.comparesEqualTo(AltaDeUsuarios.getText()));
    }
    public void visualizarAlerExitosoUsuario(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlUsuarios_lblMensajeModificar")));
        assertThat(mensaje, Matchers.comparesEqualTo(UsuarioCargadoCorrectamente.getText()));
    }
    public void visualizarAltaDeDelegaciones(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Alta de Delegaciones')]")));
        assertThat(mensaje, Matchers.comparesEqualTo(AltaDeDelegaciones.getText()));
    }
    public void visualizarAlertDelegacionCreada(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlDelegaciones_lblmessage")));
        assertThat(mensaje, Matchers.comparesEqualTo(AlertDelegacionesCreadaCorrectamente.getText()));
    }

    public void visualizarAltaTiposDeAcuerdo(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Alta Tipos de Acuerdo')]")));
        assertThat(mensaje, Matchers.comparesEqualTo(AltaTiposDeAcuerdo.getText()));
    }
    public void visualizarAltaTiposDeAcuerdoRegistrado(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlTiposAcuerdo_lblmessage")));
        assertThat(mensaje, Matchers.comparesEqualTo(TipoAcuerdoRegistradoCorrectamente.getText()));
    }

    public void visualizarAltaEstadosDeExpedientes(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Alta de Estados de Expedientes')]")));
        assertThat(mensaje, Matchers.comparesEqualTo(AltaDeEstadosDeExpedintes.getText()));
    }
    public void visualizarAlertEstadoDeExpedienteCreado(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlEstadosExpedientes_lblmessage")));
        assertThat(mensaje, Matchers.comparesEqualTo(AlertEstadoDeExpedienteCreado.getText()));
    }

    public void perfilCreado(String mensaje) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlPerfiles_lblMensajeModificar")));
        assertThat(mensaje, Matchers.comparesEqualTo(PerfilCreado.getText()));
    }

















    /*


    public List<Integer> ListOfPrices(){
        return findAll(ProductPrice)
                .stream()
                .map(element -> Integer.parseInt(element.getText().substring(1)))
                .collect(Collectors.toList());
    }

    /*public void addToCart(List<String> ListOfNames){
        for (String productName: ListOfNames) {
            if (findBy("//a[contains(text(),'" + productName + "')]").isClickable()) {
                findBy("//a[contains(text(),'" + productName + "')]").click();
                cart.botonAlta();
                waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Home')]")));
                backToHome();
            }
        }

        /*ListOfPrices.forEach(element ->
                (findBy("//a[contains(text(),'" + element + "')]").isClickable())
                ? findBy("//a[contains(text(),'" + element + "')]").click()
                : findBy("//a[contains(text(),'Home')]").click()
        );
    }*/

        // private void backToHome(){
        //  findBy("//a[contains(text(),'Home')]").click();
        //}


    }
