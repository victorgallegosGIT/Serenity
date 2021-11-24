package motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionBajas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;

public class VisualizacionesBajas extends PageObject {

    @FindBy(xpath = "//div[contains(text(),'Baja de Perfiles')]")
    WebElementFacade BajaDePerfiles;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_lblMensajeBaja")
    WebElementFacade AlertPerfilHabilitado;

    @FindBy(css = "#ContentPlaceHolder1_ControlPerfiles_lblMensajeBaja")
    WebElementFacade AlertPerfilDeshabilitado;

    @FindBy(xpath = "//div[contains(text(),'Baja de Usuarios')]")
    WebElementFacade BajaDeUsuarios;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_lblMensajeBaja")
    WebElementFacade AlertUsuarioHabilitado;

    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_lblMensajeBaja")
    WebElementFacade AlertUsuarioDeshabilitado;

    @FindBy(xpath = "//div[contains(text(),'Baja de Tipos de Acuerdo')]")
    WebElementFacade BajaDeTiposdeacuerdo;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_lblmensajebaja")
    WebElementFacade AlertTipodeacuerdoHabilitado;

    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_lblmensajebaja")
    WebElementFacade AlertTipodeacuerdoDeshabilitado;

    @FindBy(xpath = "//div[contains(text(),'Baja de Delegaciones')]")
    WebElementFacade BajaDelegaciones;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")
    WebElementFacade AlertDelegacionHabilitado;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")
    WebElementFacade AlertDelegacionDeshabilitado;

    @FindBy(xpath = "//div[contains(text(),'Baja de Estados de Expedientes')]")
    WebElementFacade BajaEstadoDeExpedientes;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")
    WebElementFacade AlertEstadoHabilitado;

    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")
    WebElementFacade AlertEstadoDeshabilitado;

    public void visualizarMensajeBajaDePerfiles(String mensajeBaja) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Baja de Perfiles')]")));
        assertThat(mensajeBaja, Matchers.comparesEqualTo(BajaDePerfiles.getText()));
    }
    public void visualizarMensajeBajaDePerfilesHabilitado(String mensajeHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlPerfiles_lblMensajeBaja")));
        assertThat(mensajeHabilitado, Matchers.comparesEqualTo(AlertPerfilHabilitado.getText()));
    }
    public void visualizarMensajeBajaDePerfilesDeshabilitado(String mensajeDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlPerfiles_lblMensajeBaja']")));
        assertThat(mensajeDeshabilitado, Matchers.comparesEqualTo(AlertPerfilDeshabilitado.getText()));
    }

    public void visualizarMensajeBajaDeUsuarios(String mensajeBajaUsuario) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Baja de Usuarios')]")));
        assertThat(mensajeBajaUsuario, Matchers.comparesEqualTo(BajaDeUsuarios.getText()));
    }

    public void visualizarMensajeBajaDeUsuarioHabilitado(String mensajeUsuarioHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlUsuarios_lblMensajeBaja")));
        assertThat(mensajeUsuarioHabilitado, Matchers.comparesEqualTo(AlertUsuarioHabilitado.getText()));
    }
    public void visualizarMensajeBajaDeUsuarioDeshabilitado(String mensajeUsuarioDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ContentPlaceHolder1_ControlUsuarios_UpdatePanel1']")));
        assertThat(mensajeUsuarioDeshabilitado, Matchers.comparesEqualTo(AlertUsuarioDeshabilitado.getText()));
    }

    public void visualizarMensajeBajaDeTiposDeacuerdo(String mensajeBajaTipodeacuerdo) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Baja de Tipos de Acuerdo')]")));
        assertThat(mensajeBajaTipodeacuerdo, Matchers.comparesEqualTo(BajaDeTiposdeacuerdo.getText()));
    }

    public void visualizarMensajeBajaDeTipoDeAcuerdoHabilitado(String mensajeTipodeacuerdoHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlTiposAcuerdo_lblmensajebaja")));
        assertThat(mensajeTipodeacuerdoHabilitado, Matchers.comparesEqualTo(AlertTipodeacuerdoHabilitado.getText()));
    }
    public void visualizarMensajeBajaDeTipoDeAcuerdoDeshabilitado(String mensajeTipodeacuerdoDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlTiposAcuerdo_lblmensajebaja']")));
        assertThat(mensajeTipodeacuerdoDeshabilitado, Matchers.comparesEqualTo(AlertTipodeacuerdoDeshabilitado.getText()));
    }

    public void visualizarMensajeBajaDelegaciones(String mensajeBajaDelegacion) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Baja de Delegaciones')]")));
        assertThat(mensajeBajaDelegacion, Matchers.comparesEqualTo(BajaDelegaciones.getText()));
    }

    public void visualizarMensajeDelegacionHabilitado(String mensajeDelegacionHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")));
        assertThat(mensajeDelegacionHabilitado, Matchers.comparesEqualTo(AlertDelegacionHabilitado.getText()));
    }
    public void visualizarMensajeDelegacionDeshabilitado(String mensajeDelegacionDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja']")));
        assertThat(mensajeDelegacionDeshabilitado, Matchers.comparesEqualTo(AlertDelegacionDeshabilitado.getText()));
    }

    public void visualizarMensajeBajaEstadoDeExpedientes(String mensajeBajaEstado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Baja de Estados de Expedientes')]")));
        assertThat(mensajeBajaEstado, Matchers.comparesEqualTo(BajaEstadoDeExpedientes.getText()));
    }

    public void visualizarMensajeEstadoDeExpedientesHabilitado(String mensajeEstadoHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")));
        assertThat(mensajeEstadoHabilitado, Matchers.comparesEqualTo(AlertEstadoHabilitado.getText()));
    }
    public void visualizarMensajeEstadoDeExpedientesDeshabilitado(String mensajeEstadoDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja']")));
        assertThat(mensajeEstadoDeshabilitado, Matchers.comparesEqualTo(AlertEstadoDeshabilitado.getText()));
    }
}
