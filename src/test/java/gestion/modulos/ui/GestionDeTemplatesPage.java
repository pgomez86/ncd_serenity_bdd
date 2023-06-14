package gestion.modulos.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://ncd.qa.corp.intranet/GestionDeTemplates")
public class GestionDeTemplatesPage extends PageObject {
    public static Target LINK_GESTION_TEMPLATE = Target.the("link Gestion").locatedBy("//*[@id=\"second-nav\"]/div/ul/li[4]/a");

}
