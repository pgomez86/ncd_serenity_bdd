package gestion.modulos.tasks;

import gestion.modulos.ui.GestionDeInventarioDWDMPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.ui.Dropdown;

public class BuscarCon {
    public static Performable ingresarDatoSistema(String text) {
        return Task.where("{0} ingresa el dato:" + text +" en sistemas",
                Enter.theValue(text).into(GestionDeInventarioDWDMPage.INPUT_SISTEMA)
        );
    }

    public static Performable seleccionarEstado(String status) {
        return Task.where("{0} selecciona el estado:" + status 
              // Click.on(Dropdown.withLabel(status))
        );
    }

    public static Performable clickBuscar() {
        return Task.where("{0} hace click en buscar",
                Click.on(GestionDeInventarioDWDMPage.BOTON_BUSCAR)
        );
    }
}
