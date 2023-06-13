package gestion.modulos.task;

import gestion.modulos.ui.GestionDeInventarioDWDMPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;

public class BuscarCon {
    public static Performable ingresarDatoSistema(String text) {
        return Task.where("{0} ingresa el dato {1} en sistemas",
                Enter.theValue(text).into(GestionDeInventarioDWDMPage.INPUT_SISTEMA)
        );
    }
    public static Performable irMenuGestionModuloDWDM() {
        return Task.where("{0} accede al item menu 'Gestion de Inventario DWDM'",
                Click.on(AccederMenuModulo.ITEM_MENU_DWDM)
        );
    }
}
