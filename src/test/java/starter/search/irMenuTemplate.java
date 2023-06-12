package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class irMenuTemplate {
    public static Performable irMenuGestion() {
        return Task.where("{0} accede al link menu'Gestion'",
                Click.on(accederMenuGestionTemplate.GESTION_TEMPLATE_LINK)
        );
    }
}
