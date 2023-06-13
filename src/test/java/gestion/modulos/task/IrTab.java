package gestion.modulos.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IrTab {
    public static Performable irTabSistemaRutaSpan() {
        return Task.where("{0} accede al tab 'Sistemas/Rutas/Spans'",
                Click.on(AccederTabSistemaRutasSpans.TAB_SISTEMAS_RUTAS_SPANS)
        );
    }

}
