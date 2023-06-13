package gestion.modulos.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrMenuTemplate {
    public static Performable irMenuGestion() {
        return Task.where("{0} accede al link menu 'Gestion'",
                Click.on(AccederMenuGestionTemplate.GESTION_TEMPLATE_LINK)
        );
    }
}
