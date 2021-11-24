package motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionModificaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;

public class VisualizacionesModificaciones extends PageObject {
    //vista perfiles
    @FindBy(xpath = "//div[contains(text(),'Modificación de Perfiles')]")
    WebElementFacade modificacionPerfiles;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_ControlPerfiles_lblMensajeModificar']")
    WebElementFacade AlertPerfilModificado;
    //vista usuarios
    @FindBy(xpath = "//div[contains(text(),'Modificación de Usuarios')]")
    WebElementFacade modificacionUsuarios;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_ControlUsuarios_lblMensajeModificar']")
    WebElementFacade usuarioModificado;
    //vista Tipos De Acuerdo
    @FindBy(xpath = "//div[contains(text(),'Modificación de Tipos de Acuerdo')]")
    WebElementFacade AlertModificacionTipoDeAcuerdo;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_ControlTiposAcuerdo_lblMensajeModificar']")
    WebElementFacade AlertTipodeAcuerdoModificado;

     // Vista Delegaciones
    @FindBy(xpath = "//div[contains(text(),'Modificación de Delegaciones')]")
    WebElementFacade ModificacionDelegaciones;

    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblMensajeModificar")
    WebElementFacade DelegacionModificada;

    //visualizaciones Estados de Expedientes
    @FindBy(xpath = "//div[contains(text(),'Modificación de Estados de Expedientes')]")
    WebElementFacade AlertEstadosdeExpedientes;

    @FindBy(xpath = "//span[@id='ContentPlaceHolder1_ControlEstadosExpedientes_lblMensajeModificar']")
    WebElementFacade CambiosGuardadosEstadosDeExpedientes;
//
//    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")
//    WebElementFacade AlertDelegacionHabilitado;
//
//    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")
//    WebElementFacade AlertDelegacionDeshabilitado;
//
//    @FindBy(xpath = "//div[contains(text(),'Modificación de Estados de Expedientes')]")
//    WebElementFacade BajaEstadoDeExpedientes;
//
//    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")
//    WebElementFacade AlertEstadoHabilitado;
//
//    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")
//    WebElementFacade AlertEstadoDeshabilitado;
    //vista perfil
    public void visualizarmodificacionDePerfiles(String mensajeModificacion) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Perfiles')]")));
        assertThat(mensajeModificacion, Matchers.comparesEqualTo(modificacionPerfiles.getText()));
    }
    public void visualizarMensajeBajaDePerfilesModificado(String mensajeCambiosRealizados) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlPerfiles_lblMensajeModificar")));
        assertThat(mensajeCambiosRealizados, Matchers.comparesEqualTo(AlertPerfilModificado.getText()));
    }
    //vista usuarios
   public void visualizarMensajeModificacionDeUsuarios(String msjmodificacionDeUsuarios) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Usuarios')]")));
        assertThat(msjmodificacionDeUsuarios, Matchers.comparesEqualTo(modificacionUsuarios.getText()));
    }

    public void visualizarMensajeBajaDeUsuarios(String mensajeUsuariomodificado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlUsuarios_lblMensajeModificar']")));
        assertThat(mensajeUsuariomodificado, Matchers.comparesEqualTo(usuarioModificado.getText()));
    }
    //vista Tipos De Acuerdo
    public void visualizarMensajeModificacionTiposDeAcuerdo(String tipoDeAcuerdo) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Tipos de Acuerdo')]")));
        assertThat(tipoDeAcuerdo, Matchers.comparesEqualTo(AlertModificacionTipoDeAcuerdo.getText()));
    }
    public void visualizarMensajeCambiosGuardadosTiposDeAcuerdo(String tipodeAcuerdoModificado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlTiposAcuerdo_lblMensajeModificar']")));
        assertThat(tipodeAcuerdoModificado, Matchers.comparesEqualTo(AlertTipodeAcuerdoModificado.getText()));
    }
   // Vista Delegaciones
    public void visualizarMensajeModificacionDelegacion(String mensajeModificaciondelegacion) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Delegaciones')]")));
        assertThat(mensajeModificaciondelegacion, Matchers.comparesEqualTo(ModificacionDelegaciones.getText()));
    }

    public void visualizarMensajeCambiosGuardadosDelegacion(String mensajedelegacionGuardada) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlDelegaciones_lblMensajeModificar")));
        assertThat(mensajedelegacionGuardada, Matchers.comparesEqualTo(DelegacionModificada.getText()));
    }

    //visualizaciones Estados de Expedientes
    public void visualizarMensajeEstadosDeExpedientes(String mensajeEstadosDeExpedientes) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Estados de Expedientes')]")));
        assertThat(mensajeEstadosDeExpedientes, Matchers.comparesEqualTo(AlertEstadosdeExpedientes.getText()));
    }

    public void visualizarMensajeCambiosGuardadosEstadosDeExpedientes(String mensajeCambiosguardadosEstadosExpedientes) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlEstadosExpedientes_lblMensajeModificar']")));
        assertThat(mensajeCambiosguardadosEstadosExpedientes, Matchers.comparesEqualTo(CambiosGuardadosEstadosDeExpedientes.getText()));
    }
/*
    public void visualizarMensajeDelegacionHabilitado(String mensajeDelegacionHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja")));
        assertThat(mensajeDelegacionHabilitado, Matchers.comparesEqualTo(AlertDelegacionHabilitado.getText()));
    }
    public void visualizarMensajeDelegacionDeshabilitado(String mensajeDelegacionDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlDelegaciones_lblmensajeBaja']")));
        assertThat(mensajeDelegacionDeshabilitado, Matchers.comparesEqualTo(AlertDelegacionDeshabilitado.getText()));
    }

    public void visualizarMensajeBajaEstadoDeExpedientes(String mensajeBajaEstado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modificación de Estados de Expedientes')]")));
        assertThat(mensajeBajaEstado, Matchers.comparesEqualTo(BajaEstadoDeExpedientes.getText()));
    }

    public void visualizarMensajeEstadoDeExpedientesHabilitado(String mensajeEstadoHabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja")));
        assertThat(mensajeEstadoHabilitado, Matchers.comparesEqualTo(AlertEstadoHabilitado.getText()));
    }
    public void visualizarMensajeEstadoDeExpedientesDeshabilitado(String mensajeEstadoDeshabilitado) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentPlaceHolder1_ControlEstadosExpedientes_lblmensajebaja']")));
        assertThat(mensajeEstadoDeshabilitado, Matchers.comparesEqualTo(AlertEstadoDeshabilitado.getText()));
    }*/
}
