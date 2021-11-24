package motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajas;


import jxl.common.Logger;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;



public class ConfiguracionBajaUsuario extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnHabilitar_0")
    WebElementFacade clichabilitarUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnDeshabilitar_0")
    WebElementFacade clicdeshabilitarUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_btnCancelarBaja")
    WebElementFacade clicCerrarBajaUsuario;


    public List<WebElement> getButtons(String xpath) {
        return findAll(xpath).stream()
                .map(WebElementFacade::getElement)
                .collect(Collectors.toList());

    }

    public void clicHabilitarUsuario() {
        try {

            List<WebElement> buttonsHabilitar = getButtons("//a[@id='ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnHabilitar_0']");
            List<WebElement> buttonDeshabilitar = getButtons("//a[@id='ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnDeshabilitar_0']");

            if (buttonsHabilitar.size() == 0) {
                if (buttonDeshabilitar.size() != 0) {
                    int lastButtonDeshabilitar = buttonDeshabilitar.size() - 1;
                    buttonDeshabilitar.get(lastButtonDeshabilitar).click();
                    waitForRenderedElements(By.xpath("//a[@id='ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnHabilitar_0']"));
                    clichabilitarUsuario.click();
                } else throw new Exception("no hay ningun boton");
            } else {
                int lasButtonsHabilitar = buttonsHabilitar.size() - 1;
                buttonsHabilitar.get(lasButtonsHabilitar).click();
            }

        } catch (Exception e) {
            Logger.getLogger(ConfiguracionBajaUsuario.class).info(e.getMessage());
        }

    }


    public void clicDeshabilitarUsuario() {
        clicdeshabilitarUsuario.click();
    }

    public void clicButtonCerrarBajaUsuario() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarBajaUsuario.click();
    }
}
