package gestion.modulos.tasks;

import gestion.modulos.ui.GestionDeTemplatesPage;
import gestion.modulos.ui.GestionPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrMenu {
    public static Performable irMenuGestion() {
        return Task.where("{0} accede al link menu 'Gestion'",
                Click.on(GestionDeTemplatesPage.LINK_GESTION_TEMPLATE)
        );
    }
    public static Performable irMenuGestionModuloDWDM() {
        return Task.where("{0} accede al item menu 'Gestion de Inventario DWDM'",
                Click.on(GestionPage.ITEM_MENU_DWDM)
        );
    }
}
