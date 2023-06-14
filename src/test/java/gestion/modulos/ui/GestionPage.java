package gestion.modulos.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://ncd.qa.corp.intranet/Gestion")
public class GestionPage extends PageObject {
    public static Target ITEM_MENU_DWDM =  Target.the("Menu Item DWDM").locatedBy("//*[@id=\"list-links-gestion\"]/li[4]/a");
}
