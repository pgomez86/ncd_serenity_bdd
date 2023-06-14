package gestion.modulos.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://ncd.qa.corp.intranet/GestionDeInventarioDWDM")
public class GestionDeInventarioDWDMPage extends PageObject {
    public static Target TAB_SISTEMAS_RUTAS_SPANS =  Target.the("Tab tabSistemas").locatedBy("//*[@id=\"tabSistemas\"]/a");
    public static Target INPUT_SISTEMA = Target.the("Input de sistema").located(By.id("txtNombreSistemaBusqueda"));
    public static Target LISTA_STATUS = Target.the("Combo de estados").located(By.id("ddlStatusSearch"));
    public static Target BOTON_BUSCAR = Target.the("Boton Buscar").located(By.id("btnBuscarSistema"));

}
