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

public class ConfiguracionBajaDelegaciones extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnHabilitar_0")
    WebElementFacade clichabilitarDelegacion;

    @FindBy(id = "ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnDeshabilitar_0")
    WebElementFacade clicdeshabilitarDelegacion;

    @FindBy(id = "ContentPlaceHolder1_ControlDelegaciones_btnCerrarBaja")
    WebElementFacade clicCerrarDelegacion;

    public void clicDeshabilitarDelegacion(){

        clicdeshabilitarDelegacion.click();
    }


            public List<WebElement> getButtons(String xpath) {
             return findAll(xpath).stream()
                    .map(WebElementFacade::getElement)
                    .collect(Collectors.toList());
          }

             public void ClichabilitarDelegacion()  {
            try {

                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("window.scrollBy(0,550)", "");

                List<WebElement> buttonsHabilitar = getButtons("//a[@id='ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnHabilitar_9']");
                List<WebElement> buttonsDeshabilitar = getButtons("//a[@id='ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnDeshabilitar_9']");
                if (buttonsHabilitar.size() == 0) { // si no hay ningún botón HABILITAR, entonces..
                    if (buttonsDeshabilitar.size() != 0) {
                        int lastButtonDeshabilitar = buttonsDeshabilitar.size() -1;
                        buttonsDeshabilitar.get(lastButtonDeshabilitar).click();
                        waitForRenderedElements(By.xpath("//a[@id='ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnDeshabilitar_9']"));
                        clichabilitarDelegacion.click();
                    } else throw new Exception("No hay ningun botón !");
                } else {
                    int lastButtonHabilitar = buttonsHabilitar.size() -1;
                    buttonsHabilitar.get(lastButtonHabilitar).click();
                }

            } catch (Exception e) {
                Logger.getLogger(ConfiguracionBajaTiposDeAcuerdo.class).info(e.getMessage());
            }
        }


    public void clicButtonCerrarBajaDelegacion() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarDelegacion.click();
    }
}
