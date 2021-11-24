package motoresdebusqueda.SistemaAcuerdos.pageobject;

import jxl.common.Logger;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.HashMap;

public class ConfiguracionPantallaPrincipal extends PageObject {

    public void selectMenu(String botonMenu, String botonDesplegable) {
        try {
            HashMap<String, String> botonesMenuPrincipal = new HashMap<>();
            botonesMenuPrincipal.put("ALTAS", "//*[@id='ContentPlaceHolder1_btnAltas']");
            botonesMenuPrincipal.put("BAJAS", "//*[@id='ContentPlaceHolder1_btnBajas']");
            botonesMenuPrincipal.put("MODIFICACIONES", "//*[@id='ContentPlaceHolder1_btnModificaciones']");
            botonesMenuPrincipal.put("VOLVER A INICIO", "//*[@id='ContentPlaceHolder1_btnVolver']");

            waitForRenderedElements(By.xpath(botonesMenuPrincipal.get(botonMenu)));
            getDriver().findElement(By.xpath(botonesMenuPrincipal.get(botonMenu))).click();

            switch (botonMenu) {
                case "ALTAS":
                    clickDesplegableAltas(botonDesplegable);
                    break;
                case "BAJAS":
                    clickDesplegableBajas(botonDesplegable);
                    break;
                case "MODIFICACIONES":
                    clickDesplegableModificaciones(botonDesplegable);
                    break;
                case "VOLVER A INICIO":
                    break;
                default:
                    throw new Exception(String.format("No existe ningún botón llamado: %s", botonMenu));
            }
        } catch (Exception e) {
            Logger.getLogger(ConfiguracionPantallaPrincipal.class).info(e.getMessage());
        }

    }

    public void clickDesplegableAltas(String botonDesplegable) {
        HashMap<String, String> botonesDesplegables = new HashMap<>();
        botonesDesplegables.put("PERFILES", "//*[@id='ContentPlaceHolder1_btnPerfilesAlta']");
        botonesDesplegables.put("USUARIOS", "//*[@id='ContentPlaceHolder1_btnUsuariosAlta']");
        botonesDesplegables.put("TIPOS DE ACUERDO", "//*[@id='ContentPlaceHolder1_btnTipoAcuerdoAlta']");
        botonesDesplegables.put("DELEGACIONES", "//*[@id='ContentPlaceHolder1_btnDelegacionesAlta']");
        botonesDesplegables.put("ESTADO EXPEDIENTES", "//*[@id='ContentPlaceHolder1_btnEstadoExpedienteAlta']");
        waitForRenderedElements(By.xpath(botonesDesplegables.get(botonDesplegable)));
        getDriver().findElement(By.xpath(botonesDesplegables.get(botonDesplegable))).click();
    }

    public void clickDesplegableBajas(String botonDesplegableBajas) {
        HashMap<String, String> botonesDesplegables = new HashMap<>();
        botonesDesplegables.put("PERFILES", "//input[@id='ContentPlaceHolder1_btnPerfilesBaja']");
        botonesDesplegables.put("USUARIOS", "//input[@id='ContentPlaceHolder1_btnUsuariosBaja']");
        botonesDesplegables.put("TIPOS DE ACUERDO", "//input[@id='ContentPlaceHolder1_btnTipoAcuerdoModificacion']");
        botonesDesplegables.put("DELEGACIONES", "//input[@id='ContentPlaceHolder1_btnDelegacionesModificacion']");
        botonesDesplegables.put("ESTADO EXPEDIENTES", "//input[@id='ContentPlaceHolder1_btnEstadoExpedienteModificacion']");
        waitForRenderedElements(By.xpath(botonesDesplegables.get(botonDesplegableBajas)));
        getDriver().findElement(By.xpath(botonesDesplegables.get(botonDesplegableBajas))).click();
    }

    public void clickDesplegableModificaciones(String botonDesplegableModificaciones) {
        HashMap<String, String> botonesDesplegables = new HashMap<>();
        botonesDesplegables.put("PERFILES", "//input[@id='ContentPlaceHolder1_btnPerfilesModificacion']");
        botonesDesplegables.put("USUARIOS", "//input[@id='ContentPlaceHolder1_btnUsuariosModificacion']");
        botonesDesplegables.put("TIPOS DE ACUERDO", "//input[@id='#ContentPlaceHolder1_btnTipoAcuerdoModificacion']");
        botonesDesplegables.put("DELEGACIONES", "//input[@id='ContentPlaceHolder1_btnDelegacionesModificacion']");
        botonesDesplegables.put("ESTADO EXPEDIENTES", "//input[@id='ContentPlaceHolder1_btnEstadoExpedienteModificacion']");
        waitForRenderedElements(By.xpath(botonesDesplegables.get(botonDesplegableModificaciones)));
        getDriver().findElement(By.xpath(botonesDesplegables.get(botonDesplegableModificaciones))).click();

    }
}

